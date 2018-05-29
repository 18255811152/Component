package com.example.jack.view.activity;

import android.databinding.DataBindingUtil;

import com.example.jack.view.R;
import com.example.jack.view.base.BaseActivity;
import com.example.jack.view.bean.TestMVVMBena;
import com.example.jack.view.databinding.TestMvvmActivityBinding;

public class TestMVVMActivity extends BaseActivity {
    @Override
    protected void createLayoutView() {
        TestMvvmActivityBinding testMvvmActivityBinding = DataBindingUtil.setContentView(this, R.layout.test_mvvm_activity);
        TestMVVMBena testMVVMBena = new TestMVVMBena("a", "23");
        testMvvmActivityBinding.setTestMvvm(testMVVMBena);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initDate() {

    }

    @Override
    protected void setTitleView() {

    }
}
