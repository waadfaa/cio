package com.example.cio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class FacilityLogin extends AppCompatActivity {

    EditText email;
    EditText password;
    Button SignIn;
    Button NewAccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facility_login);

        email = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        SignIn = (Button) findViewById(R.id.login);
        NewAccount= (Button) findViewById(R.id.login1);


        NewAccount.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inttent =new Intent(FacilityLogin.this, Facility_SignUp.class);
                startActivity(inttent);
            }

        });
        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inttent =new Intent(FacilityLogin.this, AccountPageFacility.class);
                startActivity(inttent);

            }
        });}}