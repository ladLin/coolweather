package com.example.coolweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.litepal.LitePal;
import org.litepal.crud.LitePalSupport;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LitePal.initialize(this);
    }
}
