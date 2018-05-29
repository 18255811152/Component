package com.example.jack.view;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;

import com.example.jack.view.activity.customView.customViewList.HeaderView;
import com.example.jack.view.activity.customView.customViewList.TitleView;
import com.example.jack.view.adapter.MainRecycleAdapter;
import com.example.jack.view.base.BaseActivity;
import com.example.jack.view.data.Test;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends BaseActivity {
    RecyclerView mrecyclerView;
    TitleView titleView;
    @BindView(R.id.title)
    HeaderView title;
    @BindView(R.id.id_recyclerview)
    RecyclerView idRecyclerview;

    @Override
    protected void createLayoutView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initView() {
        for (int i : TestJava.sore())
            Log.e("TAG", "TestJava.sore()" + i);


        for (int removeZero : TestJava.removeZero())
            Log.e("TAG", "removeZero" + removeZero);


        TestJava.count();


        mrecyclerView = (RecyclerView) findViewById(R.id.id_recyclerview);
        RecyclerView.LayoutManager mLayoutManager = new StaggeredGridLayoutManager(
                3,
                StaggeredGridLayoutManager.VERTICAL);
        mrecyclerView.setLayoutManager(mLayoutManager);
        mrecyclerView.setBackgroundColor(getResources().getColor(R.color.black));
        mrecyclerView.setPadding(10, 10, 10, 10);
        mrecyclerView.setItemAnimator(new DefaultItemAnimator());
        mrecyclerView.setItemViewCacheSize(1);
        mrecyclerView.setAdapter(new MainRecycleAdapter(MSPropties.getHomeDate(getBaseContext()), this));
    }

    @Override
    protected void initDate() {

    }

    @Override
    protected void setTitleView() {
        title.setHeader(getResources().getString(R.string.app_name), true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
