package com.example.myfragmenttransaction;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentA fragA = new FragmentA();
        Fragment fragment = fm.findFragmentByTag(FragmentA.class.getSimpleName());
        if(!(fragment instanceof FragmentA)) {
            fm.beginTransaction()
                    .add(R.id.frame_main, fragA, FragmentA.class.getSimpleName())
                    .commit();
        }
    }
}