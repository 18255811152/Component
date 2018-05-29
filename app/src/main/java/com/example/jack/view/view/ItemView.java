package com.example.jack.view.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jack.view.util.DensityUtil;

/**
 * Created by jack on 18-4-29.
 */

public class ItemView extends RelativeLayout {

    private ImageView icon;
    private TextView title;
    private ImageView arrow;

    private LayoutParams iconlp;
    private LayoutParams titlelp;
    private LayoutParams arrowlp;


    public ItemView(Context context) {
        super(context);
    }

    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        icon = new ImageView(context);
        title = new TextView(context);
        arrow = new ImageView(context);

        iconlp = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        iconlp.addRule(RelativeLayout.CENTER_VERTICAL, RelativeLayout.TRUE);
        addView(icon, iconlp);

        titlelp = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT);
        titlelp.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);
        addView(title, titlelp);

        arrowlp = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT);
        arrowlp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        addView(arrow, arrowlp);
    }

    /**
     * 设置icon图片距离左边的距离
     * 高度
     * 宽度
     * 资源文件
     *
     * @param iconmargeleft
     * @param height
     * @param width
     * @param resid
     */
    private void setIconStyle(int iconmargeleft, int height, int width, int resid) {
        iconlp.leftMargin = DensityUtil.dp2px(getContext(), iconmargeleft);
        icon.setImageResource(resid);
        ViewGroup.LayoutParams layoutParams = icon.getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = height;
        icon.setLayoutParams(layoutParams);
    }


    /**
     * 设置字体内容
     * 字体颜色
     * 字体大小
     *
     * @param content
     * @param TextSize
     * @param TextColor
     */
    private void setTitleStyle(String content, int TextSize, int TextColor) {
        title.setText(content);
        title.setTextColor(TextColor);
        title.setTextSize(DensityUtil.dp2px(getContext(), TextSize));

    }

    /**
     * @param resid
     * @param arrowmarageRight
     * @param height
     * @param width
     * @param ishow
     */
    private void setArrowStyle(int resid, int arrowmarageRight, int height, int width, boolean ishow) {
        if (ishow) {
            arrow.setVisibility(VISIBLE);

        } else {
            arrow.setVisibility(GONE);
        }
        arrow.setImageResource(resid);
        arrowlp.rightMargin = DensityUtil.dp2px(getContext(), arrowmarageRight);

        ViewGroup.LayoutParams layoutParams = arrow.getLayoutParams();
        layoutParams.height = height;
        layoutParams.width = width;
        arrow.setLayoutParams(layoutParams);
    }

}
