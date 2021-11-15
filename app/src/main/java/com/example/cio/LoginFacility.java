package com.example.cio;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginFacility extends AppCompatActivity {


    EditText Email , password;
    Button SignIn;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_facility);

        Email = (EditText) findViewById(R.id.Email);
        password = (EditText) findViewById(R.id.password);
        SignIn = (Button) findViewById(R.id.login);
        DB = new DBHelper(this);

        SignIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                  Srting Email = Email.getText().toString();
                  String password = password.getText().getString();

                  if(Email.equals(" ")|| password.equals(""))
                      Toast.makeText(LoginFacility.this ,"Plaese enter all the fields" , Toast.LENGTH_SHORT).show();
                  else{
                      Boolean checkFacilityNameEmailPasswordFacilityCode = DB.checkFacilityNameEmailPasswordFacilityCode(Email.password);
                      if (checkFacilityNameEmailPasswordFacilityCode==true){
                          Toast.makeText(LoginFacility.this,"SignIn is successfully",Toast.LENGTH_SHORT).show();
                          Intent intent = new Intent(getApplicationContext(),AccountPageFacility.class);
                          startActivity(intent);
                      }else {
                          Toast.makeText(LoginFacility.this,"Invalid Credentials",Toast.LENGTH_SHORT).show();
                      }
                  }
            }
        }


        );


    }
}