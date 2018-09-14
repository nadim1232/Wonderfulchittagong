package com.muu.wonderfulchittagong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayDeque;

public class hotel extends AppCompatActivity {

    ListView listView;
    String[] listdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

         listdata= getResources().getStringArray(R.array.hotel_list);

        listView=findViewById(R.id.lst_hotel);

        ArrayAdapter arrayAdapter= new ArrayAdapter(getApplicationContext(),android.R.layout.simple_expandable_list_item_1,android.R.id.text1,listdata);
        listView.setAdapter(arrayAdapter);
    }
}
