package com.example.myapplication.begin.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.begin.bean.CodeBean;
import com.example.myapplication.begin.bean.LoginBean;
import com.example.myapplication.okhttp.OkHttpUtils;
import com.example.myapplication.okhttp.callback.ResponseCallBack;
import com.example.myapplication.okhttp.callback.ResultModelCallback;
import com.example.myapplication.utils.MD5Util;
import com.example.myapplication.utils.SharedPreferenceUtils;

import org.json.JSONException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ForgetActivity extends BaseActivity {

    @BindView(R.id.ed_phone)
    EditText edPhone;
    @BindView(R.id.ed_code)
    EditText edCode;
    @BindView(R.id.text_yzm)
    TextView textYzm;
    @BindView(R.id.ed_pass)
    EditText edPass;
    @BindView(R.id.image_pass1)
    ImageView imagePass1;
    @BindView(R.id.ed_pass2)
    EditText edPass2;
    @BindView(R.id.image_pass2)
    ImageView imagePass2;
    @BindView(R.id.ed_pay_pass)
    EditText edPayPass;
    @BindView(R.id.image_pay_pass1)
    ImageView imagePayPass1;
    @BindView(R.id.ed_pay_pass2)
    EditText edPayPass2;
    @BindView(R.id.image_pay_pass2)
    ImageView imagePayPass2;

    private boolean mPass = true;
    private boolean mPasss = true;
    private boolean mPayPass = true;
    private boolean mPayPasss = true;
    private TimeCount time;

    class TimeCount extends CountDownTimer {
        public TimeCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onFinish() {// 计时完毕
            textYzm.setText(R.string.text_cxhq);
            textYzm.setClickable(true);
        }

        @Override
        public void onTick(long millisUntilFinished) {// 计时过程
            textYzm.setClickable(false);//防止重复点击
            textYzm.setText(millisUntilFinished / 1000 + "s");
        }
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.image_back, R.id.text_yzm, R.id.image_pass1, R.id.image_pass2, R.id.text_find,
            R.id.ed_pay_pass, R.id.image_pay_pass1, R.id.ed_pay_pass2, R.id.image_pay_pass2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.image_back://返回
                finish();
                break;
            case R.id.text_yzm://发送验证码
                if (edPhone.getText().toString().equals("")) {
                    Toast.makeText(ForgetActivity.this, R.string.tishi_qtxsjhm, Toast.LENGTH_SHORT).show();
                } else if (!MD5Util.isMobile(edPhone.getText().toString())) {
                    Toast.makeText(ForgetActivity.this, R.string.text_qtxzqdsjhm, Toast.LENGTH_SHORT).show();
                } else {
                    yanZhengMa();
                }
                break;
            case R.id.image_pass1:
                if (mPass) {
                    mPass = false;
                    imagePass1.setImageResource(R.mipmap.image_biyan);
                    edPass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                } else {
                    mPass = true;
                    imagePass1.setImageResource(R.mipmap.image_zhengyan);
                    edPass.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                }
                break;
            case R.id.image_pass2:
                if (mPasss) {
                    mPasss = false;
                    imagePass2.setImageResource(R.mipmap.image_biyan);
                    edPass2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                } else {
                    mPasss = true;
                    imagePass2.setImageResource(R.mipmap.image_zhengyan);
                    edPass2.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                }
                break;
            case R.id.text_find://找回密码
                if(edCode.getText().toString().equals("")){
                    Toast.makeText(ForgetActivity.this, R.string.tishi_qtxyzm, Toast.LENGTH_SHORT).show();
                }else if(edPass.getText().toString().equals("")){
                    Toast.makeText(ForgetActivity.this, R.string.tishi_qtxxmm, Toast.LENGTH_SHORT).show();
                }else if(edPass2.getText().toString().equals("")){
                    Toast.makeText(ForgetActivity.this, R.string.tishi_qzctxxmm, Toast.LENGTH_SHORT).show();
                }else if(!edPass.getText().toString().equals(edPass2.getText().toString())){
                    Toast.makeText(ForgetActivity.this, R.string.tishi_lcsrdmmyyz, Toast.LENGTH_SHORT).show();
                }else if(edPayPass.getText().toString().equals("")){
                    Toast.makeText(ForgetActivity.this, R.string.tishi_qtxxzfmm, Toast.LENGTH_SHORT).show();
                }else if(edPayPass2.getText().toString().equals("")){
                    Toast.makeText(ForgetActivity.this, R.string.text_qzctxxzfmm, Toast.LENGTH_SHORT).show();
                }else if(!edPayPass.getText().toString().equals(edPayPass2.getText().toString())){
                    Toast.makeText(ForgetActivity.this, R.string.tishi_lcsrdzfmmyyz, Toast.LENGTH_SHORT).show();
                }else{
                    find();
                }
                break;
            case R.id.image_pay_pass1:
                if (mPayPass) {
                    mPayPass = false;
                    imagePayPass1.setImageResource(R.mipmap.image_biyan);
                    edPayPass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                } else {
                    mPayPass = true;
                    imagePayPass1.setImageResource(R.mipmap.image_zhengyan);
                    edPayPass.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                }
                break;
            case R.id.image_pay_pass2:
                if (mPayPasss) {
                    mPayPasss = false;
                    imagePayPass2.setImageResource(R.mipmap.image_biyan);
                    edPayPass2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                } else {
                    mPayPasss = true;
                    imagePayPass2.setImageResource(R.mipmap.image_zhengyan);
                    edPayPass2.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                }
                break;
        }
    }

    private void find() {
        OkHttpUtils.post()
                .url(ZgwApplication.appRequestUrl + "v1/auth/findPassword")
                .addHeader("X-Requested-With", "XMLHttpReques")
                .addParams("phone", edPhone.getText().toString())
                .addParams("password", edPass.getText().toString())
                .addParams("code", edCode.getText().toString())
                .addParams("pay_password", edPayPass.getText().toString())
                .build()
                .execute(new ResultModelCallback(this, new ResponseCallBack<CodeBean>() {
                    @Override
                    public void onError(String e) {
                        Toast.makeText(ForgetActivity.this, e, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(CodeBean response) throws JSONException {
                        Toast.makeText(ForgetActivity.this, response.getMessage(), Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(ForgetActivity.this,LoginActivity.class));
                        finish();
                    }
                }));
    }

    private void yanZhengMa() {
        OkHttpUtils.post()
                .url(ZgwApplication.appRequestUrl + "v1/auth/code")
                .addHeader("X-Requested-With", "XMLHttpReques")
                .addParams("phone", edPhone.getText().toString())
                .addParams("type", "find")
                .addParams("area_code", ZgwApplication.quhao)
                .build()
                .execute(new ResultModelCallback(this, new ResponseCallBack<CodeBean>() {
                    @Override
                    public void onError(String e) {
                        Toast.makeText(ForgetActivity.this, e, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(CodeBean response) throws JSONException {
                        time = new TimeCount(60000, 1000);
                        time.start();
                        textYzm.setClickable(false);
                        Toast.makeText(ForgetActivity.this, response.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_forget;
    }
}
