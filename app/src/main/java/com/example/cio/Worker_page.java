package com.example.cio;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Worker_page extends AppCompatActivity {
    ListView listview;
    String[] ListElements = new String[] {
            "fahad",
            "abdullah"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_page);
        listview = (ListView) findViewById(R.id.listView1);
    }
}