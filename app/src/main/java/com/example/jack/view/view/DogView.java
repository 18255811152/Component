package com.example.jack.view.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.example.jack.view.R;

/**
 * Created by jack on 18-5-3.
 */

public class DogView extends View {


    private Paint mPaint;
    public static float bitmapx;
    public static float bitmapy;


    public DogView(Context context) {
        super(context);
    }

    public DogView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.dogview_dog);
        canvas.drawBitmap(bitmap, bitmapx, bitmapy, mPaint);

        if (bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }
}
