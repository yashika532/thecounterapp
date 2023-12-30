package com.learning.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout;
TextView text;
TextView count;
Button inc;
Button dec;
Button res;
int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         constraintLayout=findViewById(R.id.main);
        AnimationDrawable animationDrawable=(AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();
        inc=findViewById(R.id.button2);
        dec=findViewById(R.id.button3);
        res=findViewById(R.id.button);
        count = findViewById(R.id.textView);
        text=findViewById(R.id.txt);
        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.setText(""+increment());
            }
        }
        );
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.setText(""+decrement());
            }
        });
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.setText(""+reset());
            }
        });

    }
    int increment(){
        return ++counter;
    }
    int decrement(){
        return --counter;
    }
    int reset(){
        return counter=0;
    }
}