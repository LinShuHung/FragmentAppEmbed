package com.suhun.fragmentappembed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public String tag = MainActivity.class.getSimpleName();
    private Button goPage1Btn, goPage2Btn;
    private F1Fragment f1;
    private F2Fragment f2;
    private FragmentManager fmgr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initFrigment();
    }
    private void initView(){
        goPage1Btn = findViewById(R.id.f1Page);
        goPage2Btn = findViewById(R.id.f2Page);
    }

    private void initFrigment(){
        f1 = new F1Fragment();
        f2 = new F2Fragment();
        fmgr = getSupportFragmentManager();
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.add(R.id.container, f1);
        transaction.commit();
    }

    public void goPage1Fun(View view){

    }

    public void goPage2Fun(View view){

    }
}