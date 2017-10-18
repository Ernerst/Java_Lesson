package com.ernerst.mapotse.javatest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ernerst.mapotse.javatest.classes.Address;
import com.ernerst.mapotse.javatest.classes.Pearl;
import com.ernerst.mapotse.javatest.classes.Thabo;


public class MainActivity extends AppCompatActivity {


    private Pearl objPearl;
    private Thabo objThabo;
    private Address objAddress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objThabo = new Thabo("Pika", "Vilakazi","male", "07133356879", 0, 9009);


        TextView name  = (TextView) findViewById(R.id.display);
        TextView surname  = (TextView) findViewById(R.id.displaySurname);
        TextView sex  = (TextView) findViewById(R.id.displaySex);
        TextView txtAge  = (TextView) findViewById(R.id.displayAge);
        TextView identity  = (TextView) findViewById(R.id.displayID);
        TextView cellNo  = (TextView) findViewById(R.id.displayCellNo);
        TextView licenseNo  = (TextView) findViewById(R.id.numberPlate);


        int age  = objThabo.getAge();
        int id  = objThabo.getIdNumber();

        name.setText("Name : " + objThabo.getName());
        surname.setText("Surname : " + objThabo.getSurname());
        sex.setText("Gender : " +objThabo.getGender());
        txtAge.setText("Age : "  + age);
        identity.setText("Identity No# : " + id);
        cellNo.setText("Contact No# : " + objThabo.getCellNo());
        licenseNo.setText("Car Registration : " + objThabo.getLicenseNo());

        TextView nameP  = (TextView) findViewById(R.id.displayP);
        TextView surnameP  = (TextView) findViewById(R.id.displaySurnameP);
        TextView sexP  = (TextView) findViewById(R.id.displaySexP);
        TextView txtAgeP  = (TextView) findViewById(R.id.displayAgeP);
        TextView identityP  = (TextView) findViewById(R.id.displayIDP);
        TextView cellNoP  = (TextView) findViewById(R.id.displayCellNoP);
        TextView NumOfWeaves  = (TextView) findViewById(R.id.numberOfWeaves);


        objAddress = new Address();
        //"Madiba Drive","JohannesBurg","South Africa",1
        objAddress.setStreetName("Madiba Drive");
        objAddress.setCity("Johannesburg");
        objAddress.setCountry("South Africa");
        objAddress.setAddressID(1);
        objPearl = new Pearl("Prudence", "Maps", "female","0115135715",22,9506,objAddress);



        int ageP  = objPearl.getAge();
        int idP  = objPearl.getIdNumber();
        nameP.setText("Name : " + objPearl.getName());
        surnameP.setText("Surname : " +  objPearl.getSurname());
        sexP.setText("Gender : " + objPearl.getGender());
        txtAgeP.setText("Age : "  + ageP);
        identityP.setText("Identity No# : " + idP);
        cellNoP.setText( "Contact No# : " + objPearl.getCellNo());
        NumOfWeaves.setText("Number of Weaves : " + objPearl.getNumberOfWeaves());


        Button next = (Button) findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Name", objPearl);
                startActivity(intent);
            }
        });

    }
}
