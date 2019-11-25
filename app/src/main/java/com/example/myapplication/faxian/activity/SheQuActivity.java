package com.example.myapplication.faxian.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.faxian.bean.HomeBean;
import com.example.myapplication.faxian.bean.SheQuBean;
import com.example.myapplication.okhttp.OkHttpUtils;
import com.example.myapplication.okhttp.callback.ResponseCallBack;
import com.example.myapplication.okhttp.callback.ResultModelCallback;
import com.example.myapplication.utils.MoneyUtils;
import com.example.myapplication.utils.SharedPreferenceUtils;
import com.example.myapplication.utils.StatusBarUtil;
import com.example.myapplication.wode.activity.MingXiActivity;

import org.json.JSONException;

import java.math.BigDecimal;

import butterknife.BindView;
import butterknife.OnClick;

public class SheQuActivity extends BaseActivity {

    @BindView(R.id.text_name)
    TextView textName;
    @BindView(R.id.text_contract_my)
    TextView textContractMy;
    @BindView(R.id.text_name2)
    TextView textName2;
    @BindView(R.id.text_team_number)
    TextView textTeamNumber;
    @BindView(R.id.text_team_money)
    TextView textTeamMoney;
    @BindView(R.id.text_income_my)
    TextView textIncomeMy;
    @BindView(R.id.lin_bg)
    LinearLayout linBg;
    @BindView(R.id.text_income_my2)
    TextView textIncomeMy2;
    @BindView(R.id.text_income_my_today)
    TextView textIncomeMyToday;
    @BindView(R.id.text_income_team)
    TextView textIncomeTeam;
    @BindView(R.id.text_income_team_today)
    TextView textIncomeTeamToday;
    @BindView(R.id.text_daishu)
    TextView textDaishu;
    @BindView(R.id.text_weight)
    TextView textWeight;
    @BindView(R.id.text_commission)
    TextView textCommission;
    @BindView(R.id.text_commission_game)
    TextView textCommissionGame;
    @BindView(R.id.text_commission_goods)
    TextView textCommissionGoods;
    @BindView(R.id.text_sideways)
    TextView textSideways;
    @BindView(R.id.text_sideways2)
    TextView textSideways2;
    @BindView(R.id.text_sideways3)
    TextView textSideways3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.setColor(SheQuActivity.this, getResources().getColor(R.color.search_bg), 0);
    }

    @Override
    protected void initView() {
        user();
        info();
    }

    private void info() {
        OkHttpUtils.post()
                .url(ZgwApplication.appRequestUrl + "v1/contract/team_info")
                .addHeader("Authorization", SharedPreferenceUtils.getToken())
                .build()
                .execute(new ResultModelCallback(this, new ResponseCallBack<SheQuBean>() {
                    @Override
                    public void onError(String e) {

                    }

                    @Override
                    public void onResponse(SheQuBean response) throws JSONException {
                        if (response.getData() != null) {

                            textCommission.setText("≈$" + MoneyUtils.decimalByUp(4, new BigDecimal(Double.parseDouble(response.getData().getCommission() + ""))));
                            textCommissionGame.setText("≈$" + MoneyUtils.decimalByUp(4, new BigDecimal(Double.parseDouble(response.getData().getCommission_game() + ""))));
                            textCommissionGoods.setText("≈$" + MoneyUtils.decimalByUp(4, new BigDecimal(Double.parseDouble(response.getData().getCommission_goods() + ""))));
                            textContractMy.setText("≈$" + MoneyUtils.decimalByUp(4, new BigDecimal(Double.parseDouble(response.getData().getContract_my() + ""))));
                            textDaishu.setText("≈$" + MoneyUtils.decimalByUp(4, new BigDecimal(Double.parseDouble(response.getData().getDaishu() + ""))));
                            textIncomeMy.setText("≈$" + MoneyUtils.decimalByUp(4, new BigDecimal(Double.parseDouble(response.getData().getIncome_my() + ""))));
                            textIncomeMy2.setText("≈$" + MoneyUtils.decimalByUp(4, new BigDecimal(Double.parseDouble(response.getData().getIncome_my() + ""))));
                            textIncomeMyToday.setText("≈$" + MoneyUtils.decimalByUp(4, new BigDecimal(Double.parseDouble(response.getData().getIncome_my_today() + ""))));
                            textIncomeTeam.setText("≈$" + MoneyUtils.decimalByUp(4, new BigDecimal(Double.parseDouble(response.getData().getIncome_team() + ""))));
                            textIncomeTeamToday.setText("≈$" + MoneyUtils.decimalByUp(4, new BigDecimal(Double.parseDouble(response.getData().getIncome_team_today() + ""))));
                            textSideways.setText("≈$" + MoneyUtils.decimalByUp(4, new BigDecimal(Double.parseDouble(response.getData().getSideways() + ""))));
                            textSideways2.setText("≈$" + MoneyUtils.decimalByUp(4, new BigDecimal(Double.parseDouble(response.getData().getSideways() + ""))));
                            textSideways3.setText("≈$" + MoneyUtils.decimalByUp(4, new BigDecimal(Double.parseDouble(response.getData().getSideways() + ""))));
                            textTeamMoney.setText("≈$" + MoneyUtils.decimalByUp(4, new BigDecimal(Double.parseDouble(response.getData().getTeam_money() + ""))));
                            textTeamNumber.setText("≈$" + MoneyUtils.decimalByUp(4, new BigDecimal(Double.parseDouble(response.getData().getTeam_number() + ""))));
                            textWeight.setText("≈$" + MoneyUtils.decimalByUp(4, new BigDecimal(Double.parseDouble(response.getData().getWeight() + ""))));
                        }
                    }
                }));
    }

    private void user() {
        OkHttpUtils.get()
                .url(ZgwApplication.appRequestUrl + "v1/home")
                .addHeader("Authorization", SharedPreferenceUtils.getToken())
                .build()
                .execute(new ResultModelCallback(this, new ResponseCallBack<HomeBean>() {
                    @Override
                    public void onError(String e) {

                    }

                    @Override
                    public void onResponse(HomeBean response) throws JSONException {
                        if (response.getData().getInfo() != null) {
                            textName.setText(response.getData().getInfo().getLevel_name());
                            textName2.setText(response.getData().getInfo().getLevel_name());

                            if (response.getData().getInfo().getLevel_name().equals("初级会员")) {
                                linBg.setBackgroundResource(R.mipmap.sq_chuji);
                            } else if (response.getData().getInfo().getLevel_name().equals("普通会员")) {
                                linBg.setBackgroundResource(R.mipmap.sq_putong);
                            } else if (response.getData().getInfo().getLevel_name().equals("中级会员")) {
                                linBg.setBackgroundResource(R.mipmap.sq_zhongji);
                            } else if (response.getData().getInfo().getLevel_name().equals("高级会员")) {
                                linBg.setBackgroundResource(R.mipmap.sq_gaoji);
                            } else if (response.getData().getInfo().getLevel_name().equals("超级会员")) {
                                linBg.setBackgroundResource(R.mipmap.sq_chaoji);
                            } else if (response.getData().getInfo().getLevel_name().equals("环球会员")) {
                                linBg.setBackgroundResource(R.mipmap.sq_huanqiu);
                            }
                        }
                    }
                }));
    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.back, R.id.lin_gerenShouyi, R.id.lin_gerenShouyi, R.id.lin_tdzsy, R.id.lin_tdjrzsy, R.id.lin_dssy, R.id.lin_jqfh, R.id.lin_styjsy, R.id.lin_styjpjsy})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.lin_gerenShouyi:
                Intent intent = new Intent(SheQuActivity.this, MingXiActivity.class);
                intent.putExtra("type","");
                startActivity(intent);
                break;
            case R.id.lin_tdzsy:
                Intent intent1 = new Intent(SheQuActivity.this, MingXiActivity.class);
                intent1.putExtra("type","");
                startActivity(intent1);
                break;
            case R.id.lin_tdjrzsy:
                Intent intent2 = new Intent(SheQuActivity.this, MingXiActivity.class);
                intent2.putExtra("type","");
                startActivity(intent2);
                break;
            case R.id.lin_dssy:
                Intent intent3 = new Intent(SheQuActivity.this, MingXiActivity.class);
                intent3.putExtra("type","9");
                startActivity(intent3);
                break;
            case R.id.lin_jqfh:
                Intent intent4 = new Intent(SheQuActivity.this, MingXiActivity.class);
                intent4.putExtra("type","19");
                startActivity(intent4);
                break;
            case R.id.lin_styjsy:
                Intent intent5 = new Intent(SheQuActivity.this, MingXiActivity.class);
                intent5.putExtra("type","17");
                startActivity(intent5);
                break;
            case R.id.lin_styjpjsy:
                Intent intent6 = new Intent(SheQuActivity.this, MingXiActivity.class);
                intent6.putExtra("type","18");
                startActivity(intent6);
                break;
            case R.id.back:
                finish();
                break;
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_she_qu;
    }
}
