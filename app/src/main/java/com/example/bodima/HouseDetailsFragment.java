package com.example.bodima;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HouseDetailsFragment extends Fragment {

    ViewPager viewPager;
    FloatingActionButton fab;
    Button button;
    TextView textPhoneNum;

    public HouseDetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_house_details, container, false);

        //Image slider
        viewPager = (ViewPager) v.findViewById(R.id.viewPagerHouse);
        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(getActivity());
        viewPager.setAdapter(viewPageAdapter);

        //Text
        textPhoneNum = (TextView) v.findViewById(R.id.txtNumber);

        //Floating action Button
        fab = (FloatingActionButton) v.findViewById(R.id.floatCall);

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
        button = (Button) v.findViewById(R.id.btnReviews);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //directing to Reviews page
                Intent intent = new Intent(getActivity(),RatingsAndReviews.class);
                startActivity(intent);
            }
        });

        return v;
    }
}