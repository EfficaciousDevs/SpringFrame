package com.SpringCore.InterfaceInjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("InterfaceConfig.xml");
        OrderDaoImpl order = ctx.getBean("order",OrderDaoImpl.class);

        order.PlaceOrder();
    }



}
