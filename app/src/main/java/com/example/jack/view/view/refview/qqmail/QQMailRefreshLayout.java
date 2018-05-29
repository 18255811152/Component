package com.example.jack.view.view.refview.qqmail;


import android.content.Context;
import android.util.AttributeSet;

import com.example.jack.view.view.refview.refreshlayout.FooterView;
import com.example.jack.view.view.refview.refreshlayout.RefreshLayout;


/**
 * qq下拉刷新
 * Created by zhouweilong on 2016/10/19.
 */

public class QQMailRefreshLayout extends RefreshLayout {

    public QQMailRefreshLayout(Context context) {
        super(context);
    }

    public QQMailRefreshLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        init();
    }

    public void init() {
        QQMailHeader header = new QQMailHeader(getContext());
        FooterView footer = new FooterView(getContext());

        addHeader(header);
        addFooter(footer);
        setOnHeaderListener(header);
        setOnFooterListener(footer);
    }
}
