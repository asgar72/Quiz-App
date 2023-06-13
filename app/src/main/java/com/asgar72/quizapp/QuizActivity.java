package com.asgar72.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    TextView topicName,timer,questions,question;
    ImageView back_btn;

    AppCompatButton option1,option2,option3,option4,next_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        topicName = findViewById(R.id.topicName);
        timer = findViewById(R.id.timer);
        back_btn = findViewById(R.id.back_btn);

        questions = findViewById(R.id.question);
        question = findViewById(R.id.question);

        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        next_btn = findViewById(R.id.next_btn);

        String getSelectedTopicName = getIntent().getStringExtra("selectedTopic");
        topicName.setText(getSelectedTopicName);
    }
}