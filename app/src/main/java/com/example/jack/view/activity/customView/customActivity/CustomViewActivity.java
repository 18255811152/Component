package com.example.jack.view.activity.customView.customActivity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.jack.view.MSPropties;
import com.example.jack.view.R;
import com.example.jack.view.activity.customView.customViewList.TitleView;
import com.example.jack.view.adapter.CustomViewAdapter;
import com.example.jack.view.base.BaseActivity;


/**
 * Created by jack on 18-5-3.
 */

public class CustomViewActivity extends BaseActivity {

    TitleView title;
    RecyclerView idRecyclerview;

    @Override
    protected void createLayoutView() {
        setContentView(R.layout.activity_custom_view);
    }

    @Override
    protected void initView() {
        title = (TitleView) findViewById(R.id.title);
        idRecyclerview = (RecyclerView) findViewById(R.id.id_recyclerview);
    }

    @Override
    protected void initDate() {
        idRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        idRecyclerview.setAdapter(new CustomViewAdapter(MSPropties.getCustomViewDate(), this));
    }

    @Override
    protected void setTitleView() {
        title.setTitleName(getResources().getString(R.string.custom_view));
        title.setTextNameSize(20);
    }

}
