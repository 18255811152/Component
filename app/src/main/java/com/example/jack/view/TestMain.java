package com.example.jack.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jack.view.data.Test;

/**
 * Created by jack on 18-5-1.
 */

public class TestMain extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        int fill_width = LinearLayout.LayoutParams.FILL_PARENT;
        int fill_height = LinearLayout.LayoutParams.FILL_PARENT;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(fill_height, fill_width);
        linearLayout.setLayoutParams(layoutParams);

        int fill_width1 = ViewGroup.LayoutParams.FILL_PARENT;
        int fill_height1 = ViewGroup.LayoutParams.FILL_PARENT;
        TextView textView = new TextView(this);
        textView.setText("testMain");
        linearLayout.addView(textView);
        setContentView(linearLayout);

        initDate();

    }

    private void initDate() {
//        Test.printAllSuShu();
        Test.printWaterFlower();
    }
}
