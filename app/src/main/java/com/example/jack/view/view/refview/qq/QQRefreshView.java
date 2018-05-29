package com.example.jack.view.view.refview.qq;


import android.content.Context;
import android.util.AttributeSet;

import com.example.jack.view.view.refview.refreshlayout.FooterView;
import com.example.jack.view.view.refview.refreshlayout.RefreshLayout;

/**
 * qq下拉刷新
 * Created by zhouweilong on 2016/10/19.
 */

public class QQRefreshView extends RefreshLayout {

    public QQRefreshView(Context context) {
        super(context);
    }

    public QQRefreshView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        init();
    }

    public void init() {
        QQHeader header = new QQHeader(getContext());
        FooterView footer = new FooterView(getContext());

        addHeader(header);
        addFooter(footer);
        setOnHeaderListener(header);
        setOnFooterListener(footer);
    }
}
