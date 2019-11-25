package com.example.myapplication.zichan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.zichan.bean.WalletInFoBean;

import java.util.List;

public class WalletInfoAdapter extends RecyclerView.Adapter {

    private List<WalletInFoBean.DataBeanX.ListBean.DataBean> mList;
    private Context mContext;

    public WalletInfoAdapter(List<WalletInFoBean.DataBeanX.ListBean.DataBean> list, Context context) {
        mList = list;
        mContext = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_walletinfo, null);
        return new Holder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Holder vo = (Holder) holder;
        vo.mText_title.setText(mList.get(position).getMemo());
        vo.mText_time.setText(mList.get(position).getCreated_at());
        vo.mText_number.setText(mList.get(position).getValue()+mList.get(position).getCurrencies().getName());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class Holder extends RecyclerView.ViewHolder{

        private TextView mText_title;
        private TextView mText_time;
        private TextView mText_number;

        public Holder(@NonNull View itemView) {
            super(itemView);

            mText_title = itemView.findViewById(R.id.text_title);
            mText_time = itemView.findViewById(R.id.text_time);
            mText_number = itemView.findViewById(R.id.text_number);
        }
    }
}
