package com.example.cio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cio.ui.login.Login_Employee;

public class Employee_SignUp extends AppCompatActivity {
    Button SignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee__sign_up);
        SignUp=findViewById(R.id.button3);

        SignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inttent =new Intent(Employee_SignUp.this, Account_page.class);
                startActivity(inttent);
            }

        });
    }
}