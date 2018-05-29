package com.example.jack.view.data;

import android.util.Log;

/**
 * Created by jack on 18-5-1.
 */

public class Test {
    //1
    public static void printAllSuShu() {
        StringBuffer stringBuffer = new StringBuffer();
        String count1[] = {};
        for (int count = 102; count < 200; count++) {
            if (count % 2 != 0) {
                stringBuffer.append(count);
            }
            count1 = stringBuffer.toString().split(",");
        }
        for (String s : count1) {
            Log.e("TAG", "s" + s.toString());
        }
    }

    //2
    public static void printWaterFlower() {
        for (int count = 100; count < 1000; count++) {
            int i = count / 100;
            int j = (count % 100) / 10;
            int q = count % 10;
            if (count == (i * i * i) + (j * j * j) + (q * q * q)) {
                Log.e("TAG", "count" + count);
            }
        }
    }
}
