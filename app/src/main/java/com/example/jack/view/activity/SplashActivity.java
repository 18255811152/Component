package com.example.jack.view.activity;

import android.os.Handler;

import com.example.jack.view.MainActivity;
import com.example.jack.view.R;
import com.example.jack.view.base.BaseActivity;
import com.example.jack.view.util.ActivityUtil;
import com.example.jack.view.util.SharePreferenceUtil;


public class SplashActivity extends BaseActivity {


    Handler handler = new Handler();

    @Override
    protected void createLayoutView() {
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
}
