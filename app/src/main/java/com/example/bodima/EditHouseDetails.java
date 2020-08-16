package com.example.bodima;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class EditHouseDetails extends AppCompatActivity {
    TextView username, date;
    EditText desc, amount, beds, baths, phone, city, address;
    ImageView img1, img2, img3;
    Button updateLoc, update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edithouse);

        getSupportActionBar().setTitle("Edit Details");                          //change activity title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);                  //display goBack arrow

        username = (TextView)findViewById(R.id.userlabel);
        date = (TextView)findViewById(R.id.datelabel);
        desc = (EditText)findViewById(R.id.description2);
        amount = (EditText)findViewById(R.id.amount4);
        beds = (EditText)findViewById(R.id.beds_num2);
        baths = (EditText)findViewById(R.id.baths_num2);
        phone = (EditText)findViewById(R.id.phone3);
        city = (EditText)findViewById(R.id.city2);
        address = (EditText)findViewById(R.id.address2);
        img1 = (ImageView)findViewById(R.id.img1);
        img2 = (ImageView)findViewById(R.id.img2);
        img3 = (ImageView)findViewById(R.id.img3);
        updateLoc = (Button) findViewById(R.id.editLocation);
        update = (Button)findViewById(R.id.btnUpdate);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast
                Context context = getApplicationContext();
                CharSequence msgUpdate = "Updating...";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, msgUpdate, duration);
                toast.show();
            }
        });

    }
}