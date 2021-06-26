package com.SpringCore.AutoWiring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        Person person = context.getBean(Person.class);

        System.out.println("EmpID : " + person.getEmpId());
        System.out.println("EmpName : " + person.getEmpName());
        System.out.println(person.getPassObj().toString());

        context.close();
    }
}
