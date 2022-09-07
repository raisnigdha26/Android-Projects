package com.example.mequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions={"1. Do I have a mole(til) on my left cheek?", "2. Do I like kids?", "3. Do I like western clothes more than indian?",
    "4. Do I have 206 bones?", "5. Do I like cooking?", "6. Will I cook for my love?"};
    private boolean[] answers={false,true,false,false,false,true};
    private int score=0,index=0;
    Button yes;
    Button no;
    TextView question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        question=findViewById(R.id.question);
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length-1)
                {
                    if(answers[index])
                    {
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1) {
                        question.setText(questions[index]);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Your Score is: " + score, Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length-1)
                {
                    if(!answers[index])
                    {
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1) {
                        question.setText(questions[index]);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Your Score is: " + score, Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}