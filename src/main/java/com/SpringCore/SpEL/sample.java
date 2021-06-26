package com.SpringCore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spexpL")
public class sample {

//    @Value("#{T(java.lang.Integer).MIN_VALUE}")
    @Value("#{new Integer(69)}")
//    @Value("#{36+64}")
    private int id;

//    @Value("Akshay")
//    @Value("#{'Akshay Kumar'.toUpperCase()}")
    @Value("#{new java.lang.String('Shahrukh Khan')}")
    private String Name;

    @Value("#{4<5?True:False}")
    private boolean active;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "sample{" +
                "id=" + id +
                ", Name='" + Name + '\'' +" Active: "+ active+
                " }";
    }
}
