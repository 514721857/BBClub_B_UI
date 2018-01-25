package com.bbc.bbclub.b.util;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import com.bbc.bbclub.b.R;

/**
 * Created by Administrator on 2017/8/24.
 */

public class Utils {

    /**
     * 文字颜色   这个方法主要是为了解决 一个textview 显示两种颜色的字体
     */
    public static void addForeColorSpan(TextView text, String string, Context context) {
        SpannableString spanString = new SpannableString(string);
        ForegroundColorSpan span = new ForegroundColorSpan( ContextCompat.getColor(context,R.color.shop_text));
        spanString.setSpan(span, 0, string.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        text.append("\r");
        text.append(spanString);

    }
}
