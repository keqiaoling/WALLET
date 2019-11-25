package com.example.myapplication.wode.adapter;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.myapplication.R;
import com.example.myapplication.base.BaseAdapter;
import com.example.myapplication.wode.MyTeamBean;

import java.util.List;

public class MyTeamAdapter extends BaseAdapter<MyTeamBean.DataBeanX.DataBean> {

    private final Context context;

    public MyTeamAdapter(List<MyTeamBean.DataBeanX.DataBean> dataList, Context context) {
        super(dataList);
        this.context =context;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_teamuser;
    }

    @Override
    public void addAll(List<MyTeamBean.DataBeanX.DataBean> list, int page) {

    }

    @Override
    public void createHolder(ViewHolder holder, MyTeamBean.DataBeanX.DataBean dataBean, int position) {
        ImageView user_heard = holder.itemView.findViewById(R.id.user_heard);
        if(dataBean!=null){
            RequestOptions requestOptions = RequestOptions.circleCropTransform();
            if(dataBean.getUser().getAvatar()!=null){
                Glide.with(context)
                        .load(dataBean.getUser().getAvatar())
                        .apply(requestOptions)
                        .into(user_heard);
            }

            if(dataBean.getUser().getIs_block()==0){
                holder.setPic(R.id.is_block, R.mipmap.td_wuxiao);
            }else{
                holder.setPic(R.id.is_block, R.mipmap.td_youxiao);
            }
            holder.setText(R.id.email,dataBean.getUser().getEmail());
            holder.setText(R.id.nick_name,dataBean.getUser().getNickname());
            holder.setText(R.id.created_at,dataBean.getUser().getCreated_at());
            holder.setText(R.id.consume,dataBean.getUser().getCount_yeji()+"");
        }


    }
}
