package com.example.myfragmenttransaction;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class FragmentC extends Fragment {

    TextView tvName, tvNim;
    public static String EXTRA_NAME = "extra_name";
    private String nim;

    Button btnPindah;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public FragmentC() {
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
        return inflater.inflate(R.layout.fragment_c, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvName = view.findViewById(R.id.TextViewName);
        tvNim = view.findViewById(R.id.TextViewNim);

        btnPindah = view.findViewById(R.id.button_pindah);
        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent
                //2018045
                Intent a = new Intent(getActivity(), MainActivity2.class);
                startActivity(a);
            }
        });

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //Bundle
        String name = getArguments().getString(EXTRA_NAME);
        tvName.setText(name);

        //Setter Getter
        tvNim.setText(getNim());
    }
}