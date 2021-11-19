package com.example.cio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



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
                Intent inttent =new Intent(MainActivity.this, EmployeeLogin.class);
                startActivity(inttent);
            }

        });

        Facility.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inttent =new Intent(MainActivity.this, FacilityLogin.class);
                startActivity(inttent);
            }

        });
    }
}