package com.example.myapplication.faxian.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.faxian.bean.HeYueBean;
import com.example.myapplication.faxian.bean.ShouYiBean;
import com.example.myapplication.faxian.fragment.QuXiaoFragment;
import com.example.myapplication.faxian.fragment.ShouYiFragment;
import com.example.myapplication.faxian.fragment.WanChengFragment;
import com.example.myapplication.okhttp.OkHttpUtils;
import com.example.myapplication.okhttp.callback.ResponseCallBack;
import com.example.myapplication.okhttp.callback.ResultModelCallback;
import com.example.myapplication.utils.SharedPreferenceUtils;
import com.example.myapplication.utils.StatusBarUtil;
import com.google.android.material.tabs.TabLayout;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class HeYueActivity extends BaseActivity {

    @BindView(R.id.back)
    ImageButton back;
    @BindView(R.id.tab)
    TabLayout tab;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.text_ljtz)
    TextView textLjtz;
    @BindView(R.id.text_ztx)
    TextView textZtx;
    @BindView(R.id.text_jrsy)
    TextView textJrsy;
    @BindView(R.id.text_zsy)
    TextView textZsy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.setColor(HeYueActivity.this, getResources().getColor(R.color.search_bg), 0);
    }

    @Override
    protected void initView() {
        info();
    }

    private void info() {
        OkHttpUtils.get()
                .url(ZgwApplication.appRequestUrl + "v1/contract/contract_money")
                .addHeader("Authorization", SharedPreferenceUtils.getToken())
                .build()
                .execute(new ResultModelCallback(this, new ResponseCallBack<HeYueBean>() {
                    @Override
                    public void onError(String e) {

                    }

                    @Override
                    public void onResponse(HeYueBean response) throws JSONException {
                        if(response.getData()!=null){
                            textZtx.setText("≈$"+response.getData().getInvestment());
                            textZsy.setText("≈$"+response.getData().getIncome());
                            textJrsy.setText("≈$"+response.getData().getToday_income());
                        }
                    }
                }));
    }

    @Override
    protected void initData() {
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new ShouYiFragment());
        fragments.add(new WanChengFragment());
        fragments.add(new QuXiaoFragment());

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
        tab.getTabAt(0).setCustomView(getCurrentFocus(R.string.text_syz, R.drawable.tab_heyue_bg));
        tab.getTabAt(1).setCustomView(getCurrentFocus(R.string.text_ywc, R.drawable.tab_heyue_bg));
        tab.getTabAt(2).setCustomView(getCurrentFocus(R.string.text_yqx, R.drawable.tab_heyue_bg));
    }

    public View getCurrentFocus(int title, int drawable) {
        View inflate = LayoutInflater.from(HeYueActivity.this).inflate(R.layout.tab_heyue, null);
        TextView text = inflate.findViewById(R.id.text);
        text.setText(title);
        TextView text_bg = inflate.findViewById(R.id.text_bg);
        text_bg.setBackgroundResource(drawable);
        return inflate;
    }

    @OnClick({R.id.back, R.id.text_ljtz})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.text_ljtz:
                startActivity(new Intent(HeYueActivity.this, LiJiTouZiActivity.class));
                break;
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_he_yue;
    }
}
