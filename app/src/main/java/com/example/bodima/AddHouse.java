package com.example.bodima;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddHouse extends AppCompatActivity {
    private Calendar calendar;
    private SimpleDateFormat dateFormat;
    private String curdate;

    TextView username, date;
    EditText desc, amount, beds, baths, phone, city, address;
    Button addImg, addLoc, save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_house);

        getSupportActionBar().setTitle("Add House");                            //change activity title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);                  //display goBack arrow

        username = (TextView)findViewById(R.id.username);
        date = (TextView)findViewById(R.id.date);
        desc = (EditText)findViewById(R.id.description);
        amount = (EditText)findViewById(R.id.amount);
        beds = (EditText)findViewById(R.id.beds_num);
        baths = (EditText)findViewById(R.id.baths_num);
        phone = (EditText)findViewById(R.id.phone);
        city = (EditText)findViewById(R.id.city);
        address = (EditText)findViewById(R.id.address);
        addImg = (Button) findViewById(R.id.addImg);
        addLoc = (Button)findViewById(R.id.addLoc);
        save = (Button)findViewById(R.id.btnSave);

        //get current date
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        curdate = dateFormat.format(calendar.getTime());
        date.setText(curdate);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*send multiple data using a bundle
                Bundle bundle = new Bundle();
                bundle.putString("name", username.getText().toString());
                bundle.putString("currentDate", date.getText().toString());
                bundle.putString("description", desc.getText().toString());
                bundle.putString("price", amount.getText().toString());
                bundle.putString("beds_no", beds.getText().toString());
                bundle.putString("baths_no", baths.getText().toString());
                bundle.putString("tel", phone.getText().toString());
                bundle.putString("cityName", city.getText().toString());
                bundle.putString("addressN", address.getText().toString());*/

                //Toast
                Context context = getApplicationContext();
                CharSequence message = "Saving data...";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, message, duration);
                toast.show();
            }
        });

    }
}