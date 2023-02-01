/**
 Section 7
 Video no  73

 The Counter App

 * How to set any text to textview widgets
 */
package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2,tv3;
    Button bt1,bt2;
    // local variables
    static int counter=0;
    int total=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.textView1);
        tv2=findViewById(R.id.textView2);
        tv3=findViewById(R.id.textView3);
        bt1=findViewById(R.id.button1);
        bt2=findViewById(R.id.button2);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // In this way we can set any text in textview Widgets
                 tv2.setText(""+increment());
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total+=counter;
                counter=0;
                tv3.setText(" "+total);
                tv2.setText(" "+0);
            }
        });
    }
    public static  int increment()
    {
        return ++counter;
    }
}

