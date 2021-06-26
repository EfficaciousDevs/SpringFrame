package com.SpringCore.BeanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SonyTestAnnotation {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("SonyConfig.xml");
        Sony sony = (Sony) context.getBean("sonyDevice");

        System.out.println(sony);

        context.registerShutdownHook();
    }
}
