package com.example.cio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AccountPageFacility extends AppCompatActivity {
Button SearchForEmployee;
Button SignOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_page_facility);
        SearchForEmployee=findViewById(R.id.button9);
        SignOut=findViewById(R.id.button1);

        SearchForEmployee.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inttent =new Intent(AccountPageFacility.this, Attendence_Info.class);
                startActivity(inttent);
            }

        });

        SignOut.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inttent =new Intent(AccountPageFacility.this, MainActivity.class);
                startActivity(inttent);
            }

        });
    }
}



