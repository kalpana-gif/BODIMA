package com.example.bodima;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class AddHouseFragment extends Fragment {
    TextView username, date;
    EditText desc, amount, beds, baths, phone, city, address;
    Button addImg, addLoc, save;

    public AddHouseFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_add_house, container, false);

        username = (TextView) v.findViewById(R.id.username);
        date = (TextView) v.findViewById(R.id.date);
        desc = (EditText) v.findViewById(R.id.description);
        amount = (EditText) v.findViewById(R.id.amount);
        beds = (EditText) v.findViewById(R.id.beds_num);
        baths = (EditText) v.findViewById(R.id.baths_num);
        phone = (EditText) v.findViewById(R.id.phone);
        city = (EditText) v.findViewById(R.id.city);
        address = (EditText) v.findViewById(R.id.address);
        addImg = (Button) v.findViewById(R.id.addImg);
        //addLoc = (Button) v.findViewById(R.id.addLoc);
        save = (Button) v.findViewById(R.id.btnSave);

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
                Context context = getActivity();
                CharSequence msgUpdate = "Please wait...";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, msgUpdate, duration);
                toast.show();
            }
        });

        return v;
    }
}