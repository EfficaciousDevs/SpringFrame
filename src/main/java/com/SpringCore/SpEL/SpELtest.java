package com.SpringCore.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpELtest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spELconfig.xml");
        sample s = (sample) context.getBean("spexpL");

        System.out.println(s);
    }
}
