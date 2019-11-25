package com.example.myapplication.begin.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.begin.bean.LoginBean;
import com.example.myapplication.okhttp.OkHttpUtils;
import com.example.myapplication.okhttp.callback.ResponseCallBack;
import com.example.myapplication.okhttp.callback.ResultModelCallback;
import com.example.myapplication.utils.SharedPreferenceUtils;

import org.json.JSONException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EmailLoginActivity extends BaseActivity {

    @BindView(R.id.ed_email)
    EditText edEmail;
    @BindView(R.id.ed_pass)
    EditText edPass;

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.image_back, R.id.image_delete, R.id.text_phone, R.id.text_forget, R.id.text_login, R.id.lin_register})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.image_back://返回
                finish();
                break;
            case R.id.image_delete://邮箱输入框里的x
                edEmail.setText("");
                break;
            case R.id.text_phone://切换到手机登录
                startActivity(new Intent(EmailLoginActivity.this,EmailLoginActivity.class));
                break;
            case R.id.text_forget://忘记密码
                startActivity(new Intent(EmailLoginActivity.this, ForgetActivity.class));
                break;
            case R.id.text_login://登录
                login();
                break;
            case R.id.lin_register://注册
                startActivity(new Intent(EmailLoginActivity.this, PhoneRegisterActivity.class));
                break;
        }
    }

    private void login() {
        OkHttpUtils.post()
                .url(ZgwApplication.appRequestUrl + "v1/auth/login")
                .addHeader("X-Requested-With", "XMLHttpReques")
                .addParams("phone", edEmail.getText().toString())
                .addParams("password", edPass.getText().toString())
                .build()
                .execute(new ResultModelCallback(this, new ResponseCallBack<LoginBean>() {
                    @Override
                    public void onError(String e) {
                        Log.e("chimu", "onError: "+e);
                        Toast.makeText(EmailLoginActivity.this, e, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(LoginBean response) throws JSONException {
                        SharedPreferenceUtils.setToken(response.getData().getToken());
                        SharedPreferenceUtils.setName(edEmail.getText().toString());
                        SharedPreferenceUtils.setPass(edPass.getText().toString());
                        startActivity(new Intent(EmailLoginActivity.this, MainActivity.class));
                        finish();
                    }
                }));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_email_login;
    }
}
