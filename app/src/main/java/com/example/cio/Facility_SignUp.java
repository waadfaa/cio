package com.example.cio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Facility_SignUp extends AppCompatActivity {

    Button SignUp;
    DBHelper db;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facility__sign_up);
        SignUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String FacilityName = FacilityName.getText().toString();
                int Password = Integer.parseInt(Password.getText().toString());
                Log.e("CIO", FacilityName + ", " + Password);

                boolean isInserted = db.insertFacility_SignUp(FacilityName, Password);
                if (isInserted) {
                    Toast.makeText(Facility_SignUp.this, "Added Successfully", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Facility_SignUp.this, "Added Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
        private String FacilityName;
        private String Email;
        private int Password;
        private int FacilityCode;
        public static final String TABLE_NAME = "Facility_SignUp ";

        public static final String COL_FacilityName = "FacilityName";
        public static final String COL_Email = "Email";
        public static final String COL_Password = "Password";
        public static final String COL_FacilityCode = "FacilityCode";


        public static final String CREATE_TABLE = "create table " + TABLE_NAME +
                "(" + COL_FacilityName + " string primary key autoincrement," + COL_Email +
                " text," + COL_Password + " integer," + COL_FacilityCode + "integer ,)";

        public static final String DROP_TABLE = "drop table if exists " + TABLE_NAME;


    public Facility_SignUp(String FacilityName, String Email, int Password, int FacilityCode){
            this.FacilityName = FacilityName;
            this.Email = Email;
            this.Password = Password;
            this.FacilityCode = FacilityCode;
        }

    public Facility_SignUp() {
        }
        public String getFacilityName () {
            return FacilityName;
        }

        public String getEmail () {
            return Email;
        }

        public int getPassword () {
            return Password;
        }
        public int getFacilityCode () {
            return FacilityCode;
        }


        public void setFacilityName (String FacilityName){
            this.FacilityName = FacilityName;
        }

        public void setEmail (String Email){
            this.Email = Email;
        }

        public void setPassword ( int Password){
            this.Password = Password;
        }

        public void setFacilityCode ( int FacilityCode){
            this.FacilityCode = FacilityCode;
        }
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
