package com.SpringCore.StandaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("StandaloneConfig.xml");
        ProductList productList = ctx.getBean("prodList",ProductList.class);
        System.out.println(productList.getProducts());
    }
}
