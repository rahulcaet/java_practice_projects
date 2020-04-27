package com.company.abstractclass;

public class Bird extends Animal implements  CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathing....");

    }

    // public abstract void fly();  implementing CanFly interface.


    @Override
    public void fly() {
        System.out.println(this.getName() + " is flapping its wings.");
    }
}
