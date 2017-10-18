package com.ernerst.mapotse.javatest.classes;

import java.io.Serializable;

/**
 * Created by eKasiLab Alex CDTB on 2017/10/16.
 */

public class Pearl extends  Person implements Serializable {

    private int numberOfWeaves = 12;
    private  Address address;

    public Pearl(String name, String surname, String gender, String cellNo, int age, int idNumber,Address address) {

        super(name, surname, gender, cellNo, age, idNumber);
        this.address = address;
    }

    public Pearl(int numberOfWeaves, Address address) {
        this.numberOfWeaves = numberOfWeaves;
        this.address = address;
    }

    public int getNumberOfWeaves() {
        return numberOfWeaves;
    }

    public void setNumberOfWeaves(int numberOfWeaves) {
        this.numberOfWeaves = numberOfWeaves;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
