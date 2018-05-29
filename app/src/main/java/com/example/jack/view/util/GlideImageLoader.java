package com.example.jack.view.util;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.jack.view.R;
import com.youth.banner.loader.ImageLoader;

/**
 * Created by jack on 18-5-12.
 */

public class GlideImageLoader extends ImageLoader {

    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        //Glide 加载图片简单用法
        RequestOptions options = new RequestOptions().placeholder(R.mipmap.dogview_dog);
        Glide.with(context).load(path).apply(options).into(imageView);
    }

}
