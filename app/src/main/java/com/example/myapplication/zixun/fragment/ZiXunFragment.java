package com.example.myapplication.zixun.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseFragment;
import com.example.myapplication.zixun.activity.ZiXunInfoActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class ZiXunFragment extends BaseFragment {


    @BindView(R.id.rela_item)
    RelativeLayout relaItem;

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_zi_xun;
    }

    @OnClick(R.id.rela_item)
    public void onViewClicked() {
        startActivity(new Intent(getActivity(), ZiXunInfoActivity.class));
    }
}
