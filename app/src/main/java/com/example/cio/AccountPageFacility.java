package com.example.cio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AccountPageFacility extends AppCompatActivity {
Button SearchFE;
Button SignOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_page_facility);
        SearchFE=(Button) findViewById(R.id.button12);
        SignOut=(Button) findViewById(R.id.button1);

        SearchFE.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inttent =new Intent(AccountPageFacility.this, Worker_page.class);
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



