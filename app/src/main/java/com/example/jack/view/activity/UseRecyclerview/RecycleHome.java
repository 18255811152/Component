package com.example.jack.view.activity.UseRecyclerview;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.aspsine.swipetoloadlayout.OnLoadMoreListener;
import com.aspsine.swipetoloadlayout.OnRefreshListener;
import com.example.jack.view.R;
import com.example.jack.view.activity.customView.customViewList.TitleView;
import com.example.jack.view.adapter.RecyleHomeAdapter;
import com.example.jack.view.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

import com.aspsine.swipetoloadlayout.SwipeToLoadLayout;
import com.example.jack.view.view.LoadMoreFooterView;
import com.example.jack.view.view.RefreshHeaderView;

/**
 * Created by jack on 18-5-10.
 */

public class RecycleHome extends BaseActivity implements OnLoadMoreListener, OnRefreshListener {
    @BindView(R.id.title)
    TitleView title;
    @BindView(R.id.swipe_refresh_header)
    RefreshHeaderView swipeRefreshHeader;
    @BindView(R.id.swipe_target)
    RecyclerView swipeTarget;
    @BindView(R.id.swipe_load_more_footer)
    LoadMoreFooterView swipeLoadMoreFooter;
    @BindView(R.id.swipeToLoadLayout)
    SwipeToLoadLayout mSwipeToLoadLayout;
    private RecyleHomeAdapter homeAdapter;
    private Handler handler = new Handler();

    @Override
    protected void createLayoutView() {
        setContentView(R.layout.recyle_home);
    }

    @Override
    protected void initView() {
        mSwipeToLoadLayout.setOnRefreshListener(this);
        mSwipeToLoadLayout.setOnLoadMoreListener(this);
        mSwipeToLoadLayout.setRefreshEnabled(true);
        mSwipeToLoadLayout.setLoadMoreEnabled(true);
        homeAdapter = new RecyleHomeAdapter(this, getLayoutInflater());
        swipeTarget.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        swipeTarget.setItemAnimator(new DefaultItemAnimator());//设置默认动画
        swipeTarget.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));//设置分割线
        swipeTarget.setAdapter(homeAdapter);
    }

    @Override
    protected void initDate() {

    }

    @Override
    protected void setTitleView() {
        title.setTitleName("啦啦啦啦");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @Override
    public void onLoadMore() {

    }

    @Override
    public void onRefresh() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mSwipeToLoadLayout.setRefreshEnabled(false);
            }
        }, 2000);
    }
}
