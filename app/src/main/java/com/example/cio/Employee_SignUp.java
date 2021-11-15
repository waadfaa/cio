package com.example.cio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Employee_SignUp extends AppCompatActivity {
    Button SignUp;
    EditText FirstN, LastN, email, password, FacilityCE;
    RadioButton male , female;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee__sign_up);
        SignUp=findViewById(R.id.SignUp);
        FirstN = (EditText) findViewById(R.id.FirstName);
        LastN = (EditText) findViewById(R.id.LastName);
        email = (EditText) findViewById(R.id.Email);
        password = (EditText) findViewById(R.id.Password);
        FacilityCE = (EditText) findViewById(R.id.FacilitycodeE);
        male = (RadioButton) findViewById(R.id.Male);
        female = (RadioButton) findViewById(R.id.Female);
        DB = new DBHelper(this);

        SignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String FirstName = FirstN.getText().toString();
                String LastName = LastN.getText().toString();
                String Email = email.getText().toString();
                String Password = password.getText().toString();
                String FacilityCodeE = FacilityCE.getText().toString();

                if (FirstName.equals("") || LastName.equals("") || Email.equals("") || Password.equals("") || FacilityCodeE.equals("")) {
                    Toast.makeText(Employee_SignUp.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();

                } else {
                    if (FirstName.equals(FirstName)) {
                        Boolean checkFirstName = DB.checkFirstName(FirstName);
                        if (checkFirstName == false) {
                            Boolean insert = DB.insertDataF(FirstName, Email, Password, FacilityCodeE);
                            if (insert == true) {
                                Toast.makeText(Employee_SignUp.this, "Registered successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), Account_page.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(Employee_SignUp.this, "Registered Field", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(Employee_SignUp.this, "User already exists! please sgin in", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

            }

        });
    }
}