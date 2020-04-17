package com.company;

public class CalcFeetAndInchesToCentimeters {
    public static void main(String[] args) {
        double centimeters = FeetAndInches(15.5);
        System.out.println("centimeters = " + centimeters);
    }
    public static double FeetAndInches(double feet, double inches) {
        if((feet >= 0) && ( inches >= 0 && inches < 12)) {
           return (12*feet)*2.54 + inches*2.54;
        }
        return -1;
    }
    public static double FeetAndInches(double inches) {
        if ( inches >= 0) {
            double feet =  ((int)inches) / 12;
            System.out.println("feet = "+ feet);
            inches  =  inches - (feet*12);
            System.out.println("inches= "+ inches);
            return FeetAndInches(feet, inches);
        }
        return -1;
    }
}
