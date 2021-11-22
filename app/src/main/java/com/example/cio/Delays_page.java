package com.example.cio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Delays_page extends AppCompatActivity {
 Button Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delays_page);
        Back = findViewById(R.id.button);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inttent =new Intent(Delays_page.this, Account_page.class);
                startActivity(inttent);
            }
        });
    }
}