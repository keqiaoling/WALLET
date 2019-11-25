package com.example.myapplication.begin.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.begin.adapter.QuHaoAdapter;
import com.example.myapplication.begin.bean.AreaCodeBean;
import com.example.myapplication.begin.bean.CityUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class QuHaoActivity extends BaseActivity {

    @BindView(R.id.image_back)
    ImageView imageBack;
    @BindView(R.id.image_search)
    ImageView imageSearch;
    @BindView(R.id.ed_search)
    EditText edSearch;
    @BindView(R.id.text_quxiao)
    TextView textQuxiao;
    @BindView(R.id.reList)
    RecyclerView reList;
    private List<AreaCodeBean> mList;
    private List<AreaCodeBean> mQuHaoList;

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        String json = CityUtil.getStringFromAssert(this, "city.json");
        mList = new Gson().fromJson(json, new TypeToken<ArrayList<AreaCodeBean>>() {
        }.getType());
        mQuHaoList = new ArrayList<>();
        mQuHaoList.addAll(mList);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        QuHaoAdapter quHaoAdapter = new QuHaoAdapter(mQuHaoList);
        reList.setLayoutManager(manager);
        reList.setAdapter(quHaoAdapter);

        quHaoAdapter.setOnItemClickListener(new QuHaoAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
                Intent intent = new Intent(QuHaoActivity.this, LoginActivity.class);
                intent.putExtra("name",mList.get(position).getName_cn());
                intent.putExtra("code",mList.get(position).getArea_code());
                setResult(2,intent);
                finish();
            }
        });

        edSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String search = s.toString();
                if(mList!=null){
                    if(search.toString().equals("")){
                        mQuHaoList.clear();
                        mQuHaoList.addAll(mList);
                        quHaoAdapter.notifyDataSetChanged();
                    }else{
                        mQuHaoList.clear();
                        for(int i=0;i<mList.size();i++){
                            String name = mList.get(i).getName_cn();
                            if(name.contains(search)){
                                mQuHaoList.add(mList.get(i));
                            }
                        }
                        quHaoAdapter.notifyDataSetChanged();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @OnClick({R.id.image_back, R.id.text_quxiao})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.image_back:
                finish();
                break;
            case R.id.text_quxiao:
                edSearch.setText("");
                break;
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_qu_hao;
    }
}
