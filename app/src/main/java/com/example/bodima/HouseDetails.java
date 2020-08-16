package com.example.bodima;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HouseDetails extends AppCompatActivity {

    ViewPager viewPager;
    FloatingActionButton fab;
    Button button;
    TextView textPhoneNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_details);

        getSupportActionBar().setTitle("Details");                            //change activity title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);                //display goBack arrow

        //Image slider
        viewPager = (ViewPager)findViewById(R.id.viewPagerHouse);
        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(this);
        viewPager.setAdapter(viewPageAdapter);

        //Text
        textPhoneNum = (TextView)findViewById(R.id.txtNumber);

        //Floating action Butoon
        fab = (FloatingActionButton)findViewById(R.id.floatCall);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textPhoneNum.getVisibility() == View.INVISIBLE)
                    textPhoneNum.setVisibility(View.VISIBLE);
                else
                    textPhoneNum.setVisibility(View.INVISIBLE);
            }
        });

        //ImageButton
        button = (Button)findViewById(R.id.btnReviews);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //directing to Reviews page
                Intent intent = new Intent(HouseDetails.this,Home.class);
                startActivity(intent);
            }
        });


    }
}