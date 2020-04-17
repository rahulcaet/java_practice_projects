package com.company;

public class Ifthenstmt {
    public static void main(String[] args) {
        boolean myVar = false;
        if (myVar == true) {
            System.out.println("condition is true");
            System.out.println("condition is not false");
        }
        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the highest score!!!");
        }
        if (topScore != 100) {
            System.out.println("you didn't get the highest score");
        }

        if (topScore > 100) {
            System.out.println("greater than 100");
        }
        if (topScore >= 100) {
            System.out.println("greater than or equal to 100");
        }

        topScore = 80;
        if (topScore < 100) {
            System.out.println("less than 100");
        }
        if (topScore <= 100) {
            System.out.println("less than or equal to 100");
        }
        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("greater than second top score but less than 100");
        }

        if( topScore > 90 || secondTopScore < 90) {
            System.out.println("either of the condition is True");
        }

        int newVal = 50;
        if (newVal == 50) {
            System.out.println("New Value is 50");
        }
        /* throwing error as equal to operator is not used, instead assigment operator is used in condition
        if (newVal = 50) {
            System.out.println("New Value is 50");
        }
        */
         boolean isCar = false;
         if (isCar = true) {  //this doesn't throw error as isCar after getting assigned to True; returns True
             System.out.println("this is not supposed to happen");
         }

         if (isCar)  {
             System.out.println("isCar set to True");
        }
        if(!isCar) {
            System.out.println("isCar not set to True");
        }

        boolean gameOver = true;
        int score = 1200;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Score is  less than 5000");
//        } else if (score < 1000) {
//            System.out.println("Score is  less than 1000");
//        } else {
//            System.out.println("Got here!!!");
//        }



    }
}
