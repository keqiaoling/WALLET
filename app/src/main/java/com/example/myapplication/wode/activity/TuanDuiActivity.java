package com.example.myapplication.wode.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.faxian.activity.HeYueActivity;
import com.example.myapplication.faxian.fragment.QuXiaoFragment;
import com.example.myapplication.faxian.fragment.ShouYiFragment;
import com.example.myapplication.faxian.fragment.WanChengFragment;
import com.example.myapplication.wode.fragment.TuanDuiFragment;
import com.example.myapplication.wode.fragment.ZhiTuiFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TuanDuiActivity extends BaseActivity {

    @BindView(R.id.back)
    ImageButton back;
    @BindView(R.id.tab)
    TabLayout tab;
    @BindView(R.id.viewPager)
    ViewPager viewPager;

    @Override
    protected void initView() {

    }

    @OnClick(R.id.back)
    public void onViewClicked() {
        finish();
    }

    @Override
    protected void initData() {
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new TuanDuiFragment());
        fragments.add(new ZhiTuiFragment());

        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        });

        tab.setupWithViewPager(viewPager);
        tab.getTabAt(0).setCustomView(getCurrentFocus(R.string.text_tdrs, R.drawable.tab_heyue_bg));
        tab.getTabAt(1).setCustomView(getCurrentFocus(R.string.text_ztrs, R.drawable.tab_heyue_bg));
    }

    public View getCurrentFocus(int title, int drawable) {
        View inflate = LayoutInflater.from(TuanDuiActivity.this).inflate(R.layout.tab_heyue, null);
        TextView text = inflate.findViewById(R.id.text);
        text.setText(title);
        TextView text_bg = inflate.findViewById(R.id.text_bg);
        text_bg.setBackgroundResource(drawable);
        return inflate;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_tuan_dui;
    }
}
