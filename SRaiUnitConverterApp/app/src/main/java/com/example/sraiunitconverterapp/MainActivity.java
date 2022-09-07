package com.example.sraiunitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview;
    private EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textview=findViewById(R.id.textView2);
        edittext=findViewById(R.id.editTextTextPersonName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hii click listehner worked!",Toast.LENGTH_SHORT).show();
                String s=edittext.getText().toString();
                int kg=Integer.parseInt(s);
                double pound=2.205*kg;
                textview.setText("The corresponding value in pound is "+pound);


            }
        });

    }
}