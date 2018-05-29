package com.example.jack.view.base;

import android.app.Application;
import android.content.Context;

/**
 * Created by jack on 18-5-3.
 */

public class BaseApplication extends Application {
    public static Context context;


    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();

    }

    public static Context getContext() {
        return context;
    }
}
