package com.SpringCore.ConstructorInjection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class personTest {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("constConfig.xml");
        Person p1 = (Person) context.getBean("person1");
//        Person p2 = (Person) context.getBean("person2");

        System.out.println(p1);
//        System.out.println(p2);

        context.close();
    }
}
