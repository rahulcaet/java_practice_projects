package com.company.accessmodifier;

public class finalStmtClass {
    public final int instanceNumber;
    private static int classCounter = 0;
    private final String name;

    public finalStmtClass(String name) {
        classCounter++;
        this.name = name;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is: "+ instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
