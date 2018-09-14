package com.muu.wonderfulchittagong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void goHotel(View view) {

        Intent intent= new Intent(this, hotel.class);
        startActivity(intent);
    }

    public void goLoc(View view) {
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
