package com.example.myapplication.begin.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.R;
import com.example.myapplication.begin.bean.AreaCodeBean;
import java.util.List;

public class QuHaoAdapter extends RecyclerView.Adapter {

    private List<AreaCodeBean> mList;

    public QuHaoAdapter(List<AreaCodeBean> list) {
        mList = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_quhao, null);
        return new Holder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Holder vo = (Holder) holder;
        vo.mText_name.setText(mList.get(position).getName_cn());
        vo.mText_number.setText(mList.get(position).getArea_code());

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

        private TextView mText_name;
        private TextView mText_number;

        public Holder(@NonNull View itemView) {
            super(itemView);

            mText_name = itemView.findViewById(R.id.text_name);
            mText_number = itemView.findViewById(R.id.text_number);
        }
    }
}
