package com.asgar72.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout c_layout,ccc_layout,java_layout,android_layout;
    Button btn_start;

    String selectedTopicName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c_layout =findViewById(R.id.c_layout);
        ccc_layout=findViewById(R.id.ccc_layout);
        java_layout=findViewById(R.id.java_layout);
        android_layout=findViewById(R.id.android_layout);

        btn_start =findViewById(R.id.btn_start);

        c_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName="C";
                c_layout.setBackgroundResource(R.drawable.round_back_all);
                ccc_layout.setBackgroundResource(R.drawable.round_back);
                java_layout.setBackgroundResource(R.drawable.round_back);
                android_layout.setBackgroundResource(R.drawable.round_back);
            }
        });


        ccc_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName="C++";
                ccc_layout.setBackgroundResource(R.drawable.round_back_all);
                c_layout.setBackgroundResource(R.drawable.round_back);
                java_layout.setBackgroundResource(R.drawable.round_back);
                android_layout.setBackgroundResource(R.drawable.round_back);
            }
        });

        java_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName="Java";
                java_layout.setBackgroundResource(R.drawable.round_back_all);
                ccc_layout.setBackgroundResource(R.drawable.round_back);
                c_layout.setBackgroundResource(R.drawable.round_back);
                android_layout.setBackgroundResource(R.drawable.round_back);
            }
        });

        android_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName="C";
                android_layout.setBackgroundResource(R.drawable.round_back_all);
                c_layout.setBackgroundResource(R.drawable.round_back);
                ccc_layout.setBackgroundResource(R.drawable.round_back);
                java_layout.setBackgroundResource(R.drawable.round_back);
            }
        });


        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please Select the Topic", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this,QuizActivity.class);
                    intent.putExtra("selectedTopic",selectedTopicName);
                    startActivity(intent);

                }
            }
        });

    }
}