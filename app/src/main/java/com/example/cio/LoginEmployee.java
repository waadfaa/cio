package com.example.cio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cio.data.DBHelper;

public class LoginEmployee extends AppCompatActivity {


    EditText email;
    EditText password;
    Button SignIn;
    Button NewAccount;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_facility);

        email = (EditText) findViewById(R.id.Email);
        password = (EditText) findViewById(R.id.password);
        SignIn = (Button) findViewById(R.id.login);
        NewAccount= (Button) findViewById(R.id.login1);
        DB = new DBHelper(this);

        NewAccount.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inttent =new Intent(LoginEmployee.this, Employee_SignUp.class);
                startActivity(inttent);
            }

        });
        SignIn.setOnClickListener(new View.OnClickListener(){
                                      @Override
                                      public void onClick(View v) {
                                          String Email = email.getText().toString();
                                          String Password = password.getText().toString();

                                          if(email.equals("")|| password.equals("")) {
                                              Toast.makeText(LoginEmployee.this, "Plaese enter all the fields", Toast.LENGTH_SHORT).show();
                                          } else{
                                              Boolean checkEmailPassword = DB.checkEmailPassword(Email , Password);
                                              if (checkEmailPassword==true){
                                                  Toast.makeText(LoginEmployee.this,"SignIn is successfully",Toast.LENGTH_SHORT).show();
                                                  Intent intent = new Intent(getApplicationContext(),AccountPageFacility.class);
                                                  startActivity(intent);
                                              }else {
                                                  Toast.makeText(LoginEmployee.this,"Invalid Credentials",Toast.LENGTH_SHORT).show();
                                              }
                                          }
                                      }
                                  }


        );


    }
}