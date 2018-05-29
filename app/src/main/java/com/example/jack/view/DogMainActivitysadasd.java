package com.example.jack.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

import com.example.jack.view.view.DogView;


/**
 * Created by jack on 18-5-1.
 */

public class DogMainActivitysadasd extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogview);

        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mylayout);
        final DogView dogView = new DogView(DogMainActivitysadasd.this);

        dogView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                dogView.bitmapx = motionEvent.getX();
                dogView.bitmapy = motionEvent.getY();

                dogView.invalidate();

                return true;//返回ture表示继续往下传递事假(连续性的)，返回false表示不继续往下传递时间（断断续续的  要再次触发才能传递）
            }
        });


        frameLayout.addView(dogView);

    }


















}
