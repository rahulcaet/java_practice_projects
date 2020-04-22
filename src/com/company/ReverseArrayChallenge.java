package com.company;
import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,-12, 78};
        reverse(arr);
    }

    private static void reverse(int[] arr) {
        int[] reversedArray = Arrays.copyOf(arr, arr.length);
        int lastIndex = arr.length - 1;
        for(int i =0 ; i <= (int) (lastIndex /2); i++) {
            int temp = reversedArray[i] ;
            reversedArray[i] = reversedArray[lastIndex - i];
            reversedArray[lastIndex -i] = temp;
        }
        System.out.println("original array is: "+ Arrays.toString(arr));
        System.out.println("reversed array is: "+ Arrays.toString(reversedArray));
    }
}
