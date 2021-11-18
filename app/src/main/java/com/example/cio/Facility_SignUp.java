package com.example.cio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Facility_SignUp extends AppCompatActivity {

    Button SignUp;
    EditText FacilityN, email, password, FacilityC;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facility__sign_up);
        FacilityN = (EditText) findViewById(R.id.FacilityName);
        email = (EditText) findViewById(R.id.Email);
        password = (EditText) findViewById(R.id.Password);
        FacilityC = (EditText) findViewById(R.id.FacilityCode);
        SignUp = (Button) findViewById(R.id.SignUp);


        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("Facility");
                String FacilityName = FacilityN.getEditableText().getText().toString();
                int Password = password.getEditableText().getText().toString();
                String Email = email.getEditableText().getText().toString();
                int Facilitycode = FacilityC.getEditableText().getText().toString();

                FacilityHelper helperClassF = new FacilityHelper(FacilityName,Email,Password,Facilitycode);

                reference.setValue("test");


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
