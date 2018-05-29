package com.example.jack.view.util;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;

import java.util.List;

/**
 * Created by jack on 18-5-12.
 */

public class BannerConfigInit {
    private Banner mBanner;

    public BannerConfigInit(Banner banner, List images, List titles, OnBannerListener listener) {
        mBanner = banner;
        //设置banner样式
        mBanner.setBannerStyle(BannerConfig.NUM_INDICATOR);
        //设置图片加载器
        mBanner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        mBanner.setImages(images);
        //设置banner动画效果
        mBanner.setBannerAnimation(Transformer.Default);
        //设置标题集合（当banner样式有显示title时）
        mBanner.setBannerTitles(titles);
        //设置自动轮播，默认为true
        mBanner.isAutoPlay(true);
        //设置轮播时间
        mBanner.setDelayTime(5000);
        //设置指示器位置（当banner模式中有指示器时）
        mBanner.setIndicatorGravity(BannerConfig.CENTER);

        mBanner.setOnBannerListener(listener);
        //banner设置方法全部调用完毕时最后调用
        //banner.start();
    }

    public void start() {
        if (mBanner != null) {
            mBanner.start();
        }
    }
}
