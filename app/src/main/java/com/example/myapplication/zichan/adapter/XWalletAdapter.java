package com.example.myapplication.zichan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.utils.MoneyUtils;
import com.example.myapplication.zichan.bean.XWalletBean;

import java.math.BigDecimal;
import java.util.List;

public class XWalletAdapter extends RecyclerView.Adapter {

    private List<XWalletBean.DataBean.ListBean> mList;
    private Context mContext;

    public XWalletAdapter(List<XWalletBean.DataBean.ListBean> list, Context context) {
        mList = list;
        mContext = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_xwallet, null);
        return new Holder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Holder vo = (Holder) holder;
        Glide.with(mContext).load(mList.get(position).getCurrency().getLogo()).into(vo.mImage_logo);
        vo.mText_name.setText(mList.get(position).getCurrency().getName());
        vo.mText_number.setText(MoneyUtils.decimalByUp(2, new BigDecimal(Double.parseDouble(mList.get(position).getChange_balance()))).toPlainString());
        vo.mText_cnyNumber.setText("≈$" + mList.get(position).getDoll_balance());
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

        private ImageView mImage_logo;
        private TextView mText_name;
        private TextView mText_number;
        private TextView mText_cnyNumber;

        public Holder(@NonNull View itemView) {
            super(itemView);

            mImage_logo = itemView.findViewById(R.id.image_logo);
            mText_name = itemView.findViewById(R.id.text_name);
            mText_number = itemView.findViewById(R.id.text_number);
            mText_cnyNumber = itemView.findViewById(R.id.text_cnyNumber);
        }
    }
}
