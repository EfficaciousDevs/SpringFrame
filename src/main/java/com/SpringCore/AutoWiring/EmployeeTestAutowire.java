package com.SpringCore.AutoWiring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTestAutowire {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("AutowiringConfig.xml");
        Employee employee = context.getBean("emp",Employee.class);
        System.out.println(employee);

        context.close();
    }
}
