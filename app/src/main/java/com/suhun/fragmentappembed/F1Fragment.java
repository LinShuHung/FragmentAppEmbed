package com.suhun.fragmentappembed;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class F1Fragment extends Fragment {
    private View view;
    private MainActivity activity;
    private SignView signView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(view==null){
            // Inflate the layout for this fragment
            view = inflater.inflate(R.layout.fragment_f1, container, false);
            Button clearBtn = view.findViewById(R.id.reset);
            signView = view.findViewById(R.id.sign);
            clearBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    signView.clear();
                }
            });
        }
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        activity = (MainActivity)context;
    }
}