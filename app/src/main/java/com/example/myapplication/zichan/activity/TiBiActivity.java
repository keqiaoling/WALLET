package com.example.myapplication.zichan.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.begin.activity.PhoneRegisterActivity;
import com.example.myapplication.okhttp.OkHttpUtils;
import com.example.myapplication.okhttp.callback.ResponseCallBack;
import com.example.myapplication.okhttp.callback.ResultModelCallback;
import com.example.myapplication.utils.MoneyUtils;
import com.example.myapplication.utils.SharedPreferenceUtils;
import com.example.myapplication.zichan.bean.TiBiBean;
import com.example.myapplication.zichan.bean.TiBiListBean;
import com.example.myapplication.zichan.bean.WalletInFoBean;
import com.example.myapplication.zichan.bean.XWalletBean;

import org.json.JSONException;

import java.math.BigDecimal;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TiBiActivity extends BaseActivity {

    @BindView(R.id.back)
    ImageButton back;
    @BindView(R.id.image_tiBiMingXi)
    ImageView imageTiBiMingXi;
    @BindView(R.id.text_name)
    TextView textName;
    @BindView(R.id.text_xuanZe)
    TextView textXuanZe;
    @BindView(R.id.ed_address)
    EditText edAddress;
    @BindView(R.id.text_number)
    TextView textNumber;
    @BindView(R.id.text_name2)
    TextView textName2;
    @BindView(R.id.ed_number)
    EditText edNumber;
    @BindView(R.id.text_all)
    TextView textAll;
    @BindView(R.id.text_shouxu)
    TextView textShouxu;
    @BindView(R.id.ed_daoNumber)
    TextView edDaoNumber;
    @BindView(R.id.text_name3)
    TextView textName3;
    @BindView(R.id.ed_pass)
    EditText edPass;
    @BindView(R.id.text_tiBi)
    TextView textTiBi;
    private TiBiBean.DataBean mDataBean;
    private String mRate;
    private String mUsdt_price;

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        info();
        list();

        edNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                double number = Double.parseDouble(s + "");
                double usdt_price = Double.parseDouble(mUsdt_price);
                double rate = Double.parseDouble(mRate);
                if(number==0||usdt_price==0){
                    textShouxu.setText("0.00");
                }else{
                    double shou = usdt_price*number*(rate/100);
                    textShouxu.setText(shou+"");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void list() {
        OkHttpUtils.get()
                .url(ZgwApplication.appRequestUrl + "v1/wallet/getCurrencyLists")
                .addHeader("Authorization", SharedPreferenceUtils.getToken())
                .addParams("type","1")
                .build()
                .execute(new ResultModelCallback(this, new ResponseCallBack<TiBiListBean>() {
                    @Override
                    public void onError(String e) {

                    }

                    @Override
                    public void onResponse(TiBiListBean response) throws JSONException {
                        if(response.getData()!=null) {
                            List<TiBiListBean.DataBean> data = response.getData();
                            for(int i=0;i<data.size();i++){
                                String id = data.get(i).getId()+"";
                                if(id.equals(getIntent().getStringExtra("id"))){
                                    mUsdt_price = data.get(i).getUsdt_price();
                                }
                            }

                            if(mUsdt_price==null){
                                startActivity(new Intent(TiBiActivity.this,WalletInfoActivity.class));
                                finish();
                            }
                        }
                    }
                }));
    }

    private void info() {
        OkHttpUtils.get()
                .url(ZgwApplication.appRequestUrl + "v1/wallet/wallets")
                .addHeader("Authorization", SharedPreferenceUtils.getToken())
                .addParams("type","1")
                .build()
                .execute(new ResultModelCallback(this, new ResponseCallBack<TiBiBean>() {
                    @Override
                    public void onError(String e) {

                    }

                    @Override
                    public void onResponse(TiBiBean response) throws JSONException {
                        if(response.getData()!=null){
                            List<TiBiBean.DataBean> data = response.getData();
                            for(int i=0;i<data.size();i++){
                                String currency_id = data.get(i).getCurrency_id()+"";
                                if(currency_id.equals(getIntent().getStringExtra("id"))){
                                    mDataBean = data.get(i);
                                }
                            }

                            textName.setText(mDataBean.getCurrency_name());
                            textName2.setText(mDataBean.getCurrency_name());
                            textName3.setText(mDataBean.getCurrency_name());
                            textNumber.setText(mDataBean.getChange_balance());
                            mRate = mDataBean.getCurrency().getRate();
                        }
                    }
                }));
    }

    @OnClick({R.id.back, R.id.image_tiBiMingXi,R.id.text_xuanZe, R.id.text_all, R.id.text_tiBi})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.image_tiBiMingXi:
                startActivity(new Intent(TiBiActivity.this, TiBiInfoActivity.class));
                break;
            case R.id.text_xuanZe:
                break;
            case R.id.text_all:
                break;
            case R.id.text_tiBi:
                break;
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_ti_bi;
    }
}
