package com.example.jack.view.mvp.moder.ServiceMode;

import com.hwangjr.rxbus.annotation.Subscribe;

import rx.Subscriber;
import rx.Subscription;

public interface IServiceMode {
    Subscription getServiceId(Subscriber subscriber, String ip);
}
