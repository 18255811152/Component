package com.example.jack.view;

import android.util.Log;

public class TestJavaasdasd {

    public static int[] sore() {
        int[] sore = new int[]{10, 50, 100, 20, 1, 9, 18};


        for (int i = 1; i < sore.length; i++) {
            for (int i1 = 0; i1 < sore.length; i1++) {
                if (sore[i] < sore[i1]) {
                    int x = sore[i];
                    sore[i] = sore[i1];
                    sore[i1] = x;
                }

            }

        }
        return sore;
    }

    /**
     * 移除某個指定的元素
     *
     * @return
     */
    public static int[] removeZero() {
        int[] oldArray = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};

        int index = 0;
        int count = 0;

        for (int i = 0; i < oldArray.length; i++) {
            if (0 != oldArray[i]) {
                count++;
            }

        }

        int[] array = new int[count];
        for (int i = 0; i < oldArray.length; i++) {
            if (0 != oldArray[i]) {
                array[index] = oldArray[i];
                index++;
            }
        }
        return array;
    }


    /**
     * 求出总和最大值跟最小值
     *
     * @return
     */
    public static int count() {
        int[] array = new int[]{10, 21, 213, 421, 8192, 12, 123, 324, 359, 947};
        int Maxnumber = 100;
        int MinNumber = 100;
        int countNumebr = 0;
        for (int i : array) {
            countNumebr += i;
            Log.e("TAG", "countNuumber" + String.valueOf(countNumebr));
        }


        for (int i = 0; i < array.length; i++) {
            if (Maxnumber < array[i]) {
                Maxnumber = array[i];
                Log.e("TAG", "MaxNumber" + String.valueOf(Maxnumber));
            } else if (MinNumber > array[i]) {
                MinNumber = array[i];
                Log.e("TAG", "MinNuumber" + String.valueOf(MinNumber));
            }
        }

        return 0;
    }
}
