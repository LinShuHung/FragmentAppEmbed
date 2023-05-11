package com.suhun.fragmentappembed;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.HashMap;
import java.util.LinkedList;

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
        for(LinkedList<HashMap<String, Float>> line:signViewData.getLines()){
            for(int i=1; i<line.size();i++){
                HashMap<String, Float> p0 = line.get(i-1);
                HashMap<String, Float> p1 = line.get(i);
                canvas.drawLine(p0.get("x"), p0.get("y"), p1.get("x"), p1.get("y"), paint);
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        HashMap<String, Float> point = new HashMap<>();
        point.put("x", event.getX()); point.put("y", event.getY());
        if(event.getAction()==MotionEvent.ACTION_DOWN){
            LinkedList<HashMap<String, Float>> line = new LinkedList<>();
            line.add(point);
            signViewData.getLines().add(line);
        }else if(event.getAction()==MotionEvent.ACTION_MOVE){
            signViewData.getLines().getLast().add(point);
        }
        invalidate();
        return true;
    }
}
