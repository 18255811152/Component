package com.example.jack.view.activity;

import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;

import com.example.jack.view.MainActivity;
import com.example.jack.view.R;
import com.example.jack.view.base.BaseActivity;
import com.example.jack.view.util.ActivityUtil;
import com.example.jack.view.util.SharePreferenceUtil;


public class SplashActivity extends BaseActivity {


    Handler handler = new Handler();

    @Override
    protected void createLayoutView() {
        initStatus();
        setContentView(R.layout.splash_activity);
    }

    @Override
    protected void initView() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (true == SharePreferenceUtil.getIsFirstLogin(SplashActivity.this)) {
                    ActivityUtil.startActivity(MainActivity.class);
                } else {
                    SharePreferenceUtil.savaIsFristLogin(SplashActivity.this, true);
                    ActivityUtil.startActivity(GuiderActivity.class);
                }
                finish();


            }
        }, 2000);

    }

    @Override
    protected void initDate() {

    }

    @Override
    protected void setTitleView() {

    }

    void initStatus() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            View decoderView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decoderView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        } else {
            WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
            localLayoutParams.flags = (WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | localLayoutParams.flags);
            //or ?
//            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
    }
}
