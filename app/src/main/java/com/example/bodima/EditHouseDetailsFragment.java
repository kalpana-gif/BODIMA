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

public class EditHouseDetailsFragment extends Fragment {

    TextView username, date;
    EditText desc, amount, beds, baths, phone, city, address;
    ImageView img1, img2, img3;
    Button updateLoc, update;

    public EditHouseDetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_edit_house_details, container, false);

        username = (TextView) v.findViewById(R.id.userlabel);
        date = (TextView) v.findViewById(R.id.datelabel);
        desc = (EditText) v.findViewById(R.id.description2);
        amount = (EditText) v.findViewById(R.id.amount4);
        beds = (EditText) v.findViewById(R.id.beds_num2);
        baths = (EditText) v.findViewById(R.id.baths_num2);
        phone = (EditText) v.findViewById(R.id.phone3);
        city = (EditText) v.findViewById(R.id.city2);
        address = (EditText) v.findViewById(R.id.address2);
        img1 = (ImageView) v.findViewById(R.id.img1);
        img2 = (ImageView) v.findViewById(R.id.img2);
        img3 = (ImageView) v.findViewById(R.id.img3);
        //updateLoc = (Button) v.findViewById(R.id.editLocation);
        update = (Button) v.findViewById(R.id.btnUpdate);

        update.setOnClickListener(new View.OnClickListener() {
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
                CharSequence msgUpdate = "Updating...";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, msgUpdate, duration);
                toast.show();
            }
        });

        return v;
    }
}