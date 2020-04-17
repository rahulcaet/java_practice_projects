package com.company;

public class DoWhileLooping {
    public static void main(String[] args) {
        int count =6; // will print the loop only once.
        do {
            System.out.println("count is: "+ count);

        } while(count !=6);

        /*
        count =6; // will print the loop infinite times as the condition never becomes True.
        do {
            System.out.println("count is: "+ count);
            count++;
        } while(count !=6);
        */

        count =1; // will print the loop from 1 to 5.
        do {
            System.out.println("count is: "+ count);
            count++;
        } while(count !=6);

        count =6; // will print the loop infinite times as the condition never becomes True.
        do {
            System.out.println("count is: "+ count);
            count++;
            if( count > 100) {
                break;
            }
        } while(count !=6);

        getEvenNumbersWithinARange(4, 20);
    }
    public static boolean isEvenNumber(int num) {
        if ( num % 2 == 0 ) {
            return true;
        }
        return false;
    }

    public static void getEvenNumbersWithinARange( int lowerLimit, int upperLimit ) {
        int totalEvenNumbersFound = 0;
        while(lowerLimit <= upperLimit) {
            lowerLimit++;
            if ( ! isEvenNumber(lowerLimit)) {
                continue;
            }
            totalEvenNumbersFound++;
            System.out.println("Number " + lowerLimit + " is an even number.");

            if (totalEvenNumbersFound >= 5) {
                break;
            }



        }
        System.out.println("Total Even numbers found are: " + totalEvenNumbersFound);
    }
}
