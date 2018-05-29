package com.example.jack.view.view;

import android.content.Context;
import android.util.AttributeSet;

import com.aspsine.swipetoloadlayout.SwipeLoadMoreTrigger;
import com.aspsine.swipetoloadlayout.SwipeTrigger;
import com.example.jack.view.R;

/**
 * Created by jack on 18-5-11.
 */

public class LoadMoreFooterView extends android.support.v7.widget.AppCompatAutoCompleteTextView implements SwipeTrigger, SwipeLoadMoreTrigger {
    public LoadMoreFooterView(Context context) {
        super(context);
    }

    public LoadMoreFooterView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LoadMoreFooterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onLoadMore() {
        setText(getResources().getString(R.string.LOADING_MORE));
    }

    @Override
    public void onPrepare() {
        setText("");
    }

    @Override
    public void onMove(int i, boolean b, boolean b1) {
        if (!b) {
            if (i <= -getHeight()) {
                setText(getResources().getString(R.string.RELEASE_TO_LOAD_MORE));
            } else {
                setText(getResources().getString(R.string.SWIPE_TO_LOAD_MORE));
            }
        } else {
            setText(getResources().getString(R.string.LOAD_MORE_RETURNING));
        }
    }

    @Override
    public void onRelease() {
        setText(getResources().getString(R.string.LOAD_MORE_RETURNING));
    }

    @Override
    public void onComplete() {
        setText(getResources().getString(R.string.LOAD_MORE_COMPLETE));
    }

    @Override
    public void onReset() {
        setText("");
    }
}
