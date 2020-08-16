package com.example.bodima;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PostAdvertisment extends AppCompatActivity {

    Button Land_btn,Vehi_btn,House_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_advertisment);

        OnClickButtonLister1();
        OnClickButtonLister2();
        OnClickButtonLister3();
    }
    public void OnClickButtonLister1(){
        Land_btn=(Button)findViewById(R.id.Land_btn);
        Land_btn.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View view){
                        Intent intent= new Intent(PostAdvertisment.this,LandForm.class);
                        startActivity(intent);
                    }
                }

                );
    }
    public void OnClickButtonLister2(){
        Vehi_btn=(Button)findViewById(R.id.Vehi_btn);
        Vehi_btn.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View view){
                        Intent intent= new Intent(PostAdvertisment.this,VehicleForm.class);
                        startActivity(intent);
                    }
                }

        );
    }

    public void OnClickButtonLister3(){
        House_btn=(Button)findViewById(R.id.House_btn);
        House_btn.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View view){
                        Intent intent= new Intent(PostAdvertisment.this,HouseForm.class);
                        startActivity(intent);
                    }
                }

        );
    }
}