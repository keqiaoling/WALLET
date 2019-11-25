package com.example.myapplication.faxian.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseFragment;
import com.example.myapplication.faxian.activity.SanShiTianActivity;
import com.example.myapplication.faxian.adapter.ShouYiListAdapter;
import com.example.myapplication.faxian.bean.HeYueListBean;
import com.example.myapplication.okhttp.OkHttpUtils;
import com.example.myapplication.okhttp.callback.ResponseCallBack;
import com.example.myapplication.okhttp.callback.ResultModelCallback;
import com.example.myapplication.utils.SharedPreferenceUtils;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * 合约 已取消
 */
public class QuXiaoFragment extends BaseFragment {

    @BindView(R.id.relist)
    RecyclerView relist;
    @BindView(R.id.lin_zanwu)
    LinearLayout linZanwu;
    private ShouYiListAdapter mAdapter;
    private List<HeYueListBean.DataBean> mList;

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }

    @Override
    protected void initData() {
        mList = new ArrayList<>();
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        relist.setLayoutManager(manager);
        mAdapter = new ShouYiListAdapter(mList);
        relist.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new ShouYiListAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
                Intent intent = new Intent(getActivity(), SanShiTianActivity.class);
                intent.putExtra("id",mList.get(position).getId()+"");
                startActivity(intent);
            }
        });
        list();
    }

    private void list() {
        OkHttpUtils.get()
                .url(ZgwApplication.appRequestUrl + "v1/contract/myContracts")
                .addHeader("Authorization", SharedPreferenceUtils.getToken())
                .addParams("status","2")
                .build()
                .execute(new ResultModelCallback(getActivity(), new ResponseCallBack<HeYueListBean>() {
                    @Override
                    public void onError(String e) {

                    }

                    @Override
                    public void onResponse(HeYueListBean response) throws JSONException {
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
    protected int getLayoutId() {
        return R.layout.fragment_qu_xiao;
    }
}
