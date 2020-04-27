package com.company.abstractclass;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }
    public void fly() {
        super.fly();
        System.out.println("Penguin not good at it, but can swim");
    }
}
