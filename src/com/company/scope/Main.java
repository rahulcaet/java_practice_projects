package com.company.scope;

public class Main {
    public static void main(String[] args) {
        /*
        String varFour = "this is private to main";
        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance varOne :" + scopeInstance.getVarOne());
        System.out.println(varFour);

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        System.out.println("varthree is accessible here: " + innerClass.varThree);
        */
//        scopeInstance.timesTwo();
//        System.out.println("******************************************");
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        innerClass.timesTwo();
//
//        scopeInstance.useInner();
        X x = new X();
        x.x();
    }
}
