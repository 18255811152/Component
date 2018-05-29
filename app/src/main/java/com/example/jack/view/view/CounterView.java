package com.example.jack.view.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.logging.Handler;

/**
 * Created by jack on 18-4-30.
 * 累加
 */

public class CounterView extends View implements View.OnClickListener {
    private Paint mpaint;
    private Rect mrect;//绘制矩形
    private int count;
    private Handler handler;


    public CounterView(Context context) {
        super(context);
    }

    public CounterView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mpaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mrect = new Rect();
        setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        count++;
        invalidate();
    }


    @Override
    protected void onDraw(Canvas canvas) {//画布   去花什么
        super.onDraw(canvas);
        mpaint.setColor(Color.BLUE);  //设置画笔颜色
        canvas.drawRect(0, 0, getWidth(), getHeight(), mpaint);//花矩形

        mpaint.setColor(Color.YELLOW);//设置黄色的画笔
        mpaint.setTextSize(30);//设置字体大小
        String text = String.valueOf(count);
        mpaint.getTextBounds(text, 0, text.length(), mrect);

        float textWidth = mrect.width();
        float textHight = mrect.height();
        canvas.drawText(text, getWidth() / 2 - textWidth / 2, getHeight() / 2 - textHight / 2, mpaint);//花字体

    }
}
