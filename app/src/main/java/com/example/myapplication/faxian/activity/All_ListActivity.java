package com.example.myapplication.faxian.activity;

import android.content.Intent;
import android.view.View;
import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;
import butterknife.OnClick;

public class All_ListActivity extends BaseActivity {

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.rela_chongBi, R.id.rela_tiBi, R.id.rela_shouKuan, R.id.rela_fuKuan, R.id.rela_biDui, R.id.rela_heYue, R.id.back,
            R.id.rela_youXi, R.id.rela_shangCheng, R.id.rela_jiaoYiSuo, R.id.rela_sheQu, R.id.rela_touPiao, R.id.rela_shengTai})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rela_chongBi:

                break;
            case R.id.rela_tiBi:
                break;
            case R.id.rela_shouKuan:
                break;
            case R.id.rela_fuKuan:
                break;
            case R.id.rela_biDui:
                startActivity(new Intent(All_ListActivity.this,BiDuiActivity.class));
                break;
            case R.id.rela_heYue:
                startActivity(new Intent(All_ListActivity.this,HeYueActivity.class));
                break;
            case R.id.rela_youXi:
                break;
            case R.id.rela_shangCheng:
                break;
            case R.id.rela_jiaoYiSuo:
                break;
            case R.id.rela_sheQu:
                startActivity(new Intent(All_ListActivity.this,SheQuActivity.class));
                break;
            case R.id.rela_touPiao:
                break;
            case R.id.rela_shengTai:
                break;
            case R.id.back:
                finish();
                break;
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_all__list;
    }
}
