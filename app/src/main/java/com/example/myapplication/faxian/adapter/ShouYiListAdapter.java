package com.example.myapplication.faxian.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.faxian.bean.HeYueListBean;

import java.util.List;

public class ShouYiListAdapter extends RecyclerView.Adapter {

    private List<HeYueListBean.DataBean> mList;

    public ShouYiListAdapter(List<HeYueListBean.DataBean> list) {
        mList = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shouyi, null);
        return new Holder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Holder vo = (Holder) holder;
        vo.mText_time.setText(mList.get(position).getName());
        if (mList.get(position).getStatus() == 1) {
            vo.mText_type.setText(R.string.text_syz);
        } else if (mList.get(position).getStatus() == 2) {
            vo.mText_type.setText(R.string.text_ywc);
        } else if (mList.get(position).getStatus() == 3) {
            vo.mText_type.setText(R.string.text_yqx);
        }
        vo.mText_number.setText(mList.get(position).getContracts_number());
        vo.mText_shouYi.setText(mList.get(position).getIncome() + "");
        vo.mText_startTime.setText(mList.get(position).getCreated_at());
        vo.mText_endTime.setText(mList.get(position).getEnd_time());

        vo.itemView.setOnClickListener(new View.OnClickListener() {
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

        private final TextView mText_time;
        private final TextView mText_type;
        private final TextView mText_number;
        private final TextView mText_shouYi;
        private final TextView mText_startTime;
        private final TextView mText_endTime;

        public Holder(@NonNull View itemView) {
            super(itemView);

            mText_time = itemView.findViewById(R.id.text_time);
            mText_type = itemView.findViewById(R.id.text_type);
            mText_number = itemView.findViewById(R.id.text_number);
            mText_shouYi = itemView.findViewById(R.id.text_shouYi);
            mText_startTime = itemView.findViewById(R.id.text_startTime);
            mText_endTime = itemView.findViewById(R.id.text_endTime);
        }
    }
}
