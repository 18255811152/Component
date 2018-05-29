package com.example.jack.view.activity;

import android.os.Handler;

import com.example.jack.view.R;
import com.example.jack.view.base.BaseActivity;
import com.example.jack.view.util.ActivityUtil;


public class SplashActivity extends BaseActivity {
    Handler handler = new Handler((Handler.Callback) getApplicationContext());

    @Override
    protected void createLayoutView() {
        setContentView(R.layout.splash_activity);
    }

    @Override
    protected void initView() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ActivityUtil.startActivity(WelcomeGuideActivity.class);
            }
        }, 1000);
    }

    @Override
    protected void initDate() {

    }

    @Override
    protected void setTitleView() {

    }
}
