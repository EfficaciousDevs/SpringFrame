package com.SpringCore.ConstructorInjection;

import java.util.List;

public class Person {
    private String pName;
    private int pId;
    private String pCity;
    private Certification cer;
    private List<String> courses;

    public Person(String Name, int Id, String City,Certification cer,List<String> courses ) {
        this.pName = Name;
        this.pId = Id;
        this.pCity = City;
        this.cer = cer;
        this.courses = courses;
    }

    public Person(){}


    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpCity() {
        return pCity;
    }

    public void setpCity(String pCity) {
        this.pCity = pCity;
    }



    @Override
    public String toString() {
        return "Name: " + this.pName + " Pid: " + this.pId + " Pcity: " + this.pCity +
                " Certification Course: " + this.cer +" " +  this.courses;
    }
}
