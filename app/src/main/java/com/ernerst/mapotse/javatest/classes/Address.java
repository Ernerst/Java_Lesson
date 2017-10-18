package com.ernerst.mapotse.javatest.classes;

import java.io.Serializable;

/**
 * Created by eKasiLab Alex CDTB on 2017/10/18.
 */

public class Address implements Serializable {

    private  String streetName,city,country;
    private int addressID;


    public Address() {

    }

    public Address(String streetName, String city, String country, int addressID) {
        this.streetName = streetName;
        this.city = city;
        this.country = country;
        this.addressID = addressID;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }
}
