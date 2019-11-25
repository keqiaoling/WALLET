package com.example.myapplication.begin.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.utils.MD5Util;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EmailRegisterActivity extends BaseActivity {

    @BindView(R.id.text_name)
    TextView textName;
    @BindView(R.id.text_code)
    TextView textCode;
    @BindView(R.id.ed_email)
    EditText edEmail;

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==2){
            if(data.getStringExtra("name")!=null){
                String name = data.getStringExtra("name");
                String code = data.getStringExtra("code");
                textName.setText(name);
                textCode.setText(code);
            }
        }
    }

    @OnClick({R.id.image_back, R.id.lin_quHao, R.id.image_delete, R.id.text_phone, R.id.text_faSong, R.id.lin_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.image_back://返回
                finish();
                break;
            case R.id.lin_quHao://区号
                Intent intent = new Intent(EmailRegisterActivity.this, QuHaoActivity.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.image_delete://删除
                edEmail.setText("");
                break;
            case R.id.text_phone://跳转到手机注册
                startActivity(new Intent(EmailRegisterActivity.this,PhoneRegisterActivity.class));
                break;
            case R.id.text_faSong://发送验证码
                if (edEmail.getText().toString().equals("")) {
                    Toast.makeText(EmailRegisterActivity.this, R.string.text_qtxyx, Toast.LENGTH_SHORT).show();
                } else if (!MD5Util.isEmail(edEmail.getText().toString())) {
                    Toast.makeText(EmailRegisterActivity.this, R.string.tishi_qtxzqdyx, Toast.LENGTH_SHORT).show();
                } else {
                    ZgwApplication.phone=edEmail.getText().toString();
                    startActivity(new Intent(EmailRegisterActivity.this,CodeActivity.class));
                }
                break;
            case R.id.lin_login://登录
                startActivity(new Intent(EmailRegisterActivity.this,LoginActivity.class));
                break;
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_email_register;
    }
}
