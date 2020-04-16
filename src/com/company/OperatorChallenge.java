package com.company;

public class OperatorChallenge {
    public static void main(String[] args) {
        double myVar1 = 20;
        double myVar2 = 80;
        double remainder = (100*(myVar1 + myVar2))%40;
        boolean isRemainderZero = ((int)remainder == 0) ? true : false;
        System.out.println(remainder);
        System.out.println(isRemainderZero);

        if(!isRemainderZero) {
            System.out.println("got remainder as:" + remainder);
        }
        else {
            System.out.println("No Remainder at all!!!");
        }
    }
}
