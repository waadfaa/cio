package com.example.cio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cio.ui.login.Login_Employee;
import com.example.cio.ui.login.Login_Facility;

public class MainActivity extends AppCompatActivity {
Button Employee;
Button Facility;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Employee=findViewById(R.id.button2);
        Facility=findViewById(R.id.button);

        Employee.setOnClickListener(new View.OnClickListener(){
             @Override
            public void onClick(View v) {
                Intent inttent =new Intent(MainActivity.this, Login_Employee.class);
                startActivity(inttent);
            }

        });

        Facility.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inttent =new Intent(MainActivity.this, Login_Facility.class);
                startActivity(inttent);
            }

        });
    }
}