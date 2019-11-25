package com.example.myapplication.hangqin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseFragment;
import com.example.myapplication.hangqin.fragment.Hq_BiZhongFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class HangQinFragment extends BaseFragment {

    @BindView(R.id.tab)
    TabLayout tab;
    @BindView(R.id.viewPager)
    ViewPager viewPager;

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }

    @Override
    protected void initData() {
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new Hq_BiZhongFragment());
        fragments.add(new Hq_BiZhongFragment());
        fragments.add(new Hq_BiZhongFragment());
        fragments.add(new Hq_BiZhongFragment());
        fragments.add(new Hq_BiZhongFragment());
        fragments.add(new Hq_BiZhongFragment());
        fragments.add(new Hq_BiZhongFragment());

        viewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
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
        tab.getTabAt(0).setCustomView(getCurrentFocus("ETH", R.drawable.tab_hangqin_bg));
        tab.getTabAt(1).setCustomView(getCurrentFocus("BTC", R.drawable.tab_hangqin_bg));
        tab.getTabAt(2).setCustomView(getCurrentFocus("LTC", R.drawable.tab_hangqin_bg));
        tab.getTabAt(3).setCustomView(getCurrentFocus("USDT", R.drawable.tab_hangqin_bg));
        tab.getTabAt(4).setCustomView(getCurrentFocus("ETC", R.drawable.tab_hangqin_bg));
        tab.getTabAt(5).setCustomView(getCurrentFocus("ETH", R.drawable.tab_hangqin_bg));
        tab.getTabAt(6).setCustomView(getCurrentFocus("BTC", R.drawable.tab_hangqin_bg));
    }

    public View getCurrentFocus(String title, int drawable) {
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tab_hangqin, null);
        TextView text = inflate.findViewById(R.id.text);
        text.setText(title);
        TextView text_bg = inflate.findViewById(R.id.text_bg);
        text_bg.setBackgroundResource(drawable);
        return inflate;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_hang_qin;
    }
}
