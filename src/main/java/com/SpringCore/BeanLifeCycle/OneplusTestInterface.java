package com.SpringCore.BeanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OneplusTestInterface {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("OneplusConfig.xml");
        Oneplus oneplus = (Oneplus) context.getBean("onePlus");

        System.out.println(oneplus);

        context.close();
    }
}
