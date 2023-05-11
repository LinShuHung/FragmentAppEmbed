package com.suhun.fragmentappembed;

import android.content.Context;
import android.util.AttributeSet;
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
}
