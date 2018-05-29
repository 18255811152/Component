package com.example.jack.view.view;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jack.view.R;

/**
 * Created by jack on 18-4-30.
 */

public class TitleView1 extends RelativeLayout {
    private Button mbutton;
    private TextView mtextView;

    public TitleView1(Context context) {
        super(context);
    }

    public TitleView1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.activity_title, this);
        mbutton = (Button) findViewById(R.id.button_left);
        mtextView = (TextView) findViewById(R.id.title_text);
        mbutton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Activity) getContext()).finish();
            }

        });

    }

    /**
     * 设置title的标题
     */
    void setTitleText(String titleText) {
        mtextView.setText(titleText);
    }

    /**
     * 设置左边button的文字
     */
    void setLeftButtonText(String leftButtonText) {
        mbutton.setText(leftButtonText);
    }

    /**
     * 设置点击事件
     */
    void setLeftOnclickListener(OnClickListener l) {
        mbutton.setOnClickListener(l);

    }

}
