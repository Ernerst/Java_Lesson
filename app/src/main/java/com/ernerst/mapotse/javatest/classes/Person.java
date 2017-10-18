package com.ernerst.mapotse.javatest.classes;

import java.io.Serializable;

/**
 * Created by eKasiLab Alex CDTB on 2017/10/16.
 */

public class Person implements Serializable{

    private  String name, surname, gender,cellNo;
    private int age,idNumber;

    public Person() {

        super();
    }

    public Person(String name, String surname, String gender, String cellNo, int age, int idNumber) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.cellNo = cellNo;
        this.age = age;
        this.idNumber = idNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCellNo() {
        return cellNo;
    }

    public void setCellNo(String cellNo) {
        this.cellNo = cellNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
