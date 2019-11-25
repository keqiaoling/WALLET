package com.example.myapplication.begin.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.begin.bean.CodeBean;
import com.example.myapplication.begin.bean.LoginBean;
import com.example.myapplication.begin.edit.VerifyCodeView;
import com.example.myapplication.okhttp.OkHttpUtils;
import com.example.myapplication.okhttp.callback.ResponseCallBack;
import com.example.myapplication.okhttp.callback.ResultModelCallback;

import org.json.JSONException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CodeActivity extends BaseActivity {

    @BindView(R.id.text_number)
    TextView textNumber;
    @BindView(R.id.verify_code_view)
    VerifyCodeView verifyCodeView;
    @BindView(R.id.text_timeNumber)
    TextView textTimeNumber;
    @BindView(R.id.lin_code)
    LinearLayout linCode;

    private TimeCount time;

    class TimeCount extends CountDownTimer {
        public TimeCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onFinish() {// 计时完毕
            textTimeNumber.setText(R.string.text_cxhq);
            linCode.setClickable(true);
        }

        @Override
        public void onTick(long millisUntilFinished) {// 计时过程
            textTimeNumber.setClickable(false);//防止重复点击
            textTimeNumber.setText(millisUntilFinished / 1000 + "s");
        }
    }

    @Override
    protected void initView() {
    }

    //判断验证码是否正确
    private void yanZheng() {
        OkHttpUtils.post()
                .url(ZgwApplication.appRequestUrl + "v1/auth/check_code")
                .addHeader("X-Requested-With", "XMLHttpReques")
                .addParams("phone", ZgwApplication.phone)
                .addParams("code", verifyCodeView.getEditContent())
                .build()
                .execute(new ResultModelCallback(this, new ResponseCallBack<CodeBean>() {
                    @Override
                    public void onError(String e) {
                        Toast.makeText(CodeActivity.this, e, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(CodeBean response) throws JSONException {
                        ZgwApplication.code=verifyCodeView.getEditContent();
                        startActivity(new Intent(CodeActivity.this,SetLoginPassActivity.class));
                    }
                }));
    }

    @Override
    protected void initData() {
        textNumber.setText(ZgwApplication.phone);
        yanZhengMa();
    }

    @OnClick({R.id.image_back, R.id.lin_code,R.id.text_next})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.image_back:
                finish();
                break;
            case R.id.lin_code:
                yanZhengMa();
                break;
            case R.id.text_next:
                yanZheng();
                break;
        }
    }

    private void yanZhengMa() {
        OkHttpUtils.post()
                .url(ZgwApplication.appRequestUrl + "v1/auth/code")
                .addHeader("X-Requested-With", "XMLHttpReques")
                .addParams("phone", ZgwApplication.phone)
                .addParams("type", "register")
                .addParams("area_code", ZgwApplication.quhao)
                .build()
                .execute(new ResultModelCallback(this, new ResponseCallBack<CodeBean>() {
                    @Override
                    public void onError(String e) {
                        Toast.makeText(CodeActivity.this, e, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(CodeBean response) throws JSONException {
                        time = new TimeCount(60000, 1000);
                        time.start();
                        linCode.setClickable(false);
                        Toast.makeText(CodeActivity.this, response.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_code;
    }
}
