package com.suhun.fragmentappembed;

import android.app.Application;
import android.util.Log;

import java.util.HashMap;
import java.util.LinkedList;

public class AppData extends Application {
    public String tag = AppData.class.getSimpleName();
    public SignViewData signViewData;
    class SignViewData{
        private LinkedList<LinkedList<HashMap<String, Float>>> lines = new LinkedList<>();
        private LinkedList<LinkedList<HashMap<String, Float>>> recycle = new LinkedList<>();

        public LinkedList<LinkedList<HashMap<String, Float>>> getLines(){
            return this.lines;
        }

        public LinkedList<LinkedList<HashMap<String, Float>>> getRecycle(){
            return this.recycle;
        }
    }
    public AppData(){
        super();
        Log.d(tag, "suhun add: AppData was born!!!");
        signViewData = new SignViewData();
    }

}
