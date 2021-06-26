package com.SpringCore.Referential;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class refTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ReferentialConfig.xml");
        A a = (A)context.getBean("Aref");

        System.out.println(a.getX());
        System.out.println(a.getB().getY());
        System.out.println("Addition:" + a.sum());
        System.out.println(a);
    }
}
