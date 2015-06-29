package com.example.sample.mediaplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by masakisakamoto on 2015/06/29.
 */
public class MyActivity extends ActionBarActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView v = new MyView(this);
        Intent intent = getIntent();
        int vx = intent.getIntExtra("vx", 1);
        int vy = intent.getIntExtra("vy", 1);
        v.mVX = vx;
        v.mVY = vy;
        setContentView(v);
    }
}
