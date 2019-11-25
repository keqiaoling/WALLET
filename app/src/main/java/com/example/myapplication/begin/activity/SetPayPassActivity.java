package com.example.myapplication.begin.activity;

import android.content.Intent;
import android.widget.Toast;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.begin.bean.CodeBean;
import com.example.myapplication.begin.bean.LoginBean;
import com.example.myapplication.begin.edit.PaypassView;
import com.example.myapplication.okhttp.OkHttpUtils;
import com.example.myapplication.okhttp.callback.ResponseCallBack;
import com.example.myapplication.okhttp.callback.ResultModelCallback;
import com.example.myapplication.utils.SharedPreferenceUtils;

import org.json.JSONException;

import butterknife.BindView;
import butterknife.OnClick;

public class SetPayPassActivity extends BaseActivity {

    @BindView(R.id.PaypassView)
    PaypassView PaypassView;

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        PaypassView.setInputCompleteListener(new PaypassView.InputCompleteListener() {
            @Override
            public void inputComplete() {
                register();
            }

            @Override
            public void invalidContent() {

            }
        });
    }

    private void register() {
        OkHttpUtils.post()
                .url(ZgwApplication.appRequestUrl + "v1/auth/register")
                .addHeader("X-Requested-With", "XMLHttpReques")
                .addParams("phone", ZgwApplication.phone)
                .addParams("password", ZgwApplication.pass)
                .addParams("code", ZgwApplication.code)
                .addParams("invitation_code", ZgwApplication.yaoqingma)
                .addParams("pay_password", PaypassView.getEditContent())
                .addParams("area_code", ZgwApplication.quhao)
                .build()
                .execute(new ResultModelCallback(this, new ResponseCallBack<CodeBean>() {
                    @Override
                    public void onError(String e) {
                        Toast.makeText(SetPayPassActivity.this, e, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(CodeBean response) throws JSONException {
                        Toast.makeText(SetPayPassActivity.this, response.getMessage(), Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(SetPayPassActivity.this,LoginActivity.class));
                    }
                }));
    }

    @OnClick(R.id.image_back)
    public void onViewClicked() {
        finish();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_set_pay_pass;
    }
}
