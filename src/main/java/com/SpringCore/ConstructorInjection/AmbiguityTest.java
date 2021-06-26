package com.SpringCore.ConstructorInjection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AmbiguityTest {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("AmbiConfig.xml");
        Ambiguity a = (Ambiguity) context.getBean("ambi");
        System.out.println(a);

        context.close();
    }
}
