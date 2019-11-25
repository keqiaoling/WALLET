package com.example.myapplication.faxian.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.begin.bean.CodeBean;
import com.example.myapplication.faxian.bean.HeYueInfoBean;
import com.example.myapplication.faxian.bean.HeYueListBean;
import com.example.myapplication.okhttp.OkHttpUtils;
import com.example.myapplication.okhttp.callback.ResponseCallBack;
import com.example.myapplication.okhttp.callback.ResultModelCallback;
import com.example.myapplication.utils.SharedPreferenceUtils;

import org.json.JSONException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SanShiTianActivity extends BaseActivity {

    @BindView(R.id.back)
    ImageButton back;
    @BindView(R.id.text_cheXiao)
    TextView textCheXiao;
    @BindView(R.id.text_qianDao)
    TextView textQianDao;
    @BindView(R.id.text_name)
    TextView textName;
    @BindView(R.id.text_name2)
    TextView textName2;
    @BindView(R.id.text_number)
    TextView textNumber;
    @BindView(R.id.lin_anniu)
    LinearLayout linAnniu;
    @BindView(R.id.text_type)
    TextView textType;
    private TextView mText_zhidao;
    private PopupWindow mQiandaoPop;
    private PopupWindow mCancelPop;
    private TextView mText_quxiao;
    private int mId;

    @Override
    protected void initView() {
        popCancel();
        popQianDao();
        info();
    }

    private void info() {
        OkHttpUtils.get()
                .url(ZgwApplication.appRequestUrl + "v1/contract/myContracts/"+getIntent().getStringExtra("id"))
                .addHeader("Authorization", SharedPreferenceUtils.getToken())
                .build()
                .execute(new ResultModelCallback(this, new ResponseCallBack<HeYueInfoBean>() {
                    @Override
                    public void onError(String e) {

                    }

                    @Override
                    public void onResponse(HeYueInfoBean response) throws JSONException {
                        if (response.getData() != null) {
                            mId = response.getData().getId();
                            textName.setText(response.getData().getName());
                            textName2.setText(response.getData().getName());
                            textNumber.setText(response.getData().getContract_day() + "");
                            textType.setText(response.getData().getStatus_zh());

                            if(response.getData().getStatus_zh().equals("已失约")){
                                linAnniu.setVisibility(View.GONE);
                            }
                        }
                    }
                }));
    }

    private void popQianDao() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.pop_qiandao, null);
        mText_zhidao = inflate.findViewById(R.id.text_zhidao);
        mQiandaoPop = new PopupWindow(inflate, ViewPager.MarginLayoutParams.MATCH_PARENT, ViewPager.MarginLayoutParams.MATCH_PARENT);
        inflate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQiandaoPop.dismiss();
            }
        });

        mText_zhidao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQiandaoPop.dismiss();
            }
        });
    }

    private void popCancel() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.pop_cancel_heyue, null);
        mText_quxiao = inflate.findViewById(R.id.text_quxiao);
        TextView text_queren = inflate.findViewById(R.id.text_queren);
        mCancelPop = new PopupWindow(inflate, ViewPager.MarginLayoutParams.MATCH_PARENT, ViewPager.MarginLayoutParams.MATCH_PARENT);
        inflate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCancelPop.dismiss();
            }
        });

        text_queren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancel();
            }
        });
    }

    private void cancel() {
        OkHttpUtils.post()
                .url(ZgwApplication.appRequestUrl + "v1/contract/breakContracts")
                .addHeader("Authorization", SharedPreferenceUtils.getToken())
                .addParams("contract_id",mId+"")
                .build()
                .execute(new ResultModelCallback(this, new ResponseCallBack<CodeBean>() {
                    @Override
                    public void onError(String e) {
                        Toast.makeText(SanShiTianActivity.this, e, Toast.LENGTH_SHORT).show();
                        mCancelPop.dismiss();
                    }

                    @Override
                    public void onResponse(CodeBean response) throws JSONException {
                        Toast.makeText(SanShiTianActivity.this, response.getMessage(), Toast.LENGTH_SHORT).show();
                        mCancelPop.dismiss();
                    }
                }));
    }

    @Override
    protected void initData() {
        OkHttpUtils.post()
                .url(ZgwApplication.appRequestUrl + "v1/contract/receiveContracts")
                .addHeader("Authorization", SharedPreferenceUtils.getToken())
                .addParams("contract_id",mId+"")
                .build()
                .execute(new ResultModelCallback(this, new ResponseCallBack<CodeBean>() {
                    @Override
                    public void onError(String e) {
                        Toast.makeText(SanShiTianActivity.this, e, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(CodeBean response) throws JSONException {
                        mQiandaoPop.showAsDropDown(mText_zhidao, 0, 0);
                    }
                }));
    }

    @OnClick({R.id.back, R.id.text_cheXiao, R.id.text_qianDao})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.text_cheXiao:
                mCancelPop.showAsDropDown(mText_quxiao, 0, 0);
                break;
            case R.id.text_qianDao:
                qianDao();
                break;
        }
    }

    private void qianDao() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_san_shi_tian;
    }
}
