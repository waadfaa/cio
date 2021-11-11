package com.example.cio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Account_page extends AppCompatActivity {
Button SignOut;
Button Attendances;
Button Absents;
Button Delays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_page);
        SignOut=findViewById(R.id.button1);
        Attendances=findViewById(R.id.button3);
        Absents=findViewById(R.id.button2);
        Delays=findViewById(R.id.button5);

        SignOut.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inttent =new Intent(Account_page.this, MainActivity.class);
                startActivity(inttent);
            }

        });
        Attendances.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inttent =new Intent(Account_page.this, Attendence_page.class);
                startActivity(inttent);
            }

        });
        Absents.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inttent =new Intent(Account_page.this, Absents_paga.class);
                startActivity(inttent);
            }

        });
        Delays.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inttent =new Intent(Account_page.this, Delays_page.class);
                startActivity(inttent);
            }

        });
    }
}