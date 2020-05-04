package com.company.accessmodifier;

public class SIBTest {
    public static final String owner;

    static {
        owner = "Tim";
        System.out.println("SIBTest initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }
    static  {
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println("Some method is called");
    }
}
