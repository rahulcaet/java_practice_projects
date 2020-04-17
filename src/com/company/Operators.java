package com.company;

public class Operators {
    public static void main(String[] args) {
        int myVar = 1+3;
        System.out.println("myVar is: "+myVar); // this is one liner comment
        int previousResult = myVar;
        myVar = myVar -1;
        System.out.println("now myvar is:"+myVar);
        System.out.println("now previous result is:"+ previousResult);
        myVar = myVar*20;
        System.out.println("now myvar is:"+myVar);

        myVar =23/2;
        System.out.println("now myVar is:"+ myVar);

        //myVar =23.2/2;           //error
        myVar = ((int)23.2f)/2;
        System.out.println("now myVar is:"+ myVar);

        myVar = myVar %3;
        System.out.println("now myVar is:"+ myVar);

        //unary operators

        myVar++;
        System.out.println("new value of myVar is:"+myVar);
        myVar--;
        System.out.println("new value of myVar is:"+myVar);

        myVar +=2;
        System.out.println("new value of myVar is:"+myVar);

        myVar *= 10;
        System.out.println("new value of myVar is:"+myVar);

        myVar /= 3;
        System.out.println("new  value of myVar is:"+myVar);

        myVar -= 2;
        System.out.println("new  value of myVar is:"+myVar);

        myVar %= 3;
        System.out.println("new  value of myVar is:"+myVar);

    }
}
