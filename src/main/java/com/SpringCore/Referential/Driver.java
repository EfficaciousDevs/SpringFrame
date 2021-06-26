package com.SpringCore.Referential;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fiatMoney = sc.next();

        ApplicationContext context = new ClassPathXmlApplicationContext("CurrencyConfig.xml");
        CurrencyConverter cc = (CurrencyConverter) context.getBean("CurrConv");

        System.out.println(cc.getTotalCurrencyValue(fiatMoney));
    }
}
