package com.example.jack.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;

import com.example.jack.view.activity.customView.customViewList.HeaderView;
import com.example.jack.view.activity.customView.customViewList.TitleView;
import com.example.jack.view.adapter.MainRecycleAdapter;
import com.example.jack.view.base.BaseActivity;
import com.example.jack.view.bean.TestServiceIp;
import com.example.jack.view.mvp.preserter.ServicePreserter;
import com.example.jack.view.mvp.view.IIPView;
import com.example.jack.view.view.refview.jd.JDRefreshLayout;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends BaseActivity implements IIPView {
    RecyclerView mrecyclerView;
    TitleView titleView;
    @BindView(R.id.title)
    HeaderView title;
    @BindView(R.id.id_recyclerview)
    RecyclerView idRecyclerview;
    private JDRefreshLayout refreshview;
    private Context context;
    private ServicePreserter servicePreserter;


    @Override
    protected void createLayoutView() {
        context = this;
        setContentView(R.layout.activity_main);
        servicePreserter = new ServicePreserter(context, this);
    }

    @Override
    protected void initView() {
        refreshview = (JDRefreshLayout) findViewById(R.id.refreshviews);
        servicePreserter.getServiceIp("63.223.108.42");
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
        servicePreserter.getServiceIp("63.223.108.42");
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

    @Override
    public void onResult(Object o) {
        TestServiceIp serviceIp = (TestServiceIp) o;
        Log.e("TAG", "serviceIp" + serviceIp.getCountry());
    }
}
