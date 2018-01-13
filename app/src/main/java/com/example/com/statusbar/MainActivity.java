package com.example.com.statusbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.com.statusbarutil.StatusBarUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StatusBarUtil.setImmersiveStatusBar(this,true);
    }
}
