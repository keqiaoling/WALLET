package com.example.myapplication.faxian.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.faxian.bean.TaoCanBean;

import java.util.List;

public class TaoCanAdapter extends RecyclerView.Adapter {

    private List<TaoCanBean.DataBean> mList;
    private Context mContext;

    public TaoCanAdapter(List<TaoCanBean.DataBean> list, Context context) {
        mList = list;
        mContext = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_taocan, null);
        return new Holder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Holder vo = (Holder) holder;
        if (mList.get(position).getStatus_zh().equals("VIP")) {
            vo.mText_numbery.setBackgroundResource(R.mipmap.tz_vip);
        } else {
            vo.mText_numbery.setBackgroundResource(R.drawable.touzi_bg);
            vo.mText_numbery.setText(mList.get(position).getDay() + "");
        }

        if (mList.get(position).getStatus_zh().equals("抢购中")) {
            vo.mText_type.setBackgroundResource(R.drawable.tz_qg_bg);
            vo.mText_type.setTextColor(mContext.getResources().getColor(R.color.zise));
        } else if (mList.get(position).getStatus_zh().equals("VIP")) {
            vo.mText_type.setBackgroundResource(R.drawable.tz_vip_bg);
            vo.mText_type.setTextColor(mContext.getResources().getColor(R.color.chengse_q));
        }


        vo.mText_name.setText(mList.get(position).getName());
        vo.mText_type.setText(mList.get(position).getStatus_zh());
        vo.mText_zsy.setText(mList.get(position).getMin_all() + "% ~ " + mList.get(position).getMax_all() + "%");
        vo.mText_shsy.setText(mList.get(position).getRate_min() + "% ~ " + mList.get(position).getRate_max() + "%");

        vo.mText_touzi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mOnItemClickListener!=null){
                    mOnItemClickListener.OnItemClick(position);
                }
            }
        });
    }

    private OnItemClickListener mOnItemClickListener;

    public interface OnItemClickListener {
        void OnItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class Holder extends RecyclerView.ViewHolder {

        private TextView mText_numbery;
        private TextView mText_name;
        private TextView mText_type;
        private TextView mText_zsy;
        private TextView mText_shsy;
        private TextView mText_touzi;

        public Holder(@NonNull View itemView) {
            super(itemView);

            mText_numbery = itemView.findViewById(R.id.text_numbery);
            mText_name = itemView.findViewById(R.id.text_name);
            mText_type = itemView.findViewById(R.id.text_type);
            mText_zsy = itemView.findViewById(R.id.text_zsy);
            mText_shsy = itemView.findViewById(R.id.text_shsy);
            mText_touzi = itemView.findViewById(R.id.text_touzi);
        }
    }
}
