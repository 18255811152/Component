package com.example.jack.view.activity.customView.customViewList;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jack.view.R;

/**
 * Created by jack on 18-5-2.
 */

public class TitleView extends RelativeLayout {
    private ImageView mImageView;
    private TextView mTextView;
    private RelativeLayout bacLayout;

    public TitleView(Context context) {
        super(context);
    }

    public TitleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.activity_titleview, this);
        mImageView = (ImageView) findViewById(R.id.image_back);
        mTextView = (TextView) findViewById(R.id.titleName);
        bacLayout = (RelativeLayout) findViewById(R.id.baclayout);
        TitleView.this.setTextNameSize(20);
        mImageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Activity) getContext()).finish();
            }
        });
    }


    /**
     * 设置资源图片
     *
     * @param res
     */
    public void setImageRes(int res) {
        mImageView.setImageResource(res);
    }

    /**
     * 设置title的Name
     *
     * @param titleName
     */
    public void setTitleName(String titleName) {
        mTextView.setText(titleName);
    }

    /**
     * 设置title的Color
     *
     * @param color
     */
    public void setTitleNameColor(int color) {
        mTextView.setTextColor(color);

    }

    /**
     * 设置title字体大下
     *
     * @param size
     */
    public void setTextNameSize(int size) {
        mTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, size);
    }

    /**
     * 设置背景的颜色
     *
     * @param color
     */
    public void setBacLayoutColor(int color) {
        bacLayout.setBackgroundColor(color);
    }

    /**
     * 设置图片的点击事件
     *
     * @param ls
     */
    public void setmImageViewOnclickListener(OnClickListener ls) {
        mImageView.setOnClickListener(ls);

    }

    /**
     * 是否显示ImageView
     *
     * @param isshow
     */
    public void isShowImage(boolean isshow) {
        if (isshow) {
            mImageView.setVisibility(VISIBLE);
        } else {
            mImageView.setVisibility(GONE);
        }


    }
}
