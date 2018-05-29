package com.example.jack.view.base;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;


import com.example.jack.view.R;
import com.example.jack.view.util.StatusBarUtil;
import com.example.jack.view.util.ToastUtil;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by jack on 18-5-2.
 */

public abstract class BaseActivity extends Activity {

    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.setStatusBarColor(this, R.color.black);
        createLayoutView();
        unbinder = ButterKnife.bind(this);
        initView();
        setTitleView();
        ToastUtil toastUtil = ToastUtil.getInstance(BaseApplication.getContext().getApplicationContext());
        initDate();
    }

    protected abstract void createLayoutView();

    protected abstract void initView();

    protected abstract void initDate();

    protected abstract void setTitleView();

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

}
