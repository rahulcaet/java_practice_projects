package com.company;

public class ternaryOperator {
    public static void main(String[] args) {
        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            System.out.println("isCar was set to true");
        }

        int ageOfClient = 20;
        boolean isEighteenOver = ageOfClient == 20 ? true : false;
        System.out.println("isEighteenOver equal to 20? "+ isEighteenOver);
    }
}
