package com.example.myapplication.wode.activity;

import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.okhttp.OkHttpUtils;
import com.example.myapplication.okhttp.callback.ResponseCallBack;
import com.example.myapplication.okhttp.callback.ResultModelCallback;
import com.example.myapplication.utils.SharedPreferenceUtils;
import com.example.myapplication.utils.ToastUtils;
import com.example.myapplication.wode.ShouyiBean;
import com.example.myapplication.wode.ShouyiListBean;
import com.example.myapplication.wode.adapter.ShouyingListAdapter;
import com.wuxiaolong.pullloadmorerecyclerview.PullLoadMoreRecyclerView;

import org.json.JSONException;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

public class ShouYiActivity extends BaseActivity {

    @BindView(R.id.back)
    ImageButton back;

    @BindView(R.id.Income)
    TextView Income;
    @BindView(R.id.today_Income)
    TextView todayIncome;
    @BindView(R.id.recycl)
    PullLoadMoreRecyclerView recyZiyuan;
    private ArrayList<ShouyiListBean.DataBeanX.DataBean> dataBeans;
    private ShouyingListAdapter shouyingListAdapter;
    private String next_page_url;

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        getShouyi();
        dataBeans = new ArrayList<>();
        shouyingListAdapter = new ShouyingListAdapter(dataBeans,this);
        recyZiyuan.setLinearLayout();
        recyZiyuan.setAdapter(shouyingListAdapter);
        recyZiyuan.setPullRefreshEnable(false);
        recyZiyuan.setOnPullLoadMoreListener(new PullLoadMoreRecyclerView.PullLoadMoreListener() {
            @Override
            public void onRefresh() {

            }

            @Override
            public void onLoadMore() {


                getList(next_page_url);

                recyZiyuan.setPullLoadMoreCompleted();
            }
        });
        next_page_url= ZgwApplication.appRequestUrl + "v1/wallet/team_logs";
        getList(next_page_url);
    }

    @OnClick({R.id.back})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
//            case R.id.rela_item:
//                startActivity(new Intent(ShouYiActivity.this, MingXiActivity.class));
//                break;
        }
    }

    public void getShouyi() {
        OkHttpUtils.get().addHeader("Authorization", SharedPreferenceUtils.getToken()).url(ZgwApplication.appRequestUrl + "v1/contract/account_money")
                .build().execute(new ResultModelCallback(this, new ResponseCallBack<ShouyiBean>() {
            @Override
            public void onError(String e) {
                ToastUtils.showToast(e);
            }

            @Override
            public void onResponse(ShouyiBean response) throws JSONException {

                Income.setText(response.getData().getIncome());
                todayIncome.setText(response.getData().getToday_income());
            }
        }));
    }

    public void getList(String url) {
        OkHttpUtils.get().addHeader("Authorization", SharedPreferenceUtils.getToken()).url(url)
                .build().execute(new ResultModelCallback(this, new ResponseCallBack<ShouyiListBean>() {
            @Override
            public void onError(String e) {
                ToastUtils.showToast(e);
            }

            @Override
            public void onResponse(ShouyiListBean response) throws JSONException {
                next_page_url = response.getData().getNext_page_url();
                if (response.getData().getData() != null) {
                    if (response.getData().getData().size() > 0) {

                        dataBeans.addAll(response.getData().getData());
                        for (int i = 0; i < dataBeans.size(); i++) {
                            Log.d("-------------", "onResponse: " + dataBeans.get(i).getUser().getAvatar());
                        }
                        shouyingListAdapter.notifyDataSetChanged();
                    } else {

                        ToastUtils.showToast("暂无成员");
                    }
                }

            }
        }));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_shou_yi;
    }


}
