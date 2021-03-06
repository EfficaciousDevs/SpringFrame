package com.SpringCore.Referential;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
        // Creating the first customer object and updating the city
        Customer custObj1=(Customer)ctx.getBean("custObj");
        custObj1.getAddress().setCity("Greenville");
        System.out.println("Customer City of first Customer: "+custObj1.getAddress().getCity());

        // Creating the Second customer object
        Customer custObj2=(Customer)ctx.getBean("custObj");
        System.out.println("Default customer City of second Customer: "+custObj2.getAddress().getCity());

    }

}

