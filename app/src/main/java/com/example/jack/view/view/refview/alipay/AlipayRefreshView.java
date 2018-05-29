package com.example.jack.view.view.refview.alipay;


import android.content.Context;
import android.util.AttributeSet;

import com.example.jack.view.view.refview.refreshlayout.FooterView;
import com.example.jack.view.view.refview.refreshlayout.RefreshLayout;

/**
 * 支付宝下拉刷新
 * Created by zhouweilong on 2016/10/19.
 */

public class AlipayRefreshView extends RefreshLayout {

    public AlipayRefreshView(Context context) {
        super(context);
    }

    public AlipayRefreshView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        init();
    }

    public void init() {
        AlipayHeader header = new AlipayHeader(getContext());
        FooterView footer = new FooterView(getContext());

        addHeader(header);
        addFooter(footer);
        setOnHeaderListener(header);
        setOnFooterListener(footer);
    }
}
