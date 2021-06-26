package com.SpringCore.BeanLifeCycle;

import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Sony {
    private String product;
    private double price;

    @Required
    public String getProduct() {
        return product;
    }

    @Required
    public void setProduct(String product) {
        this.product = product;
    }

    @Required
    public double getPrice() {
        return price;
    }

    @Required
    public void setPrice(double price) {
        this.price = price;
    }

    public Sony(String product, double price) {
        this.product = product;
        this.price = price;
    }
    public Sony(){}

    @Override
    public String toString(){
        return "Product Name: " + product + " ~ " + price;
    }

    @PostConstruct
    public void initialize(){
        System.out.println("Buying from Sony Outlet...");
    }

    @PreDestroy
    public void destruction(){
        System.out.println("Payment Done...");
    }
}
