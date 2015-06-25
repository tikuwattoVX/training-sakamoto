package com.example.sample.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * ローカルファイルの書き込みと読み込み
 */

public class MainActivity extends ActionBarActivity {

    EditText edittext;
    TextView textView;
    Button saveButton;
    Button readButton;
    String str;
    String str2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext = (EditText) findViewById(R.id.edit1);
        textView = (TextView) findViewById(R.id.textView1);
        saveButton = (Button) findViewById(R.id.button1);
        readButton = (Button) findViewById(R.id.button2);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = edittext.getText().toString();

                try {
                    // 出力ストリームを開く
                    OutputStream out = openFileOutput("a.txt", MODE_PRIVATE);
                    // PrintWriterインスタンスを使って書き込みを行う準備
                    PrintWriter writer =
                            new PrintWriter(new OutputStreamWriter(out, "UTF-8"));
                    // 書き込む
                    writer.append(str);
                    // closeすることでコミットも行っている
                    writer.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
        });

        readButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    // 入力ストリームを開く
                    InputStream in = openFileInput("a.txt");
                    // BufferedReaderインスタンスを使って読み込みを行う準備
                    BufferedReader reader =
                            new BufferedReader(new InputStreamReader(in, "UTF-8"));

                    // １行ずつあるだけ読み込む
                    while((str2 = reader.readLine())!= null) {
                        textView.append(str2);
                        textView.append("\n");
                    }
                    // closeすることでコミットも行っている
                    reader.close();

                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
