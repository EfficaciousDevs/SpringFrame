package com.SpringCore.BeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Oneplus implements InitializingBean, DisposableBean {
    private String ModelName;
    private double Price;

    public String getModelName() {
        return ModelName;
    }

    public void setModelName(String modelName) {
        ModelName = modelName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }


    @Override
    public String toString(){
        return "Oneplus Model: " + ModelName + " ---> Rs." + Price;
    }

    @Override
    public void afterPropertiesSet() throws Exception { // init() Method
        System.out.println("Buying Oneplus Product");
    }

    @Override
    public void destroy() throws Exception {  // destroy() Method
        System.out.println("Thanks for buying OnePlus Product");
    }
}
