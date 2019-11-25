package com.example.myapplication.begin.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.ZgwApplication;
import com.example.myapplication.begin.adapter.GuideAdapter;
import com.example.myapplication.begin.adapter.GuideViewPagerAdapter;
import com.example.myapplication.begin.bean.GuideBean;
import com.example.myapplication.okhttp.OkHttpUtils;
import com.example.myapplication.okhttp.callback.ResponseCallBack;
import com.example.myapplication.okhttp.callback.ResultModelCallback;
import com.example.myapplication.utils.SharedPreferenceUtils;

import org.json.JSONException;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GuiDeActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private ArrayList<String> mList;

    private List<View> views;

    // 引导页图片资源
    private static final int[] pics = {
            R.drawable.image_starttwo, R.drawable.image_startthree ,R.drawable.image_startfour,
            R.drawable.image_startfive};
    private GuideViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gui_de);
        views = new ArrayList<View>();
        mViewPager = findViewById(R.id.viewPager);
        TextView text = findViewById(R.id.text);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }


        // 初始化引导页视图列表
        for (int i = 0; i < pics.length; i++) {
            View view = LayoutInflater.from(this).inflate(R.layout.guid_view2, null);
            ImageView imageView = view.findViewById(R.id.image);
            try {
                getBitmapForImgResourse(this,pics[i],imageView);
            } catch (IOException e) {
                e.printStackTrace();
            }
            views.add(view);
        }

        // 初始化adapter
        adapter = new GuideViewPagerAdapter(views);
        mViewPager.setAdapter(adapter);
        mViewPager.addOnPageChangeListener((ViewPager.OnPageChangeListener) new PageChangeListener());
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position== pics.length-1){
                    text.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            SharedPreferenceUtils.setYinDao(true);
                            if(SharedPreferenceUtils.getToken().equals("")){
                                startActivity(new Intent(GuiDeActivity.this,LoginActivity.class));
                            }else{
                                startActivity(new Intent(GuiDeActivity.this, MainActivity.class));
                                finish();
                            }
                        }
                    });
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
        // 如果切换到后台，就设置下次不进入功能引导页
        SharedPreferenceUtils.setYinDao(true);
        finish();
    }
    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    /**
     * 设置当前view
     *
     * @param position
     */
    private void setCurView(int position) {
        if (position < 0 || position >= pics.length) {
            return;
        }
        mViewPager.setCurrentItem(position);
    }

    public static Bitmap btp;
    public static void getBitmapForImgResourse(Context mContext, int imgId, ImageView mImageView) throws IOException {
        InputStream is = mContext.getResources().openRawResource(imgId);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = 1;
        btp = BitmapFactory.decodeStream(is, null, options);
        mImageView.setImageBitmap(btp);
//    btp.recycle();
        is.close();
    }
    private class PageChangeListener implements ViewPager.OnPageChangeListener {
        @Override
        public void onPageScrollStateChanged(int position) {
        }
        @Override
        public void onPageScrolled(int position, float arg1, int arg2) {
        }
        @Override
        public void onPageSelected(int position) {
        }
    }

}
