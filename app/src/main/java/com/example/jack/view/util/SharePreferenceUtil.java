package com.example.jack.view.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 保存数据
 */
public class SharePreferenceUtil {

    public static String isFristLogin = "";


    /**
     * 保存第一次登录状态
     */

    public static void savaIsFristLogin(Context context, boolean b) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(isFristLogin, context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("", b);
        editor.apply();
    }

    /**
     * 获取保存的数据是不是第一次登录
     *
     * @param context
     */
    public static boolean getIsFirstLogin(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(isFristLogin, context.MODE_PRIVATE);
        return sharedPreferences.getBoolean("", false);
    }


}
