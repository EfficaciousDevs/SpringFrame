package com.SpringCore.AspectOP.Service;

public class PaymentServiceImpl implements PaymentService {
    public void Payment(int Amount){
        System.out.println("Rs." + Amount + " Debited...");
    }
}
