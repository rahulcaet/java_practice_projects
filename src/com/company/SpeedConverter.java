package com.company;
import java.lang.Math;

public class SpeedConverter {
    public static void main(String[] args) {
        double kmsPerHour = -1;
        printConversion(kmsPerHour);
    }

    public static long tomilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour > 0) {
            return Math.round(0.621371 * kilometersPerHour);
        }
        return -1;
    }
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour > 0 ) {
            long milesPerHour = tomilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h.");
        } else {
            System.out.println("Invalid Value");
        }

    }
}
