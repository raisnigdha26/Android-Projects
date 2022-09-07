package com.example.gmailhomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    String[] arr={"Item 1","Item 2","Item 3","Item 4","Item 5","Item 6","Item 7"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=findViewById(R.id.listview);
        ArrayAdapter ad=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        listview.setAdapter(ad);
    }
}