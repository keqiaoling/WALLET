package com.example.myapplication.zichan.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.faxian.activity.BiDuiActivity;
import com.example.myapplication.faxian.activity.HeYueActivity;
import com.example.myapplication.okhttp.OkHttpUtils;
import com.example.myapplication.okhttp.callback.ResponseCallBack;
import com.example.myapplication.okhttp.callback.ResultModelCallback;
import com.example.myapplication.utils.SharedPreferenceUtils;
import com.example.myapplication.zichan.adapter.WalletInfoAdapter;
import com.example.myapplication.zichan.bean.WalletInFoBean;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WalletInfoActivity extends BaseActivity {

    @BindView(R.id.back)
    ImageButton back;
    @BindView(R.id.rela_shanDui)
    RelativeLayout relaShanDui;
    @BindView(R.id.rela_zhuanZhang)
    RelativeLayout relaZhuanZhang;
    @BindView(R.id.rela_chongBi)
    RelativeLayout relaChongBi;
    @BindView(R.id.rela_tiBi)
    RelativeLayout relaTiBi;
    @BindView(R.id.rela_heYue)
    RelativeLayout relaHeYue;
    @BindView(R.id.text_name)
    TextView textName;
    @BindView(R.id.image_logo)
    ImageView imageLogo;
    @BindView(R.id.text_name2)
    TextView textName2;
    @BindView(R.id.text_change_balance)
    TextView textChangeBalance;
    @BindView(R.id.text_doll_balance)
    TextView textDollBalance;
    @BindView(R.id.reList)
    RecyclerView reList;
    @BindView(R.id.lin_zanwu)
    LinearLayout linZanwu;
    @BindView(R.id.text_huilv)
    TextView textHuilv;
    private List<WalletInFoBean.DataBeanX.ListBean.DataBean> mList;
    private WalletInfoAdapter mAdapter;

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        LinearLayoutManager manager = new LinearLayoutManager(this);
        reList.setLayoutManager(manager);
        mList = new ArrayList<>();
        mAdapter = new WalletInfoAdapter(mList, this);
        reList.setAdapter(mAdapter);
        info();
    }

    private void info() {
        OkHttpUtils.post()
                .url(ZgwApplication.appRequestUrl + "v1/wallet/wallets_detail")
                .addHeader("Authorization", SharedPreferenceUtils.getToken())
                .addParams("currency_id", getIntent().getStringExtra("id"))
                .build()
                .execute(new ResultModelCallback(this, new ResponseCallBack<WalletInFoBean>() {
                    @Override
                    public void onError(String e) {

                    }

                    @Override
                    public void onResponse(WalletInFoBean response) throws JSONException {
                        if (response.getData().getList().getData() != null) {
                            if (response.getData().getList().getData().size() != 0) {
                                mList.addAll(response.getData().getList().getData());
                                mAdapter.notifyDataSetChanged();
                            } else {
                                linZanwu.setVisibility(View.VISIBLE);
                            }
                        }

                        if (response.getData().getWallet_info() != null) {
                            textChangeBalance.setText(response.getData().getWallet_info().getChange_balance());
                            Glide.with(WalletInfoActivity.this).load(response.getData().getWallet_info().getLogo()).into(imageLogo);
                            textDollBalance.setText(response.getData().getWallet_info().getDoll_balance());
                            textName.setText(response.getData().getWallet_info().getCurrency_name());
                            textName2.setText(response.getData().getWallet_info().getCurrency_name());
                            textHuilv.setText("1"+response.getData().getWallet_info().getCurrency_name()+"≈"+
                                    response.getData().getWallet_info().getUsdt_price()+"USDT");

                            if(response.getData().getWallet_info().getIs_dui().equals("1")){
                                relaShanDui.setVisibility(View.VISIBLE);
                            }

                            if(response.getData().getWallet_info().getIs_transfer().equals("1")){
                                relaZhuanZhang.setVisibility(View.VISIBLE);
                            }

                            if(response.getData().getWallet_info().getIs_recharge().equals("1")){
                                relaChongBi.setVisibility(View.VISIBLE);
                            }

                            if(response.getData().getWallet_info().getIs_withdraw().equals("1")){
                                relaTiBi.setVisibility(View.VISIBLE);
                            }

                            if(response.getData().getWallet_info().getIs_contract().equals("1")){
                                relaHeYue.setVisibility(View.VISIBLE);
                            }
                        }
                    }
                }));
    }

    @OnClick({R.id.back, R.id.rela_shanDui, R.id.rela_zhuanZhang, R.id.rela_chongBi, R.id.rela_tiBi, R.id.rela_heYue})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.rela_shanDui:
                startActivity(new Intent(WalletInfoActivity.this, BiDuiActivity.class));
                break;
            case R.id.rela_zhuanZhang:
                Toast.makeText(this, R.string.text_zwkf, Toast.LENGTH_SHORT).show();
                break;
            case R.id.rela_chongBi:
                startActivity(new Intent(WalletInfoActivity.this, ChongBiActivity.class));
                break;
            case R.id.rela_tiBi:
                Intent intent = new Intent(WalletInfoActivity.this, TiBiActivity.class);
                intent.putExtra("id",getIntent().getStringExtra("id"));
                startActivity(intent);
                break;
            case R.id.rela_heYue:
                startActivity(new Intent(WalletInfoActivity.this, HeYueActivity.class));
                break;
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_wallet_info;
    }
}
