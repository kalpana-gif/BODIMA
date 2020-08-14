package com.example.bodima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AddHouse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_house);

        getSupportActionBar().setTitle("Add House");                            //change activity title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);                  //display goBack arrow
    }
}