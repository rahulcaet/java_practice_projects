package com.company;

public class PrimitiveTypeChallenge {
    public static void main(String[] args) {
        byte  byteVar  = 127;
        short shortVar = 32767;
        int   intVar   = 78932;
        long longVar   = 50000L + 10L*(byteVar+shortVar+intVar);
        System.out.println("longVar is:" + longVar);
        short shortTotal = (short) (50000 + 10*(byteVar+shortVar+intVar));
        System.out.println("shortTotal is:" + shortTotal);
    }
}
