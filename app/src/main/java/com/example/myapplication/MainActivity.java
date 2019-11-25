package com.example.myapplication;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.base.CompatStatusBarActivity;
import com.example.myapplication.faxian.fragment.FaXianFragment;
import com.example.myapplication.hangqin.fragment.HangQinFragment;
import com.example.myapplication.utils.StatusBarUtil;
import com.example.myapplication.wode.fragment.WoDeFragment;
import com.example.myapplication.zichan.fragment.ZiChanFragment;
import com.example.myapplication.zixun.fragment.ZiXunFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends CompatStatusBarActivity {

    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.tab)
    TabLayout tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setViewColorStatusBar(false, getResources().getColor(R.color.white_bg));
        View decor = getWindow().getDecorView();
        boolean dark = true;
        if (dark) {
            decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        } else {
            decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        }
        tab();
    }

    private void tab() {
        List<Fragment> fragment = new ArrayList<>();
        fragment.add(new ZiChanFragment());
        fragment.add(new HangQinFragment());
        fragment.add(new FaXianFragment());
        fragment.add(new ZiXunFragment());
        fragment.add(new WoDeFragment());

        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragment.get(position);
            }

            @Override
            public int getCount() {
                return fragment.size();
            }
        });

        tab.setupWithViewPager(viewPager);
        tab.getTabAt(0).setCustomView(getCurrentFocus(R.string.tab_zichan, R.drawable.tab_zichan));
        tab.getTabAt(1).setCustomView(getCurrentFocus(R.string.tab_hangqin, R.drawable.tab_hangqin));
        tab.getTabAt(2).setCustomView(getCurrentFocus(R.string.tab_faxian, R.drawable.tab_faxian));
        tab.getTabAt(3).setCustomView(getCurrentFocus(R.string.tab_zixun, R.drawable.tab_zixun));
        tab.getTabAt(4).setCustomView(getCurrentFocus(R.string.tab_wode, R.drawable.tab_wode));

        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 1 ) {
                    setStatusBarPlaceVisible(true);
                    setViewColorStatusBar(false, getResources().getColor(R.color.hangqin_bg));
                    View decor = getWindow().getDecorView();
                    boolean dark = true;
                    if (dark) {
                        decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
                    } else {
                        decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
                    }
                } else if (tab.getPosition() == 0 || tab.getPosition() == 2 || tab.getPosition() == 3) {
                    setStatusBarPlaceVisible(true);
                    setViewColorStatusBar(false, getResources().getColor(R.color.white_bg));
                    View decor = getWindow().getDecorView();
                    boolean dark = true;
                    if (dark) {
                        decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
                    } else {
                        decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
                    }
                }else {
                    setStatusBarPlaceVisible(false);
                    setViewColorStatusBar(false, Color.WHITE);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    protected void setStatusBar(@ColorInt int color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

            // 设置状态栏底色颜色
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            StatusBarUtil.setRootViewFitsSystemWindows(MainActivity.this, true);
            getWindow().setStatusBarColor(color);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);
        }
    }

    public View getCurrentFocus(int a, int drawable) {
        View inflate = LayoutInflater.from(this).inflate(R.layout.tab_main, null);
        TextView text = inflate.findViewById(R.id.text);
        text.setText(a);
        ImageView image = inflate.findViewById(R.id.tab_image);
        image.setImageResource(drawable);
        return inflate;
    }
}
