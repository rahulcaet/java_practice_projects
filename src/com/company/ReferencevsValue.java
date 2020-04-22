package com.company;

import java.util.Arrays;

public class ReferencevsValue {
    public static void main(String[] args) {
        int myIntVal = 10;
        int anotherValue = myIntVal;
        System.out.println("myIntVal="+ myIntVal);
        System.out.println("anotherValue="+anotherValue);
        
        anotherValue++;
        System.out.println("myIntVal="+ myIntVal);
        System.out.println("anotherValue="+anotherValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        System.out.println("myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray=" + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray=" + Arrays.toString(anotherArray));

        anotherArray = new int[] {4,5,6,7,8,9};
        modifyArray(myIntArray);

        System.out.println("myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray=" + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array ) {
        array[1] = 2;
        array = new int[] {1,3,5,7,9};

    }

}
