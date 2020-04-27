package com.company.abstractclass;

public class Main {
    public static void main(String[] args) {
        Dog dog  =  new Dog("Bruno");
        Parrot parrot = new Parrot("Parrot");
        dog.breathe();
        dog.eat();
        parrot.fly();
        parrot.eat();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
