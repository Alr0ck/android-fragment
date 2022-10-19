package com.example.myfragmenttransaction;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class FragmentA extends Fragment {

    Button btn;
    TextView tv1;

    public FragmentA() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btn = view.findViewById(R.id.button1);
        tv1 = view.findViewById(R.id.textview1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                tv1.setText("Hello world..!");
                FragmentB fragB = new FragmentB();
                FragmentManager fm = getParentFragmentManager();
                if(fm != null) {
                    fm.beginTransaction()
                            .replace(R.id.frame_main, fragB, FragmentB.class.getSimpleName())
                            .addToBackStack(null)
                            .commit();
                }
            }
        });
    }
}