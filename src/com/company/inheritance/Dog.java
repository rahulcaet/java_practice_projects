package com.company.inheritance;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size,
               int weight, int eyes, int legs, int tail,
               int teeth, String coat) {
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        this.chew(); // chew() will be called without this as well
        super.eat();
    }

    private void chew() {
        System.out.println("Dog.chew is called");
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(12);
    }
    public void run() {
        System.out.println("Dog.run() called");
        move(24);
    }

    private void movelegs(int speed) {
        System.out.println("Dog.movelegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        movelegs(speed);
        super.move(speed);

    }
}
