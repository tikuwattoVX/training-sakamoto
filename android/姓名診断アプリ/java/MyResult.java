package com.example.sample.namescoreapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Random;


public class MyResult extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_result);

        Intent intent = getIntent();
        String myName = intent.getStringExtra(MyForm.EXTRA_MYNAME);
        TextView nameLabel = (TextView) findViewById(R.id.nameLabel);
        nameLabel.setText(myName + "の点数は...");

        Random randomGenerator = new Random();
        int score = randomGenerator.nextInt(101);
        TextView scoreLabel = (TextView) findViewById(R.id.scoreLabel);
        scoreLabel.setText(String.valueOf(score) + "点！");
    }



}
