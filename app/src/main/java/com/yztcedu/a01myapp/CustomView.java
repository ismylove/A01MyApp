package com.yztcedu.a01myapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Created by My on 2016/10/9.
 */
public class CustomView extends ViewGroup{

    public static final int HorizoatalSpan = 20;
    public static final int VerticalSpan = 20;

    public static final int MIN_WIDTH = 300;//容器的最小宽度

    private int childWidth, childHeigth;

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //根据会的ViewGroup的宽度
    }

    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

    }
}
