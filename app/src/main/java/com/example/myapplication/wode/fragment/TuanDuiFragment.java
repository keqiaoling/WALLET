package com.example.myapplication.wode.fragment;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseFragment;
import com.example.myapplication.okhttp.OkHttpUtils;
import com.example.myapplication.okhttp.callback.ResponseCallBack;
import com.example.myapplication.okhttp.callback.ResultModelCallback;
import com.example.myapplication.utils.SharedPreferenceUtils;
import com.example.myapplication.utils.ToastUtils;
import com.example.myapplication.wode.MyTeamBean;
import com.example.myapplication.wode.TeaminfoBean;
import com.example.myapplication.wode.adapter.MyTeamAdapter;
import com.wuxiaolong.pullloadmorerecyclerview.PullLoadMoreRecyclerView;

import org.json.JSONException;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class TuanDuiFragment extends BaseFragment {

    @BindView(R.id.earnings)
    TextView earnings;
    @BindView(R.id.people_size)
    TextView peopleSize;
    @BindView(R.id.recycl)
    PullLoadMoreRecyclerView recyZiyuan;
    private ArrayList<MyTeamBean.DataBeanX.DataBean> dataBeans;
    private MyTeamAdapter myTeamAdapter;
    private int page=1;
    private String next_page_url;

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }

    @Override
    protected void initData() {
       dataBeans = new ArrayList<>();
        recyZiyuan.setLinearLayout();
        myTeamAdapter = new MyTeamAdapter(dataBeans, getContext());
        recyZiyuan.setAdapter(myTeamAdapter);
        recyZiyuan.setPullRefreshEnable(false);
        recyZiyuan.setOnPullLoadMoreListener(new PullLoadMoreRecyclerView.PullLoadMoreListener() {
            @Override
            public void onRefresh() {

            }

            @Override
            public void onLoadMore() {


                getLsit(next_page_url);

                recyZiyuan.setPullLoadMoreCompleted();
            }
        });
        next_page_url= ZgwApplication.appRequestUrl+"v1/auth/teams/1";
        getLsit(next_page_url);
        getTeaminfo();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_tuan_dui;
    }
    public void getLsit(String url){
        Log.d("moxun", "getLsit: "+url);
        OkHttpUtils.get().   addHeader("Authorization", SharedPreferenceUtils.getToken())
                .url(url)

                .build().execute(new ResultModelCallback(getContext(), new ResponseCallBack<MyTeamBean>() {
            @Override
            public void onError(String e) {
                ToastUtils.showToast(e);
            }

            @Override
            public void onResponse(MyTeamBean response) throws JSONException {

                next_page_url = response.getData().getNext_page_url();
                if(response.getData().getData()!=null){
                    if(response.getData().getData().size()>0){

                        dataBeans.addAll(response.getData().getData());
                        for (int i = 0; i < dataBeans.size(); i++) {
                            Log.d("-------------", "onResponse: "+dataBeans.get(i).getUser().getAvatar());
                        }
                        myTeamAdapter.notifyDataSetChanged();
                    }else {

                        ToastUtils.showToast("暂无成员");
                    }
                }

            }
        }));
    }
    public void getTeaminfo(){
        OkHttpUtils.post().addHeader("Authorization", SharedPreferenceUtils.getToken()).url(ZgwApplication.appRequestUrl+"v1/contract/team_info")
                .build().execute(new ResultModelCallback(getContext(), new ResponseCallBack<TeaminfoBean>() {
            @Override
            public void onError(String e) {
                ToastUtils.showToast(e);
            }

            @Override
            public void onResponse(TeaminfoBean response) throws JSONException {

                peopleSize.setText(response.getData().getTeam_number()+"");
                earnings.setText(response.getData().getIncome_team());
            }
        }));

    }
}
