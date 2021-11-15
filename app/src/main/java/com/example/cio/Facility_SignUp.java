package com.example.cio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Facility_SignUp extends AppCompatActivity {

    Button SignUp;
    EditText FacilityName , Email,Password ,FacilityCode;
    DBHelper DB;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facility__sign_up);
        FacilityName =(EditText) findViewById(R.id.FacilityName);
        Email = (EditText) findViewById(R.id.Email);
        Password =(EditText) findViewById(R.id.Password);
        FacilityCode =(EditText) findViewById(R.id.FacilityCode);
        SignUp=(Button)findViewById(R.id.SignUp);
        DB = new DBHelper(this );

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view ) {
                String FacilityName = FacilityName.getText().toString();
                String Email = Email.getText().toString();
                String Password = Password.getText().toString();
                String FacilityCode = FacilityCode.getText().toString();

                if(FacilityName.equals("")|| Email.equals("")|| Password.equals("")|| FacilityCode.equals(""))
                    Toast.makeText(Facility_SignUp.this ,"Please enter all the fieds",Toast.LENGTH_SHORT).show();

                else {
                    if(FacilityName.equals(FacilityName)){
                    Boolean checkFacility = DB.checkFacilityName(FacilityName);
                    if (checkFacility == false) {
                        Boolean insert = DB.insertData(FacilityName, Email, Password, FacilityCode);
                        if (insert == true) {
                            Toast.makeText(Facility_SignUp.this, "Registered successfully", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(),AccountPageFacility.class);
                            startActivity(intent);
                        }
                    else{
                                Toast.makeText(Facility_SignUp.this, "Registered Field", Toast.LENGTH_SHORT).show();
                            }
                        }
                    else {
                        Toast.makeText(Facility_SignUp.this, "User already exists! please sgin in", Toast.LENGTH_SHORT).show();
                    }
                    }




            }
        });

    }
    }












   // @Override
    //protected void onCreate(Bundle savedInstanceState) {
      //  super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_facility__sign_up);

        //FacilityName=(EditText)findViewById(R.id.editTextTextPersonName3);
        //Email=(EditText)findViewById(R.id.editTextTextEmailAddress2);
       // Password=(EditText)findViewById(R.id.editTextTextPassword2);
        //FacilityCode=(EditText)findViewById(R.id.editTextTextPassword);
        //SignUp=(Button)findViewById(R.id.button4);

        //SignUp.setOnClickListener(new View.OnClickListener(){
          //  @Override
            //public void onClick(View v) {
              //  Intent inttent =new Intent(Facility_SignUp.this, Account_page.class);
                //startActivity(inttent);
           // }

        //});

    //    SignUp.setOnClickListener(new View.OnClickListener() {
      //      @Override
        //    public void onClick(View v) {
         //       String FacilityNameTXT = FacilityName.getText().toString();
         //       String EmailTXT = Email.getText().toString();
         //       String PasswordTXT = Password.getText().toString();
         //       String FacilityCodeTXT = FacilityCode.getText().toString();

        //        Boolean CheckInsertData= db.insert(FacilityNameTXT , EmailTXT , PasswordTXT , FacilityCodeTXT);
        //        if(CheckInsertData == true)
        //            Toast.makeText(Facility_SignUp.this,"New Entry Inserted",Toast.LENGTH_SHORT).show();

        //        else
          //          Toast.makeText(Facility_SignUp.this,"New Entry not Inserted",Toast.LENGTH_SHORT).show();
         //   }

       // });




  //  }
