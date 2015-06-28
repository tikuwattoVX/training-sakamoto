package com.example.sample.namescoreapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MyForm extends ActionBarActivity {

    public final static String EXTRA_MYNAME = "com.example.sample.namescoreapp.MYNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_form);
    }


    public void getScore(View view) {
        // EditTextを取得
        EditText myEditText = (EditText) findViewById(R.id.myEditText);

        // EditTextの中身を取得
        String myName = myEditText.getText().toString().trim();

        // 中身を見て条件分岐
        if (myName.equals("")) {
            // エラー処理
            /*
            1.EditTextのsetErrorメソッドを使う方法
            2.Toastを使って表示する方法
            3.Dialogを使って知らせる方法
            */
            myEditText.setError("Please enter your name!");
//            Toast.makeText(
//                    this,
//                    "Please enter your name!",
//                    Toast.LENGTH_LONG).show();
//            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
//            alertDialogBuilder
//                    .setTitle("Error!")
//                    .setMessage("Please enter your name!")
//                    .setPositiveButton("OK", null);
//            AlertDialog alertDialog = alertDialogBuilder.create();
//            alertDialog.show();
        } else {
            // 次の画面へ
            Intent intent = new Intent(this, MyResult.class);
            intent.putExtra(EXTRA_MYNAME, myName);
            startActivity(intent);
        }
    }
}
