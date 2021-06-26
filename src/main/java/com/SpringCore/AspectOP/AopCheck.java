package com.SpringCore.AspectOP;

import com.SpringCore.AspectOP.Service.PaymentService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopCheck {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("AopConfig.xml");
        PaymentService pay = context.getBean("payment",PaymentService.class);

        System.out.println("Testing Aspect Oriented Programming");
        pay.Payment(25000);

        context.close();
    }
}
