package com.example.jack.view.net;


import com.example.jack.view.BuildConfig;
import com.example.jack.view.util.NullOnEmptyConverterFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitHelper {
    private static final int DEFAULT_TIMEOUT_SECONDS = 7;
    private static final int DEFAULT_READ_TIMEOUT_SECONDS = 20;
    private static final int DEFAULT_WRITE_TIMEOUT_SECONDS = 20;
    private Retrofit mRetrofit;

    private RetrofitHelper() {
        /**
         * 获取到的域名地址
         */
//        String baseUrl = DataCenter.getInstance().getIp();
        String baseUrl = "http://ip.taobao.com/";
        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        builder.connectTimeout(DEFAULT_TIMEOUT_SECONDS, TimeUnit.SECONDS)
                .readTimeout(DEFAULT_READ_TIMEOUT_SECONDS, TimeUnit.SECONDS)
                .writeTimeout(DEFAULT_WRITE_TIMEOUT_SECONDS, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true);//失败重连
        /**
         * 获取到的domain
         /**
         *
         * 添加日志拦截器
         */
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        if (BuildConfig.DEBUG) {
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        } else {
            interceptor.setLevel(HttpLoggingInterceptor.Level.NONE);
        }
        builder.addInterceptor(interceptor);  // 添加httplog
        if (mRetrofit == null) {
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(new NullOnEmptyConverterFactory())
                    .addConverterFactory(GsonConverterFactory.create(gson)) //添加Gson支持
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create()) //添加RxJava支持
                    .client(builder.build()) //关联okhttp
                    .build();
        }
    }

    private static class SingletonHolder {
        private static final RetrofitHelper INSTANCE = new RetrofitHelper();
    }

    public static RetrofitHelper getInstance() {
        return SingletonHolder.INSTANCE;
    }


    /**
     * 获取服务对象   Rxjava+Retrofit建立在接口对象的基础上的
     * 泛型避免强制转换
     */
    public static <T> T getService(Class<T> classz) {
        return RetrofitHelper.getInstance().mRetrofit.create(classz);
    }

}

