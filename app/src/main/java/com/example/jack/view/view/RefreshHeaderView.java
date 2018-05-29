package com.example.jack.view.view;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.aspsine.swipetoloadlayout.SwipeRefreshTrigger;
import com.aspsine.swipetoloadlayout.SwipeTrigger;
import com.example.jack.view.R;
import com.example.jack.view.util.date.DateTool;


/**
 * Created by jack on 18-5-10.
 */

public class RefreshHeaderView extends LinearLayout implements SwipeRefreshTrigger, SwipeTrigger {

    public static final int MODE_DOG_RUN = 1;
    public static final int MODE_DOG_EAT = 2;


    private TextView mTvStatus;
    private ImageView mIv_refresh_headPic;
    private TextView mTv_final_time;
    private String mLastUpdateTime;

    private int mAnimPic = R.drawable.chickenrun1;
    private int mAnim = R.drawable.anim_refresh_head;

    public RefreshHeaderView(Context context) {
        this(context, null, 0);
    }

    public RefreshHeaderView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RefreshHeaderView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init() {
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        View view = View.inflate(getContext(), R.layout.refresh_head, null);
        mTvStatus = view.findViewById(R.id.tv_refresh_status);
        mIv_refresh_headPic = view.findViewById(R.id.iv_refresh_headPic);
        mTv_final_time = view.findViewById(R.id.tv_final_time);
        setAnimMode(MODE_DOG_RUN);
        updateTime();
        addView(view, lp);
    }

    private void updateTime() {
        mLastUpdateTime = DateTool.getTimeFromLong(DateTool.FMT_TIME_4, System.currentTimeMillis());
        mTv_final_time.setText("最后更新:  今天 " + mLastUpdateTime);
    }

    /**
     * 切换动画的模式
     *
     * @param mode
     */
    public void setAnimMode(int mode) {
        if (mode == MODE_DOG_RUN) {
            mAnimPic = R.drawable.chickenrun1;
            mAnim = R.drawable.anim_refresh_head;
        } else if (mode == MODE_DOG_EAT) {
            mAnimPic = R.drawable.chickenrun1;
            mAnim = R.drawable.chickenrun1;
        }
        mIv_refresh_headPic.setImageResource(mAnimPic);
    }

    @Override
    public void onRefresh() {
        Log.e("HeadAnim", "onRefresh");
        mTvStatus.setText(getResources().getString(R.string.REFRESHING));
    }

    @Override
    public void onPrepare() {
        Log.e("HeadAnim", "onPrepare");
        startHeadAnim();
    }

    @Override
    public void onMove(int yScrolled, boolean isComplete, boolean automatic) {
        if (!isComplete) {
            if (yScrolled >= getHeight()) {
                mTvStatus.setText(getResources().getString(R.string.RELEASE_TO_REFRESH));
            } else {
                mTvStatus.setText(getResources().getString(R.string.SWIPE_TO_REFRESH));
            }
        } else {
            mTvStatus.setText(getResources().getString(R.string.REFRESH_RETURNING));
        }
    }

    @Override
    public void onRelease() {
        Log.e("HeadAnim", "onRelease");
    }

    @Override
    public void onComplete() {
        Log.e("HeadAnim", "onComplete");
        stopHeadAnim();
        mTvStatus.setText(getResources().getString(R.string.REFRESH_COMPLETE));
        updateTime();
    }

    @Override
    public void onReset() {
        Log.e("HeadAnim", "onReset");
    }


    private void startHeadAnim() {
        Log.e("HeadAnim", "startHeadAnim");
        mIv_refresh_headPic.setImageResource(mAnim);
        AnimationDrawable ad = (AnimationDrawable) mIv_refresh_headPic.getDrawable();
        ad.start();
    }

    private void stopHeadAnim() {
        Log.e("HeadAnim", "stopHeadAnim");
        Drawable drawable = mIv_refresh_headPic.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        mIv_refresh_headPic.setImageResource(mAnimPic);
    }
}
