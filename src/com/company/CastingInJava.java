package com.company;

public class CastingInJava {

    public static void main(String[] args) {
        byte byteVal = Byte.MIN_VALUE;
        System.out.println("byteVal is : "+ byteVal);
        byte newByteVal = Byte.MIN_VALUE / 2 ;
        System.out.println("newByteVal is: "+ newByteVal);

        //byte anotherNewByteVal = (newByteVal / 2); This throws error as expression result is of integer type

        byte anotherNewByteVal = (byte) (newByteVal/2); //casting converts expression return type to byte

        System.out.println("anotherNewByteVal is:"+anotherNewByteVal);


    }
}
