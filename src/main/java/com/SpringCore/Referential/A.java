package com.SpringCore.Referential;

public class A {
    private int x;
    private B b;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A {" + " x = " + x + ", b = " + b + '}';
    }

    public A(){
        super();
    }

    public int sum(){
        return this.x + this.getB().getY();
    }
}
