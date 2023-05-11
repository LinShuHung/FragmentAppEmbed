package com.suhun.fragmentappembed;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

public class SignView extends View {
    private MainActivity activity;
    private AppData.SignViewData signViewData;
    public SignView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        activity = (MainActivity) context;
        AppData appData = (AppData)activity.getApplication();
        signViewData = appData.signViewData;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(4);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return true;
    }
}
