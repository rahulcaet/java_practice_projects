package com.company;

public class StringNonPrimitive {
    public static void main(String[] args) {
        String myString= "this is my string";
        System.out.println(myString);
        myString = myString + ". This is more.";
        System.out.println("myString is:"+myString);
        myString = myString + "\u00A9 2019";
        System.out.println("myString is:"+myString);
        String numberString = "250.55";
        numberString = numberString + "49.567";
        System.out.println(numberString);
        String LastString = "10";
        int myInt = 50;
        LastString = myInt + LastString;
        System.out.println("LastString is equal to "+ LastString);
        double doubleNumber = 120.47d;
        LastString = doubleNumber + LastString;
        System.out.println("LastString is equal to "+ LastString);
    }
}
