package com.company;
import java.util.Scanner;
public class ArrayListExample {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //int[] myVariable;
        // myVariable = new int[10];  clubbing these 2 lines in 1 single line

        int[] myVariable = new int[10];

        myVariable[5]  = 120;

        System.out.println("myVariable is: " + myVariable[5]);
        double[] myDoubleVariable = new double[10];

        myDoubleVariable[4] = 76.5;
        System.out.println("myDoubleVariable is: " + myDoubleVariable[4]);

        int[] myVar = {4,5,6,7,8,9,10};
        System.out.println( "myVar 1 is: "+ myVar[1]);

        int[] myVar2 = new int[5];
        for(int i=0; i< myVar2.length; i++) {
            myVar2[i] = i*10;
        }
        for(int i=0; i< myVar2.length; i++) {
            System.out.println("Element "+ i + " value is: "+myVar2[i]);
        }

        int[] myVar3 = getIntegers(5);
        for(int i=0; i< myVar3.length; i++) {
            System.out.println("myVar3 is: "+ myVar3[i]);
        }

        System.out.println("Average is: "+ getAverage(myVar3));
    }
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values  = new int[number];

        for(int i=0; i< values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] arr) {
        int sum =0;
        for(int i=0; i< arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum/(double) arr.length;
    }
}
