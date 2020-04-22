package com.company;
import java.util.Scanner;

public class MinElementChallenge {
    public static void main(String[] args) {
        int[] arr = Element.readIntegers(5);
        int minElement = Element.findMin(arr);
        System.out.println("Minimum element is: " + minElement);
    }
}

class Element {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int n) {
        int[] values = new int[5];
        System.out.println("Enter " + n + " elements of array");
        for(int i=0; i<n; i++) {
            values[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return values;
    }
    public static int findMin(int[] arr) {
        int minElement = arr[0];
        for(int i=0; i< arr.length; i++) {
            if(arr[i] < minElement) {
                minElement = arr[i];
            }
        }
        return minElement;
    }
}
