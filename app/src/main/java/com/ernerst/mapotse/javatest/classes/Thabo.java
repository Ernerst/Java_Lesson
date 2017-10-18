package com.ernerst.mapotse.javatest.classes;

import java.io.Serializable;

/**
 * Created by eKasiLab Alex CDTB on 2017/10/16.
 */

public class    Thabo extends  Person implements Serializable {

    private String licenseNo = "VLY 334 GP";
    private  Address address;


    public Thabo() {

    }

    public Thabo(String name, String surname, String gender, String cellNo, int age, int idNumber) {

        super(name, surname, gender, cellNo, age, idNumber);
    }
    public Thabo(String licenseNo, Address address) {
        this.licenseNo = licenseNo;
        this.address = address;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
