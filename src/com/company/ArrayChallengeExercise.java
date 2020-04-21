package com.company;
import  java.util.Scanner;
import java.util.Arrays;

public class ArrayChallengeExercise {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntVar = getIntegers(5);
        printArray(myIntVar);

        int[] sortedArr = sortIntegers(myIntVar);
        System.out.println("Printing sorted Array ");
        printArray(sortedArr);
    }
    public static int[] sortIntegers(int[] myArr) {
        int[] sortedArr  = new int[myArr.length];
        for (int i=0; i< myArr.length; i++) {
            sortedArr[i] = myArr[i];
        }

        for (int i=0; i< myArr.length-1; i++) {
            for(int j=i+1; j< myArr.length; j++) {
                if(sortedArr[i] < sortedArr[j]) {
                    int temp = sortedArr[i];
                    sortedArr[i] = sortedArr[j];
                    sortedArr[j] = temp;
                }
            }
        }

        return sortedArr;


    }
    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.println("Element at position: " + (i+1) + " " + arr[i] + "\n");
        }
    }
    public static int[] getIntegers(int length) {
        int[] values = new int[length];
        System.out.println("Enter total " + length + " integers ");
        for(int i=0; i<length; i++) {
            values[i] = scanner.nextInt();
        }
        scanner.close();
        return values;

    }

}
