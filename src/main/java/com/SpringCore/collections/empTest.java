package com.SpringCore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class empTest {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("collectionConfig.xml");
       Employee emp = (Employee) context.getBean("Employee1");

        System.out.println(emp.getEmpName());
        System.out.println(emp.getEmpAddress());
        System.out.println(emp.getJobSalaries());
        System.out.println(emp.getProp());
    }
}
