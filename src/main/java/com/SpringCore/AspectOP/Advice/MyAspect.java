package com.SpringCore.AspectOP.Advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("execution(* com.SpringCore.AspectOP.Service.PaymentServiceImpl.Payment(..))")
    public void printBefore(){
        System.out.println("Authentication done..");
    }

    @After("execution(* com.SpringCore.AspectOP.Service.PaymentServiceImpl.Payment(..))")
    public void printAfter(){
        System.out.println("Transaction Complete...");
    }
}
