package com.mks.logme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.msk.logmelib.LogMe;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogMe.setTAG("MainActivity");
        LogMe.d("This is debug message");
    }
}
