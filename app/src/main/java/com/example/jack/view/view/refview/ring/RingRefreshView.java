package com.example.jack.view.view.refview.ring;


import android.content.Context;
import android.util.AttributeSet;

import com.example.jack.view.view.refview.refreshlayout.FooterView;
import com.example.jack.view.view.refview.refreshlayout.OnHeaderListener;
import com.example.jack.view.view.refview.refreshlayout.RefreshLayout;


/**
 * Ring下拉刷新
 * Created by zhouweilong on 2016/10/19.
 */

public class RingRefreshView extends RefreshLayout {

    public RingRefreshView(Context context) {
        super(context);
    }

    public RingRefreshView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        init();
    }

    public void init() {
        RingHeader header = new RingHeader(getContext());
        FooterView footer = new FooterView(getContext());

        addHeader(header);
        addFooter(footer);
        setOnHeaderListener((OnHeaderListener) header);
        setOnFooterListener(footer);
    }
}
