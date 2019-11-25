package com.example.myapplication.wode.activity;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.okhttp.OkHttpUtils;
import com.example.myapplication.okhttp.callback.ResponseCallBack;
import com.example.myapplication.okhttp.callback.ResultModelCallback;
import com.example.myapplication.utils.SharedPreferenceUtils;
import com.example.myapplication.utils.ToastUtils;
import com.example.myapplication.wode.UpdateBean;
import com.example.myapplication.wode.UpdateImgBean;
import com.example.myapplication.wode.UserinFoBean;
import com.luck.picture.lib.PictureSelector;
import com.luck.picture.lib.config.PictureConfig;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.entity.LocalMedia;

import org.json.JSONException;

import java.io.File;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class UserInfoActivity extends BaseActivity {

    @BindView(R.id.back)
    ImageButton back;
    @BindView(R.id.rela_touXiang)
    RelativeLayout relaTouXiang;
    @BindView(R.id.rela_name)
    RelativeLayout relaName;
    @BindView(R.id.user_info)
    ImageView userInfo;
    @BindView(R.id.user_name)
    TextView userName;
    @BindView(R.id.user_id)
    TextView userId;
    @BindView(R.id.invitation_code)
    TextView invitationCode;
    @BindView(R.id.rela_mima)
    RelativeLayout relaMima;
    private TextView mText_quXiao;
    private PopupWindow mPop;
    private List<LocalMedia> selectList;
    private File file;

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        popTouXiang();
        getUSerinfo();
    }

    @Override
    protected void onResume() {
        super.onResume();
        getUSerinfo();
    }

    private void popTouXiang() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.pop_photo, null);
        TextView text_paiZhao = inflate.findViewById(R.id.text_paiZhao);
        TextView text_xiangCe = inflate.findViewById(R.id.text_xiangCe);
        mText_quXiao = inflate.findViewById(R.id.text_quXiao);
        mPop = new PopupWindow(inflate, ViewPager.MarginLayoutParams.MATCH_PARENT, ViewPager.MarginLayoutParams.MATCH_PARENT);
        mText_quXiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPop.dismiss();
            }
        });
        inflate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPop.dismiss();
            }
        });
        text_paiZhao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PictureSelector.create(UserInfoActivity.this)
                        .openCamera(PictureMimeType.ofImage())
                        .forResult(PictureConfig.CHOOSE_REQUEST);
                mPop.dismiss();
            }
        });
        text_xiangCe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 进入相册 以下是例子：不需要的api可以不写
                PictureSelector.create(UserInfoActivity.this)
                        .openGallery(PictureMimeType.ofImage())// 全部.PictureMimeType.ofAll()、图片.ofImage()、视频.ofVideo()、音频.ofAudio()
                        .theme(R.style.picture_default_style)// 主题样式设置 具体参考 values/styles   用法：R.style.picture.white.style
                        .maxSelectNum(1)// 最大图片选择数量
                        .minSelectNum(1)// 最小选择数量
                        .imageSpanCount(4)// 每行显示个数

                        .previewImage(true)// 是否可预览图片
                        .previewVideo(false)// 是否可预览视频
                        .enablePreviewAudio(false) // 是否可播放音频
                        .isCamera(false)// 是否显示拍照按钮
                        .isZoomAnim(true)// 图片列表点击 缩放效果 默认true
                        //.imageFormat(PictureMimeType.PNG)// 拍照保存图片格式后缀,默认jpeg
                        //.setOutputCameraPath("/CustomPath")// 自定义拍照保存路径
                        .enableCrop(true)// 是否裁剪
                        .compress(true)// 是否压缩
                        .synOrAsy(true)//同步true或异步false 压缩 默认同步
                        //.compressSavePath(getPath())//压缩图片保存地址
                        //.sizeMultiplier(0.5f)// glide 加载图片大小 0~1之间 如设置 .glideOverride()无效
                        .glideOverride(160, 160)// glide 加载宽高，越小图片列表越流畅，但会影响列表图片浏览的清晰度
//                        .withAspectRatio(aspect_ratio_x, aspect_ratio_y)// 裁剪比例 如16:9 3:2 3:4 1:1 可自定义
//                        .hideBottomControls(cb_hide.isChecked() ? false : true)// 是否显示uCrop工具栏，默认不显示

                        .isGif(false)// 是否显示gif图片
                        .freeStyleCropEnabled(true)// 裁剪框是否可拖拽
                        .circleDimmedLayer(true)// 是否圆形裁剪
                        .showCropFrame(false)// 是否显示裁剪矩形边框 圆形裁剪时建议设为false
                        .showCropGrid(false)// 是否显示裁剪矩形网格 圆形裁剪时建议设为false
                        .openClickSound(false)// 是否开启点击声音
//                        .selectionMedia(selectList)// 是否传入已选图片
                        //.isDragFrame(false)// 是否可拖动裁剪框(固定)
//                        .videoMaxSecond(15)
//                        .videoMinSecond(10)
                        //.previewEggs(false)// 预览图片时 是否增强左右滑动图片体验(图片滑动一半即可看到上一张是否选中)
                        //.cropCompressQuality(90)// 裁剪压缩质量 默认100
                        .minimumCompressSize(100)// 小于100kb的图片不压缩
                        //.cropWH()// 裁剪宽高比，设置如果大于图片本身宽高则无效
                        //.rotateEnabled(true) // 裁剪是否可旋转图片
                        .scaleEnabled(true)// 裁剪是否可放大缩小图片
                        //.videoQuality()// 视频录制质量 0 or 1
                        //.videoSecond()//显示多少秒以内的视频or音频也可适用
                        //.recordVideoSecond()//录制视频秒数 默认60s
                        .forResult(199);//结果回调onActivityResult code
                mPop.dismiss();
            }
        });
    }

    @OnClick({R.id.back, R.id.rela_touXiang, R.id.rela_name, R.id.rela_mima})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.rela_touXiang:
                mPop.showAsDropDown(mText_quXiao, 0, 0);
                break;
            case R.id.rela_name:
                startActivity(new Intent(UserInfoActivity.this, NameActivity.class));
                break;
            case R.id.rela_mima:
                startActivity(new Intent(UserInfoActivity.this, MiMaActivity.class));
                break;
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_user_info;
    }

    private void getUSerinfo() {
        OkHttpUtils.get().
                addHeader("Authorization", SharedPreferenceUtils.getToken())
                .url(ZgwApplication.appRequestUrl + "v1/auth/me")
                .build().execute(new ResultModelCallback(this, new ResponseCallBack<UserinFoBean>() {
            @Override
            public void onError(String e) {

            }

            @Override
            public void onResponse(UserinFoBean response) throws JSONException {
                if (response != null) {
                    userName.setText(response.getData().getNickname());
                    Log.d("moxun", "onResponse: "+response.getData().getAvatar());

                    userId.setText("ID:" + response.getData().getId());
                }
            }


        }));
    }
    private void UpdateUSerinfo(String img) {

        OkHttpUtils.post().
                addHeader("Authorization", SharedPreferenceUtils.getToken())
                .addParams("type","avatar")
                .addParams("value", img)

                .url(ZgwApplication.appRequestUrl + "v1/auth/changeInfo")

                .build().execute(new ResultModelCallback(this, new ResponseCallBack<UpdateBean>() {
            @Override
            public void onError(String e) {

            }

            @Override
            public void onResponse(UpdateBean response) throws JSONException {
                if (response != null) {

                    ToastUtils.showToast("修改成功");
                }
            }


        }));
    }

    public void updateImage(){
        OkHttpUtils.post().
                addHeader("Authorization", SharedPreferenceUtils.getToken())

                .addFile("img", file.getName(), file)

                .url(ZgwApplication.appRequestUrl + "v1/auth/upload")

                .build().execute(new ResultModelCallback(this, new ResponseCallBack<UpdateImgBean>() {
            @Override
            public void onError(String e) {

            }

            @Override
            public void onResponse(UpdateImgBean response) throws JSONException {
                if (response != null) {
                    RequestOptions requestOptions = RequestOptions.circleCropTransform();
                    Glide.with(UserInfoActivity.this)
                            .load(response.getData().getPath())
                            .apply(requestOptions)
                            .into(userInfo);
                    UpdateUSerinfo(response.getData().getPath());
                }
            }


        }));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            if (requestCode == PictureConfig.CHOOSE_REQUEST||requestCode==199) {
                selectList = PictureSelector.obtainMultipleResult(data);
                file = new File(selectList.get(0).getPath());

                RequestOptions requestOptions = RequestOptions.circleCropTransform();
                Glide.with(UserInfoActivity.this)
                        .load(file)
                        .apply(requestOptions)
                        .into(userInfo);

                updateImage();
            }

        }


    }
}
