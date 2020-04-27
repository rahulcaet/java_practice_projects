package com.company.abstractclass;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating.");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }
}
