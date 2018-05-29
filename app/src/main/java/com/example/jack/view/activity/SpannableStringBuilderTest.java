package com.example.jack.view.activity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jack.view.R;
import com.example.jack.view.base.BaseActivity;
import com.example.jack.view.util.ToastUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SpannableStringBuilderTest extends BaseActivity {


    @BindView(R.id.spsbText1)
    TextView spsbText1;
    @BindView(R.id.spsbText2)
    TextView spsbText2;
    @BindView(R.id.spsbText3)
    TextView spsbText3;
    @BindView(R.id.spsbText4)
    TextView spsbText4;
    @BindView(R.id.spsbText5)
    TextView spsbText5;
    @BindView(R.id.spsbText6)
    TextView spsbText6;
    @BindView(R.id.spsbText7)
    TextView spsbText7;

    @Override
    protected void createLayoutView() {
        setContentView(R.layout.activity_spannablestringbuilder);

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void initView() {
        mode1();
        mode2();
        mode3();
        mode4();
        mode5();
    }

    @Override
    protected void initDate() {

    }

    @Override
    protected void setTitleView() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    /**
     * 使用spannableStringbuilder设置字体
     * 使用BackgroundColorSpan设置背景颜色。
     */
    @RequiresApi(api = Build.VERSION_CODES.M)
    private void mode1() {
        SpannableString spannableString = new SpannableString("使用spannableStringbuilder设置字体,使用BackgroundColorSpan设置背景颜色。");
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(Color.parseColor("#ff0000"));
        spannableString.setSpan(colorSpan, 31, 50, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        spsbText1.setText(spannableString);
    }

    /**
     * 使用SpannableStringBuilder设置样式——字体颜色
     */
    private void mode2() {
        SpannableStringBuilder stringBuilder = new SpannableStringBuilder();
        stringBuilder.append("使用SpannableStringBuilder");
        stringBuilder.append("设置样式——字体颜色");
        stringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#ff0000")), 0, 24, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        spsbText2.setText(stringBuilder);
    }

    /**
     * 设置背景颜色
     */

    private void mode3() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("设置背景颜色");
        spannableStringBuilder.setSpan(new BackgroundColorSpan(Color.parseColor("#00000000")), 0, 3, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        spsbText3.setText(spannableStringBuilder);
    }

    /**
     * 设置字体大小
     */
    private void mode4() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("设置字体大小");
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(15), 1, 3, Spanned.SPAN_COMPOSING);
        spsbText4.setText(spannableStringBuilder);

    }

    /**
     * 使用SpannableStringBuilder设置样式——图片
     */
    private void mode5() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append("使用SpannableStringBuilder设置样式——图片");
        spannableStringBuilder.setSpan(new ImageSpan(this, R.mipmap.dogview_dog), 3, 5, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        spsbText5.setText(spannableStringBuilder);
    }

    /**
     * 使用点击事件
     */
    private void mode6() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append("设置点击事件");
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "ssssssss", Toast.LENGTH_SHORT).show();
                ToastUtil.showLongToast("ssssssssssss");
            }
        };
        spannableStringBuilder.setSpan(clickableSpan, 0, 3, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        spsbText6.setText(spannableStringBuilder);
        spsbText6.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

