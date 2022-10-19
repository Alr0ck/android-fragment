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

public class FragmentB extends Fragment {

    Button btnParsing;

    public FragmentB() {
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
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnParsing = view.findViewById(R.id.btn2);
        btnParsing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString(FragmentC.EXTRA_NAME, "Alfiyan");

                FragmentC fragC = new FragmentC();

                fragC.setArguments(bundle);
                fragC.setNim("1318179");

                FragmentManager fm = getParentFragmentManager();
                if(fm != null) {
                    fm.beginTransaction()
                            .replace(R.id.frame_main, fragC, FragmentC.class.getSimpleName())
                            .addToBackStack(null)
                            .commit();
                }
            }
        });
    }
}