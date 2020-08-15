package com.example.bodima;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bodima.R;
import com.example.bodima.RatingsAndReviews;

public class AddReview extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_review);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openRatings();
            }
        });
    }

    private void openRatings(){
        Intent intent = new Intent(this, RatingsAndReviews.class);
        startActivity(intent);
    }
}