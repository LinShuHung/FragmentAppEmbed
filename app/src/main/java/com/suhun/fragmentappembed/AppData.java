package com.suhun.fragmentappembed;

import android.app.Application;
import android.util.Log;

public class AppData extends Application {
    public String tag = AppData.class.getSimpleName();
    public AppData(){
        super();
        Log.d(tag, "suhun add: AppData was born!!!");
    }
}
