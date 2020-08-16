package com.example.bodima;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AllAds extends AppCompatActivity {

    Button Clickpost_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_ads);

        OnClickButtonLister();
    }


    public void OnClickButtonLister(){
        Clickpost_btn=(Button)findViewById(R.id.Clickpost_btn);
        Clickpost_btn.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View view){
                        Intent intent= new Intent(AllAds.this,PostAdvertisment.class);
                        startActivity(intent);
                    }
                }

        );
    }
}
