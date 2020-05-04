package com.company.scope;

public class ScopeCheck {
    public int publicVar =0 ;
    private int varOne =  1;

    public ScopeCheck() {
        System.out.println("publicVar  is: " + publicVar + " privateVar is: " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2;
        for(int i=0; i<10; i++) {
            System.out.println(i + " times two is: " + i*this.varOne);
        }
       // System.out.println("Value of  i is: " + i);
    }

    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);
    }
    public class InnerClass {
        public int varThree = 3;

        public InnerClass() {
            System.out.println("inner class created, varOne " + varOne + " and varThree is: " + varThree);
        }

        public void timesTwo() {
            System.out.println("varOne is still available : " + varOne);
            //ScopeCheck.this.timesTwo();
            //int privateVar = 2;
            for(int i=0; i<10; i++) {
                System.out.println(i + " times two is: " + i* varThree);
            }
        }

    }

}
