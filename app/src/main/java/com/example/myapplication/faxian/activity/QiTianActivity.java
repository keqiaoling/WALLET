package com.example.myapplication.faxian.activity;

import android.bluetooth.BluetoothHidDeviceAppSdpSettings;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.begin.bean.CodeBean;
import com.example.myapplication.faxian.bean.HeYueBean;
import com.example.myapplication.okhttp.OkHttpUtils;
import com.example.myapplication.okhttp.callback.ResponseCallBack;
import com.example.myapplication.okhttp.callback.ResultModelCallback;
import com.example.myapplication.utils.SharedPreferenceUtils;

import org.json.JSONException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class QiTianActivity extends BaseActivity {

    @BindView(R.id.text_name)
    TextView textName;
    @BindView(R.id.rela_bi)
    RelativeLayout relaBi;
    @BindView(R.id.text_yue)
    TextView textYue;
    @BindView(R.id.ed_number)
    EditText edNumber;
    @BindView(R.id.text_huanSuan)
    TextView textHuanSuan;
    @BindView(R.id.ed_pass)
    EditText edPass;

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.back, R.id.text_gouMai,R.id.rela_bi})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.text_gouMai:
                if(textName.getText().toString().equals("")){
                    Toast.makeText(this, R.string.text_qxzbz, Toast.LENGTH_SHORT).show();
                }else if(edNumber.getText().toString().equals("")){
                    Toast.makeText(this, R.string.text_qsrsl, Toast.LENGTH_SHORT).show();
                }else if(edPass.getText().toString().equals("")){
                    Toast.makeText(this, R.string.text_qsrjymm, Toast.LENGTH_SHORT).show();
                }else{
                    gouMai();
                }
                break;
            case R.id.rela_bi:
                break;
        }
    }

    private void gouMai() {
        OkHttpUtils.post()
                .url(ZgwApplication.appRequestUrl + "v1/mill/pay")
                .addHeader("Authorization", SharedPreferenceUtils.getToken())
                .addParams("mill_id","")
                .addParams("pay_password",edPass.getText().toString())
                .addParams("number",edNumber.getText().toString())
                .addParams("contract_id",getIntent().getStringExtra("id"))
                .build()
                .execute(new ResultModelCallback(this, new ResponseCallBack<CodeBean>() {
                    @Override
                    public void onError(String e) {

                    }

                    @Override
                    public void onResponse(CodeBean response) throws JSONException {

                    }
                }));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_qi_tian;
    }
}
