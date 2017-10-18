package com.ernerst.mapotse.javatest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ernerst.mapotse.javatest.classes.Address;
import com.ernerst.mapotse.javatest.classes.Pearl;
import com.ernerst.mapotse.javatest.classes.Thabo;

public class SecondActivity extends AppCompatActivity {


    private Pearl objPearl;
    private Thabo objThabo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        objPearl  = (Pearl) intent.getSerializableExtra("Name");

        TextView streetName = (TextView) findViewById(R.id.streetName);
        TextView city = (TextView) findViewById(R.id.city);
        TextView country = (TextView) findViewById(R.id.country);
        TextView addressID = (TextView) findViewById(R.id.addressID);



        city.setText(" "+ objPearl.getAddress().getCity());
        streetName.setText(" "+ objPearl.getAddress().getStreetName());
        country.setText(" "+ objPearl.getAddress().getCountry());
        addressID.setText(" " + objPearl.getAddress().getAddressID());




    }
}
