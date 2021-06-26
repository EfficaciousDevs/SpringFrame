package com.SpringCore.ConstructorInjection;

public class Certification {
    private String course;
    public Certification(String course){
        super();
        this.course = course;
    }

    @Override
    public String toString() {
        return this.course;
    }
}
