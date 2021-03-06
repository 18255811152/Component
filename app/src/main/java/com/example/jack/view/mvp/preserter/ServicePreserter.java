package com.example.jack.view.mvp.preserter;

import android.content.Context;

import com.example.jack.view.base.BasePreserter;
import com.example.jack.view.base.IBaseView;
import com.example.jack.view.mvp.moder.ServiceMode.ServiceMode;
import com.example.jack.view.mvp.view.IIPView;
import com.example.jack.view.net.rx.ProgressSubscriber;

import rx.Subscription;

public class ServicePreserter<T extends IBaseView> extends BasePreserter {
    private Context mContext;
    private T mView;
    private ServiceMode mServiceMode;

    public ServicePreserter(Context mContext, T mView) {
        super(mContext, mView);
        this.mContext = mContext;
        this.mView = mView;
        mServiceMode = new ServiceMode();
    }

    public void getServiceIp(String ip) {
        Subscription subscription = mServiceMode.getServiceId(new ProgressSubscriber<>(o -> ((IIPView) mView).onResult(o), mContext), ip);
        subList.add(subscription);

    }
}
