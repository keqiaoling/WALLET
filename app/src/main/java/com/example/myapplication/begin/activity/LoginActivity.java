package com.example.myapplication.begin.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.begin.DownloadService;
import com.example.myapplication.begin.bean.LoginBean;
import com.example.myapplication.faxian.activity.FaXianWebActivity;
import com.example.myapplication.okhttp.OkHttpUtils;
import com.example.myapplication.okhttp.callback.ResponseCallBack;
import com.example.myapplication.okhttp.callback.ResultModelCallback;
import com.example.myapplication.utils.MobilePhoneDeviceInfo;
import com.example.myapplication.utils.SharedPreferenceUtils;
import com.example.myapplication.zichan.bean.UpdateBean;

import org.json.JSONException;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.OnClick;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class LoginActivity extends BaseActivity {

    @BindView(R.id.lin_yuYan)
    LinearLayout linYuYan;
    @BindView(R.id.ed_phone)
    EditText edPhone;
    @BindView(R.id.ed_pass)
    EditText edPass;
    @BindView(R.id.text_yuyan)
    TextView textYuyan;
    @BindView(R.id.text_guoJia)
    TextView textGuoJia;
    @BindView(R.id.text_code)
    TextView textCode;

    private boolean mPass = true;
    private TextView mText_title;//版本更新内容
    private String strVersionName;//版本号
    private PopupWindow mPop;
    private TextView mText_version;
    private String mDown_url;

    private DownloadService.DownloadBinder mDownloadBinder;
    private Disposable mDisposable;//

    private ServiceConnection mConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            mDownloadBinder = (DownloadService.DownloadBinder) service;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            mDownloadBinder = null;
        }
    };
    private PopupWindow mYuYanPop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(LoginActivity.this, DownloadService.class);
        startService(intent);
        bindService(intent, mConnection, BIND_AUTO_CREATE);//绑定服务
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        strVersionName = MobilePhoneDeviceInfo.getVersionName(this);
        yuYanPop();
        updatePop();
        update();
    }

    private void yuYanPop() {
        View inflate = LayoutInflater.from(LoginActivity.this).inflate(R.layout.pop_yuyan, null);
        TextView text_china = inflate.findViewById(R.id.text_china);
        TextView text_english = inflate.findViewById(R.id.text_english);
        TextView text_japan = inflate.findViewById(R.id.text_japan);
        TextView text_korea = inflate.findViewById(R.id.text_korea);
        mYuYanPop = new PopupWindow(inflate, ViewPager.MarginLayoutParams.WRAP_CONTENT, ViewPager.MarginLayoutParams.WRAP_CONTENT);
        inflate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mYuYanPop.dismiss();
            }
        });

        text_china.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textYuyan.setText(text_china.getText().toString());
                mYuYanPop.dismiss();
            }
        });

        text_english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textYuyan.setText(text_english.getText().toString());
                mYuYanPop.dismiss();
            }
        });

        text_japan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textYuyan.setText(text_japan.getText().toString());
                mYuYanPop.dismiss();
            }
        });

        text_korea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textYuyan.setText(text_korea.getText().toString());
                mYuYanPop.dismiss();
            }
        });
    }

    private void updatePop() {
        View inflate = LayoutInflater.from(LoginActivity.this).inflate(R.layout.pop_update, null);
        mText_title = inflate.findViewById(R.id.text_title);
        mText_version = inflate.findViewById(R.id.text_version);
        TextView text_update = inflate.findViewById(R.id.text_update);
        mPop = new PopupWindow(inflate, ViewGroup.MarginLayoutParams.MATCH_PARENT, ViewGroup.MarginLayoutParams.MATCH_PARENT);

        text_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPop.dismiss();
                Log.e("下载地址", "onClick: " + mDown_url);
                long downloadId = mDownloadBinder.startDownload(mDown_url);
                startCheckProgress(downloadId);
            }
        });
    }

    private void update() {
        OkHttpUtils.post()
                .url(ZgwApplication.appRequestUrl + "v1/app_update")
                .addHeader("X-Requested-With", "XMLHttpReques")
                .build()
                .execute(new ResultModelCallback(LoginActivity.this, new ResponseCallBack<UpdateBean>() {
                    @Override
                    public void onError(String e) {

                    }

                    @Override
                    public void onResponse(UpdateBean response) throws JSONException {
                        if (!strVersionName.equals(response.getData().getAndroid_version())) {
                            mText_version.setText("V" + response.getData().getAndroid_version());
                            mText_title.setText(response.getData().getDesc());
                            mDown_url = response.getData().getAndroid_url();
                            mPop.showAsDropDown(mText_title, 0, 0);
                        }
                    }
                }));
    }

    private void login() {
        OkHttpUtils.post()
                .url(ZgwApplication.appRequestUrl + "v1/auth/login")
                .addHeader("X-Requested-With", "XMLHttpReques")
                .addParams("phone", edPhone.getText().toString())
                .addParams("password", edPass.getText().toString())
                .build()
                .execute(new ResultModelCallback(this, new ResponseCallBack<LoginBean>() {
                    @Override
                    public void onError(String e) {
                        Toast.makeText(LoginActivity.this, e, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(LoginBean response) throws JSONException {
                        SharedPreferenceUtils.setToken(response.getData().getToken());
                        SharedPreferenceUtils.setName(edPhone.getText().toString());
                        SharedPreferenceUtils.setPass(edPass.getText().toString());
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
                        finish();
                    }
                }));
    }

    public void start(String url) {
        Intent intent = new Intent(LoginActivity.this, FaXianWebActivity.class);
        intent.putExtra("url", url);
        startActivity(intent);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mDisposable != null) {
            //取消监听
            mDisposable.dispose();
        }
    }

    //开始监听进度
    private void startCheckProgress(long downloadId) {
        Observable
                .interval(100, 200, TimeUnit.MILLISECONDS, Schedulers.io())//无限轮询,准备查询进度,在io线程执行
                .filter(times -> mDownloadBinder != null)
                .map(i -> mDownloadBinder.getProgress(downloadId))//获得下载进度
                .takeUntil(progress -> progress >= 100)//返回true就停止了,当进度>=100就是下载完成了
                .distinct()//去重复
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new ProgressObserver());
    }

    @OnClick({R.id.lin_yuYan, R.id.lin_quHao, R.id.text_email, R.id.text_forget, R.id.text_login, R.id.lin_register, R.id.image_delete})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.lin_yuYan://语言切换
                mYuYanPop.showAsDropDown(linYuYan);
                break;
            case R.id.lin_quHao://国家区号
                Intent intent = new Intent(LoginActivity.this, QuHaoActivity.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.text_email://邮箱登录
                startActivity(new Intent(LoginActivity.this, EmailLoginActivity.class));
                break;
            case R.id.text_forget://忘记密码
                startActivity(new Intent(LoginActivity.this, ForgetActivity.class));
                break;
            case R.id.text_login://登录
                login();
                break;
            case R.id.lin_register://注册
                startActivity(new Intent(LoginActivity.this, PhoneRegisterActivity.class));
                break;
            case R.id.image_delete://账号输入框的x
                edPhone.setText("");
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==2){
            if(data.getStringExtra("name")!=null){
                String name = data.getStringExtra("name");
                String code = data.getStringExtra("code");
                textGuoJia.setText(name);
                textCode.setText(code);
            }
        }
    }

    //观察者
    private class ProgressObserver implements Observer<Integer> {

        @Override
        public void onSubscribe(Disposable d) {
            mDisposable = d;
        }

        @Override
        public void onNext(Integer progress) {
            Log.d("llllll", "onNext: " + progress);
        }

        @Override
        public void onError(Throwable throwable) {
            throwable.printStackTrace();
            Toast.makeText(LoginActivity.this, R.string.toast_chuchuo, Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onComplete() {
            Toast.makeText(LoginActivity.this, R.string.toast_xzwc, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }
}
