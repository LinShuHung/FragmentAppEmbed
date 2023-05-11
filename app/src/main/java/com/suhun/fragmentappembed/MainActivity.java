package com.suhun.fragmentappembed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public String tag = MainActivity.class.getSimpleName();
    Button goPage1Btn, goPage2Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        goPage1Btn = findViewById(R.id.f1Page);
        goPage2Btn = findViewById(R.id.f2Page);
    }

    public void goPage1Fun(View view){

    }

    public void goPage2Fun(View view){

    }
}