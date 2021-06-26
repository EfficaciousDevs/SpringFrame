package com.SpringCore.BeanLifeCycle;

public class Apple {
    private String device;
    private double price;

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Apple(String device, double price) {
        this.device = device;
        this.price = price;
    }

    public Apple(){}

    @Override
    public String toString() {
        return "Product: " + device + " --> Rs." + price;
    }

    public void init(){
        System.out.println("Inside init() Method...");
    }
    public void destroy(){
        System.out.println("Inside destroy() Method...");
    }
}
