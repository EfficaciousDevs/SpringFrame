package com.SpringCore.BeanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppleTestXML {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("AppleConfig.xml");
        Apple apple = (Apple) context.getBean("apple1");

        System.out.println(apple);

        context.registerShutdownHook(); // invoking destroy() Method

    }
}
