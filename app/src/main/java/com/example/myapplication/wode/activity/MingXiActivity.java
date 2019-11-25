package com.example.myapplication.wode.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.faxian.bean.HomeBean;
import com.example.myapplication.faxian.bean.MingXiBean;
import com.example.myapplication.okhttp.OkHttpUtils;
import com.example.myapplication.okhttp.callback.ResponseCallBack;
import com.example.myapplication.okhttp.callback.ResultModelCallback;
import com.example.myapplication.utils.SharedPreferenceUtils;

import org.json.JSONException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MingXiActivity extends BaseActivity {

    @BindView(R.id.relist)
    RecyclerView relist;
    @BindView(R.id.lin_zanwu)
    LinearLayout linZanwu;

    @Override
    protected void initView() {
        list();
    }

    private void list() {
        OkHttpUtils.get()
                .url(ZgwApplication.appRequestUrl + "v1/wallet/logs")
                .addHeader("Authorization", SharedPreferenceUtils.getToken())
                .addParams("type",getIntent().getStringExtra("type"))
                .build()
                .execute(new ResultModelCallback(this, new ResponseCallBack<MingXiBean>() {
                    @Override
                    public void onError(String e) {

                    }

                    @Override
                    public void onResponse(MingXiBean response) throws JSONException {
                        if(response.getData().getData()!=null){
                            if(response.getData().getData().size()!=0){

                            }else{
                                linZanwu.setVisibility(View.VISIBLE);
                            }
                        }
                    }
                }));
    }

    @Override
    protected void initData() {

    }

    @OnClick(R.id.back)
    public void onViewClicked() {
        finish();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_ming_xi;
    }
}
