package com.example.jack.view.view.refview.meituan;


import android.content.Context;
import android.util.AttributeSet;

import com.example.jack.view.view.refview.refreshlayout.FooterView;
import com.example.jack.view.view.refview.refreshlayout.RefreshLayout;


/**
 * 美团下拉刷新
 * Created by zhouweilong on 2016/10/19.
 */

public class MeiTuanRefreshView extends RefreshLayout {

    public MeiTuanRefreshView(Context context) {
        super(context);
    }

    public MeiTuanRefreshView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        init();
    }

    public void init() {
        MeiTuanHeader header = new MeiTuanHeader(getContext());
        FooterView footer = new FooterView(getContext());

        addHeader(header);
        addFooter(footer);
        setOnHeaderListener(header);
        setOnFooterListener(footer);
    }
}
