package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class list extends AppCompatActivity {
    private Button button5;
    private Button button4;
    private Button button3;
    private Button button2;
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        button5= (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        button4= (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

        button3= (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });

        button2= (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });

        button6= (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();
            }
        });
    }
    public void openActivity3(){
        Intent intent = new Intent(this, Android.class);
        startActivity(intent);
    }
    public void openActivity4(){
        Intent intent = new Intent(this, iPhone.class);
        startActivity(intent);
    }

    public void openActivity5(){
        Intent intent = new Intent(this, Windows.class);
        startActivity(intent);
    }

    public void openActivity6(){
        Intent intent = new Intent(this, Bluckberry.class);
        startActivity(intent);
    }

    public void openActivity7(){
        Intent intent = new Intent(this, Linux.class);
        startActivity(intent);
    }
}
