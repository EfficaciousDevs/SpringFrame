package com.SpringCore.InnerBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBeansTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("InnerBean.xml");

        Employee employee = ctx.getBean("employee",Employee.class);

        System.out.println(employee);
    }

}
