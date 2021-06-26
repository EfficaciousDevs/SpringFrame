package com.SpringCore.InterfaceInjections;

import org.springframework.stereotype.Component;

@Component
public class CreateDaoImpl implements CreateDao{
    @Override
    public void createOrder() {
        System.out.println("Creating Orders....");
    }
}
