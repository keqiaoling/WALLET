package com.example.myapplication.faxian.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseFragment;
import com.example.myapplication.faxian.activity.All_ListActivity;
import com.example.myapplication.faxian.activity.BiDuiActivity;
import com.example.myapplication.faxian.activity.FaXianWebActivity;
import com.example.myapplication.faxian.activity.HeYueActivity;
import com.example.myapplication.faxian.activity.SheQuActivity;
import com.example.myapplication.faxian.activity.YouXiActivity;
import com.example.myapplication.faxian.bean.HomeBean;
import com.example.myapplication.faxian.bean.ShouYiBean;
import com.example.myapplication.okhttp.OkHttpUtils;
import com.example.myapplication.okhttp.callback.ResponseCallBack;
import com.example.myapplication.okhttp.callback.ResultModelCallback;
import com.example.myapplication.utils.SharedPreferenceUtils;
import com.example.myapplication.zichan.activity.WalletInfoActivity;
import com.example.myapplication.zichan.bean.WalletInFoBean;
import com.sonnyjack.widget.dragview.SonnyJackDragView;
import com.xuezj.cardbanner.CardBanner;
import com.xuezj.cardbanner.ImageData;
import com.xuezj.cardbanner.imageloader.CardImageLoader;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class FaXianFragment extends BaseFragment {

    @BindView(R.id.banner)
    CardBanner banner;
    @BindView(R.id.image_shaizi)
    ImageView imageShaizi;
    private LinearLayout mLin_title;
    private PopupWindow mPop;
    private List<ImageData> mImageList;
    private TextView mText_number;
    private TextView mText_title1;
    private TextView mText_title2;

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }

    @Override
    protected void initData() {
        mImageList = new ArrayList<>();
        xianShi();
        pop();
        shouYi();
    }

    private void shouYi() {
        OkHttpUtils.get()
                .url(ZgwApplication.appRequestUrl + "v1/contract/receiveIncome")
                .addHeader("Authorization", SharedPreferenceUtils.getToken())
                .build()
                .execute(new ResultModelCallback(getActivity(), new ResponseCallBack<ShouYiBean>() {
                    @Override
                    public void onError(String e) {

                    }

                    @Override
                    public void onResponse(ShouYiBean response) throws JSONException {
                        if(response.getData()!=null){
                            mText_number.setText(response.getData().getNumber()+"XCN");
                            mText_title1.setText(response.getData().getMsg1());
                            mText_title2.setText(response.getData().getMsg2());
                        }
                    }
                }));
    }

    private void xianShi() {
        OkHttpUtils.get()
                .url(ZgwApplication.appRequestUrl + "v1/home")
                .addHeader("Authorization", SharedPreferenceUtils.getToken())
                .build()
                .execute(new ResultModelCallback(getActivity(), new ResponseCallBack<HomeBean>() {
                    @Override
                    public void onError(String e) {

                    }

                    @Override
                    public void onResponse(HomeBean response) throws JSONException {
                        int is_show = response.getData().getInfo().getIs_show();
                        if(is_show==1){
                            imageShaizi.setVisibility(View.VISIBLE);
                        }
                        if(response.getData().getSlide()!=null){
                            if(response.getData().getSlide().size()!=0){
                                for(int i=0;i<response.getData().getSlide().size();i++){
                                    ImageData imageData = new ImageData();
                                    imageData.setImage(response.getData().getSlide().get(i).getCover());
                                    mImageList.add(imageData);
                                }
                            }

                            banner.setDatas(mImageList).setCardImageLoader(new CardImageLoader() {
                                @Override
                                public void load(Context context, ImageView imageView, Object path) {
                                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    String imagePath;
                                    try {
                                        imagePath = (String) path;
                                        imagePath = imagePath.trim();
                                        RequestOptions options = new RequestOptions().transforms(new CenterCrop(), new RoundedCorners(10));
                                        Glide.with(getActivity()).load(imagePath).apply(options).into(imageView);
                                    } catch (Exception e) {
                                        if(path!=null&&imageView!=null){
                                            Glide.with(getActivity()).load(path).into(imageView);
                                        }
                                    }

                                }
                            }).setPlay(true).setDelayTime(4500).start();
                        }
                    }
                }));
    }

    private void pop() {
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.pop_shouyi, null);
        mLin_title = inflate.findViewById(R.id.lin_title);
        mText_number = inflate.findViewById(R.id.text_number);
        mText_title1 = inflate.findViewById(R.id.text_title1);
        mText_title2 = inflate.findViewById(R.id.text_title2);
        mPop = new PopupWindow(inflate, ViewPager.MarginLayoutParams.MATCH_PARENT, ViewPager.MarginLayoutParams.MATCH_PARENT);
        inflate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPop.dismiss();
            }
        });
    }

    @OnClick({R.id.rela_chongBi, R.id.rela_tiBi, R.id.rela_biDui, R.id.rela_heYue, R.id.rela_shangCheng,
            R.id.rela_fuKuan, R.id.rela_saoMa, R.id.rela_all, R.id.lin_heyue, R.id.lin_shequ, R.id.lin_bidui,
            R.id.lin_minpian, R.id.rela_MyToken, R.id.rela_Bishijie, R.id.rela_Zuanbi8, R.id.rela_FN, R.id.rela_Jsgu,
            R.id.rela_feixiaohao, R.id.rela_Biki, R.id.rela_Binance, R.id.rela_Huobi, R.id.rela_Zb, R.id.rela_CoinW,
            R.id.rela_Gateio, R.id.rela_Bittrex, R.id.rela_Bibox, R.id.rela_Fubt, R.id.rela_BTB, R.id.rela_Dfex,
            R.id.rela_ZT, R.id.rela_Loex, R.id.rela_Coinbig, R.id.rela_KuCoin, R.id.rela_Omni, R.id.rela_BTC,
            R.id.rela_Etherscan, R.id.rela_EosPark, R.id.rela_Tokenview, R.id.rela_winni, R.id.rela_Crypto,
            R.id.rela_bingBet, R.id.rela_endless, R.id.rela_big_game, R.id.rela_prabox, R.id.rela_Trust,
            R.id.rela_token_planet, R.id.rela_xwsc, R.id.rela_fwfsc,R.id.image_shaizi})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rela_chongBi:
                break;
            case R.id.rela_tiBi:
                break;
            case R.id.rela_biDui:
                startActivity(new Intent(getActivity(), BiDuiActivity.class));
                break;
            case R.id.rela_heYue:
                startActivity(new Intent(getActivity(), HeYueActivity.class));
                break;
            case R.id.rela_shangCheng:
                break;
            case R.id.rela_fuKuan://游戏
                startActivity(new Intent(getActivity(), YouXiActivity.class));
                break;
            case R.id.rela_saoMa:
                break;
            case R.id.rela_all:
                startActivity(new Intent(getActivity(), All_ListActivity.class));
                break;
            case R.id.lin_heyue:
                startActivity(new Intent(getActivity(), HeYueActivity.class));
                break;
            case R.id.lin_shequ:
                startActivity(new Intent(getActivity(), SheQuActivity.class));
                break;
            case R.id.lin_bidui:
                startActivity(new Intent(getActivity(), BiDuiActivity.class));
                break;
            case R.id.lin_minpian:
                break;
            case R.id.rela_MyToken:
                start("https://www.mytoken.io/");
                break;
            case R.id.rela_Bishijie:
                start("https://m.bishijie.com");
                break;
            case R.id.rela_Zuanbi8:
                start("https://www.zuanbi8.com");
                break;
            case R.id.rela_FN:
                start("https://m.fn.com/");
                break;
            case R.id.rela_Jsgu:
                start("https://www.jsgu.cn/");
                break;
            case R.id.rela_feixiaohao:
                start("https://m.feixiaohao.com/");
                break;
            case R.id.rela_Biki:
                start("https://www.biki.com");
                break;
            case R.id.rela_Binance:
                start("https://www.binance.co/cn");
                break;
            case R.id.rela_Huobi:
                start("https://www.huobi.br.com/zh-cn/");
                break;
            case R.id.rela_Zb:
                start("https://zb.com");
                break;
            case R.id.rela_CoinW:
                start("https://www.coinw.ai/");
                break;
            case R.id.rela_Gateio:
                start("https://gateio.news/");
                break;
            case R.id.rela_Bittrex:
                start("https://bittrex.com");
                break;
            case R.id.rela_Bibox:
                start("https://www.bibox365.com/");
                break;
            case R.id.rela_Fubt:
                start("https://www.fubt.com");
                break;
            case R.id.rela_BTB:
                start("https://www.btb.io");
                break;
            case R.id.rela_Dfex:
                start("https://www.dfex.com");
                break;
            case R.id.rela_ZT:
                start("https://www.zt.com/");
                break;
            case R.id.rela_Loex:
                start("https://www.loex.io");
                break;
            case R.id.rela_Coinbig:
                start("https://www.coinbig.org/");
                break;
            case R.id.rela_KuCoin:
                start("https://www.kcs.top/");
                break;
            case R.id.rela_Omni:
                start("https://www.omniexplorer.info");
                break;
            case R.id.rela_BTC:
                start("https://btc.com/");
                break;
            case R.id.rela_Etherscan:
                start("https://etherscan.io");
                break;
            case R.id.rela_EosPark:
                start("https://eospark.com/");
                break;
            case R.id.rela_Tokenview:
                start("https://tokenview.com/cn/");
                break;
            case R.id.rela_winni:
                start("https://tw.8848.game/fcts/");
                break;
            case R.id.rela_Crypto:
                start("https://game.cryptothrone.co/?from=dr10");
                break;
            case R.id.rela_bingBet:
                start("https://bingobet.one/?ref=dappreview239");
                break;
            case R.id.rela_endless:
                start("https://eos.endless.game/dice?invite=dappreview23&channel=dappreview100");
                break;
            case R.id.rela_big_game:
                start("https://eosjacks.com/dappreview236");
                break;
            case R.id.rela_prabox:
                start("https://chain.pro/web-prabox/#/?ref=dappreview2310");
                break;
            case R.id.rela_Trust:
                start("https://trustdice.win/?ref=dappreview230");
                break;
            case R.id.rela_token_planet:
                start("http://app.tokenplanet.net/tokenplanet.html?qd=dappreview5");
                break;
            case R.id.rela_xwsc:
                start("http://www.xw020.com/");
                break;
            case R.id.rela_fwfsc:
                start("http://www.xiwanfu.com/");
                break;
            case R.id.image_shaizi:
                mPop.showAsDropDown(mLin_title,0,0);
                break;
        }
    }

    public void start(String url) {
        Intent intent = new Intent(getActivity(), FaXianWebActivity.class);
        intent.putExtra("url", url);
        startActivity(intent);
    }

    @Override
    public void onPause() {
        super.onPause();
        banner.stopAutoPlay();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_fa_xian;
    }
}
