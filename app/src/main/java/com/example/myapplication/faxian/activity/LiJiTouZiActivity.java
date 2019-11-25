package com.example.myapplication.faxian.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.faxian.adapter.TaoCanAdapter;
import com.example.myapplication.faxian.bean.HeYueBean;
import com.example.myapplication.faxian.bean.TaoCanBean;
import com.example.myapplication.okhttp.OkHttpUtils;
import com.example.myapplication.okhttp.callback.ResponseCallBack;
import com.example.myapplication.okhttp.callback.ResultModelCallback;
import com.example.myapplication.utils.SharedPreferenceUtils;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LiJiTouZiActivity extends BaseActivity {

    @BindView(R.id.back)
    ImageButton back;
    @BindView(R.id.reList)
    RecyclerView reList;
    @BindView(R.id.lin_zanwu)
    LinearLayout linZanwu;
    private List<TaoCanBean.DataBean> mList;
    private TaoCanAdapter mAdapter;

    @Override
    protected void initView() {
        LinearLayoutManager manager = new LinearLayoutManager(this);
        reList.setLayoutManager(manager);
        mList = new ArrayList<>();
        mAdapter = new TaoCanAdapter(mList, this);
        reList.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new TaoCanAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
                Intent intent = new Intent(LiJiTouZiActivity.this, QiTianActivity.class);
                intent.putExtra("id",mList.get(position).getId()+"");
                startActivity(intent);
            }
        });
        list();
    }

    private void list() {
        OkHttpUtils.get()
                .url(ZgwApplication.appRequestUrl + "v1/contract/contracts")
                .addHeader("Authorization", SharedPreferenceUtils.getToken())
                .build()
                .execute(new ResultModelCallback(this, new ResponseCallBack<TaoCanBean>() {
                    @Override
                    public void onError(String e) {

                    }

                    @Override
                    public void onResponse(TaoCanBean response) throws JSONException {
                        if(response.getData()!=null){
                            if(response.getData().size()!=0){
                                mList.addAll(response.getData());
                                mAdapter.notifyDataSetChanged();
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

    @OnClick({R.id.back})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_li_ji_tou_zi;
    }
}
