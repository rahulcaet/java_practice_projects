package com.company;

public class WhileLooping {
    public static void  main(String[] args) {
        int count = 1;
        while(count !=5) {
            System.out.println("Count value is: " + count);
            count++;
        }

        count=1;
        while(true) {
            if(count ==6 ) {
                break;
            }
            System.out.println("count is: " + count);
            count++;
        }

        count = 5;
        while(count !=5) { // this block will never be executed since 5!=5 condition becomes false
            System.out.println("NEW Count value is: " + count);
            count++;
        }
    }
}
