package com.SpringCore.AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    @Autowired
    private int empId;
    private String empName;
    private Passport passObj;

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public Passport getPassObj() {
        return passObj;
    }
    public void setPassObj(Passport passObj) {
        this.passObj = passObj;
    }

}