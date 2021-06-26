package com.SpringCore.ConstructorInjection;

public class Ambiguity {
    private final int num1;
    private final int num2;

    public Ambiguity(int x,int y){
        System.out.println("Constructor with arg- int,int...");
        this.num1 = x;
        this.num2 = y;
        System.out.println(num1+num2);
    }

    public Ambiguity(double x,double y){
        System.out.println("Constructor with arg- double,double...");
        this.num1 = (int)x;
        this.num2 = (int)y;
        System.out.println(num1+num2);
    }

    public Ambiguity(String x,String y){
        System.out.println("Constructor with arg- int,int...");
        this.num1 = Integer.parseInt(x);
        this.num2 = Integer.parseInt(y);
        System.out.println(num1+num2);
    }

    @Override
    public String toString() {
        return "First Number:" + this.num1 + " & " + "Second Number:" + this.num2;
    }
}
