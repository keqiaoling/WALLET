package com.example.myapplication.wode.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseFragment;
import com.example.myapplication.okhttp.OkHttpUtils;
import com.example.myapplication.okhttp.callback.ResponseCallBack;
import com.example.myapplication.okhttp.callback.ResultModelCallback;
import com.example.myapplication.utils.SharedPreferenceUtils;
import com.example.myapplication.utils.ToastUtils;
import com.example.myapplication.wode.UserinFoBean;
import com.example.myapplication.wode.activity.FanKuiActivity;
import com.example.myapplication.wode.activity.GuanYuActivity;
import com.example.myapplication.wode.activity.ShouYiActivity;
import com.example.myapplication.wode.activity.TuanDuiActivity;
import com.example.myapplication.wode.activity.UserInfoActivity;
import com.example.myapplication.wode.activity.WenTiActivity;
import com.example.myapplication.wode.activity.YaoQingActivity;

import org.json.JSONException;

import java.util.Objects;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class WoDeFragment extends BaseFragment {

    @BindView(R.id.image_tuiChu)
    ImageView imageTuiChu;
    @BindView(R.id.image_xiaoXi)
    ImageView imageXiaoXi;
    @BindView(R.id.image_sheZhi)
    ImageView imageSheZhi;
    @BindView(R.id.image_touxiang)
    ImageView imageTouxiang;
    @BindView(R.id.rela_info)
    RelativeLayout relaInfo;
    @BindView(R.id.rela_tuanDui)
    RelativeLayout relaTuanDui;
    @BindView(R.id.rela_yaoQing)
    RelativeLayout relaYaoQing;
    @BindView(R.id.rela_renWu)
    RelativeLayout relaRenWu;
    @BindView(R.id.rela_aaa)
    LinearLayout relaAaa;
    @BindView(R.id.rela_dingDan)
    RelativeLayout relaDingDan;
    @BindView(R.id.rela_shouYi)
    RelativeLayout relaShouYi;
    @BindView(R.id.rela_wenTi)
    RelativeLayout relaWenTi;
    @BindView(R.id.rela_fanKui)
    RelativeLayout relaFanKui;
    @BindView(R.id.rela_yuYan)
    RelativeLayout relaYuYan;
    @BindView(R.id.rela_zhuTi)
    RelativeLayout relaZhuTi;
    @BindView(R.id.user_info)
    TextView userInfo;
    @BindView(R.id.user_id)
    TextView userId;

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }

    @Override
    protected void initData() {
        getUSerinfo();
    }

    @OnClick({R.id.image_tuiChu, R.id.image_xiaoXi, R.id.image_sheZhi, R.id.rela_tuanDui,
            R.id.rela_yaoQing, R.id.rela_dingDan, R.id.rela_shouYi, R.id.rela_wenTi,
            R.id.rela_fanKui, R.id.rela_yuYan, R.id.rela_zhuTi, R.id.rela_guanYu, R.id.rela_renWu})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.image_tuiChu:
                break;
            case R.id.image_xiaoXi:
                break;
            case R.id.image_sheZhi:
                startActivity(new Intent(getActivity(), UserInfoActivity.class));
                break;
            case R.id.rela_tuanDui:
                startActivity(new Intent(getActivity(), TuanDuiActivity.class));
                break;
            case R.id.rela_yaoQing:
                startActivity(new Intent(getActivity(), YaoQingActivity.class));
                break;
            case R.id.rela_dingDan:
                ToastUtils.showToast("暂未开放");
                break;
            case R.id.rela_shouYi:
                startActivity(new Intent(getActivity(), ShouYiActivity.class));
                break;
            case R.id.rela_wenTi:
                startActivity(new Intent(getActivity(), WenTiActivity.class));
                break;
            case R.id.rela_fanKui:
                startActivity(new Intent(getActivity(), FanKuiActivity.class));
                break;
            case R.id.rela_yuYan:
                break;
            case R.id.rela_zhuTi:
                break;
            case R.id.rela_guanYu:
                startActivity(new Intent(getActivity(), GuanYuActivity.class));
                break;
            case R.id.rela_renWu:
                ToastUtils.showToast("暂未开放");
                break;
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_wo_de;
    }

    private void getUSerinfo() {
        OkHttpUtils.get().
                addHeader("Authorization", SharedPreferenceUtils.getToken())
                .url(ZgwApplication.appRequestUrl + "v1/auth/me")
                .build().execute(new ResultModelCallback(getContext(), new ResponseCallBack<UserinFoBean>() {
            @Override
            public void onError(String e) {

            }

            @Override
            public void onResponse(UserinFoBean response) throws JSONException {
                if (response != null) {
                    userInfo.setText(response.getData().getNickname());

                    RequestOptions requestOptions = RequestOptions.circleCropTransform();
                    Glide.with(Objects.requireNonNull(getContext()))
                            .load(response.getData().getAvatar())
                            .apply(requestOptions)
                            .into(imageTouxiang);
                    userId.setText("ID:"+response.getData().getId());
                }
            }


        }));
    }

    @Override
    public void onResume() {
        super.onResume();
        getUSerinfo();
    }
}
