package com.SpringCore.Stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("stereos")
@Scope("prototype")
public class A {
    @Value("25")
    private int id;

    @Value("Akshay Kumar")
    private String name;

    @Value("#{Lnames}")
    private List<String> gadgets;

    @Autowired
    private B b;

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public A(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public A(){}

    @Override
    public String toString(){
        return "NAme: " + name + " & id : " + id + " " + gadgets + " " + b;
    }
}
