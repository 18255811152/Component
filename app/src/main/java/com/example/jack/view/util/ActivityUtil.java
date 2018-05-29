package com.example.jack.view.util;

import android.app.Activity;
import android.content.Intent;

import com.example.jack.view.base.BaseApplication;

/**
 * Created by jack on 18-5-3.
 */

public class ActivityUtil {

    /**
     * 一键启动activity
     *
     * @param aClass
     */
    public static void startActivity(Class<? extends Activity> aClass) {
        BaseApplication.getContext().startActivity(new Intent().setClass(BaseApplication.getContext(), aClass).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));

    }
}
