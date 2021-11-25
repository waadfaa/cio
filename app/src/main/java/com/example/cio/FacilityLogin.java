package com.example.cio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class FacilityLogin extends AppCompatActivity  {

    EditText email;
    EditText password;
    Button SignIn;
    Button NewAccount;
    FirebaseAuth mAuth;
    ProgressBar progressBar;
    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facility_login);

        email = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        SignIn = (Button) findViewById(R.id.login);
        NewAccount = (Button) findViewById(R.id.login1);
        progressBar = (ProgressBar) findViewById(R.id.loading);
        mAuth = FirebaseAuth.getInstance();


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
                 }

                 });
    }
}





