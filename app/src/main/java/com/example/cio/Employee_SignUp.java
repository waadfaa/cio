package com.example.cio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Employee_SignUp extends AppCompatActivity {
    Button SignUp;
    EditText FirstN, LastN, email, password, FacilityCE;
    RadioButton male , female;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
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


        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("Employee");

                String FirstName = FirstN.getText().toString();
                String LastName  = LastN.getText().toString();
                String Email = email.getText().toString();
                int Password = Integer.parseInt(password.getText().toString());
                int FacilityCodeE = Integer.parseInt(FacilityCE.getText().toString());
                String Male = male.getText().toString();
                String Female = female.getText().toString();

                EmployeeHelper helperClassE = new EmployeeHelper(FirstName,LastName,Email,Password,FacilityCodeE,Male,Female);
                reference.setValue(helperClassE);
                Intent inttent =new Intent(Employee_SignUp.this, Account_page.class);
                startActivity(inttent);


            }
        });}
}