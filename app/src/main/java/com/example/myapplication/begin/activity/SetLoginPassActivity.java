package com.example.myapplication.begin.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SetLoginPassActivity extends BaseActivity {

    @BindView(R.id.ed_pass)
    EditText edPass;
    @BindView(R.id.ed_pass2)
    EditText edPass2;
    @BindView(R.id.ed_code)
    EditText edCode;
    @BindView(R.id.image_xuanze)
    ImageView imageXuanze;

    private boolean mXuanze = true;

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.image_back, R.id.image_xuanze, R.id.text_next})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.image_back:
                finish();
                break;
            case R.id.image_xuanze:
                if(mXuanze){
                    mXuanze=false;
                    imageXuanze.setImageResource(R.mipmap.image_yuan_select);
                }else{
                    mXuanze=true;
                    imageXuanze.setImageResource(R.mipmap.image_yuan_unselect);
                }
                break;
            case R.id.text_next:
                if(edPass.equals("")){
                    Toast.makeText(this, R.string.tishi_qszmm, Toast.LENGTH_SHORT).show();
                }else if(edPass2.equals("")){
                    Toast.makeText(this, R.string.tishi_zcsrmm, Toast.LENGTH_SHORT).show();
                }else if(!edPass.getText().toString().equals(edPass2.getText().toString())){
                    Toast.makeText(this, R.string.tishi_lcsrdmmyyz, Toast.LENGTH_SHORT).show();
                }else if(edCode.equals("")){
                    Toast.makeText(this, R.string.tishi_qsryqmbt, Toast.LENGTH_SHORT).show();
                }else if(mXuanze){
                    Toast.makeText(this, R.string.tishi_qgxxy, Toast.LENGTH_SHORT).show();
                }else{
                    ZgwApplication.pass=edPass.getText().toString();
                    ZgwApplication.yaoqingma =edCode.getText().toString();
                    startActivity(new Intent(this,SetPayPassActivity.class));
                }
                break;
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_set_login_pass;
    }
}
