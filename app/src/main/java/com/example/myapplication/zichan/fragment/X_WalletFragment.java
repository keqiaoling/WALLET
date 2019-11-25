package com.example.myapplication.zichan.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseFragment;
import com.example.myapplication.okhttp.OkHttpUtils;
import com.example.myapplication.okhttp.callback.ResponseCallBack;
import com.example.myapplication.okhttp.callback.ResultModelCallback;
import com.example.myapplication.utils.MoneyUtils;
import com.example.myapplication.utils.SharedPreferenceUtils;
import com.example.myapplication.zichan.activity.WalletInfoActivity;
import com.example.myapplication.zichan.adapter.XWalletAdapter;
import com.example.myapplication.zichan.bean.XWalletBean;

import org.json.JSONException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class X_WalletFragment extends BaseFragment {

    @BindView(R.id.image_eye)
    ImageView imageEye;
    @BindView(R.id.text_number)
    TextView textNumber;
    @BindView(R.id.reList)
    RecyclerView reList;
    private List<XWalletBean.DataBean.ListBean> mList;
    private XWalletAdapter mAdapter;
    private String mNumber;
    private int mType = 1;

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }

    @Override
    protected void initData() {
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        reList.setLayoutManager(manager);
        mList = new ArrayList<>();
        mAdapter = new XWalletAdapter(mList, getActivity());
        reList.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new XWalletAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
                Intent intent = new Intent(getActivity(), WalletInfoActivity.class);
                intent.putExtra("id",mList.get(position).getCurrency_id()+"");
                startActivity(intent);
            }
        });
        list();
    }

    private void list() {
        OkHttpUtils.post()
                .url(ZgwApplication.appRequestUrl + "v1/wallet/wallets_list")
                .addHeader("Authorization", SharedPreferenceUtils.getToken())
                .build()
                .execute(new ResultModelCallback(getActivity(), new ResponseCallBack<XWalletBean>() {
                    @Override
                    public void onError(String e) {

                    }

                    @Override
                    public void onResponse(XWalletBean response) throws JSONException {
                        if(response.getData().getList()!=null){
                            mList.addAll(response.getData().getList());
                            mAdapter.notifyDataSetChanged();
                        }

                        if(response.getData().getDoll()!=null){
                            mNumber = response.getData().getDoll();
                            textNumber.setText(MoneyUtils.decimalByUp(4, new BigDecimal(Double.parseDouble(mNumber))).toPlainString());
                        }
                    }
                }));
    }

    @OnClick({R.id.image_eye})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.image_eye:
                if (mType == 1) {
                    mType = 0;
                    StringBuffer buffer = new StringBuffer();
                    String s = MoneyUtils.decimalByUp(4, new BigDecimal(Double.parseDouble(mNumber))).toPlainString();
                    for (int i = 0; i < s.length(); i++) {
                        buffer.append("*");
                    }
                    textNumber.setText(buffer.toString());
                    imageEye.setImageResource(R.mipmap.image_wallet_biyan);
                } else if (mType == 0) {
                    mType = 1;
                    textNumber.setText(MoneyUtils.decimalByUp(4, new BigDecimal(Double.parseDouble(mNumber))).toPlainString());
                    imageEye.setImageResource(R.mipmap.image_wallet_zhengyan);
                }
                break;
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_x__wallet;
    }
}
