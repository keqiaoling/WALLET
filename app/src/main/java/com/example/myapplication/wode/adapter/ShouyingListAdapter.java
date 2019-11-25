package com.example.myapplication.wode.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseAdapter;
import com.example.myapplication.wode.ShouyiListBean;
import com.example.myapplication.wode.activity.MingXiActivity;

import java.util.List;

public class ShouyingListAdapter extends BaseAdapter<ShouyiListBean.DataBeanX.DataBean> {

    private final Context context;

    public ShouyingListAdapter(List<ShouyiListBean.DataBeanX.DataBean> dataList, Context context) {
        super(dataList);
        this.context =context;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_mingxi;
    }

    @Override
    public void addAll(List<ShouyiListBean.DataBeanX.DataBean> list, int page) {

    }

    @Override
    public void createHolder(ViewHolder holder, ShouyiListBean.DataBeanX.DataBean dataBean, int position) {
        holder.setText(R.id.nick_name,dataBean.getUser().getNickname());
        holder.setText(R.id.text_time2,dataBean.getCreated_at());
        holder.setText(R.id.money,"￥"+dataBean.getValue());
        holder.setText(R.id.type,dataBean.getMemo());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, MingXiActivity.class));
            }
        });
    }
}
