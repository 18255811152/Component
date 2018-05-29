package com.example.jack.view.view.refview.qichezhijia;


import android.content.Context;
import android.util.AttributeSet;

import com.example.jack.view.view.refview.refreshlayout.FooterView;
import com.example.jack.view.view.refview.refreshlayout.RefreshLayout;


/**
 * Created by zhouweilong on 2016/10/19.
 */

public class QichezhijiaRefreshView extends RefreshLayout {

    public QichezhijiaRefreshView(Context context) {
        super(context);
    }

    public QichezhijiaRefreshView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        init();
    }

    public void init() {
        QiCheZhiJiaHeader header = new QiCheZhiJiaHeader(getContext());
        FooterView footer = new FooterView(getContext());

        addHeader(header);
        addFooter(footer);
        setOnHeaderListener(header);
        setOnFooterListener(footer);
    }
}
