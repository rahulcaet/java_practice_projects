package com.company;

public class PrimitiveDataType {
    public static void main(String[] args) {
        int myVar = 100;
        int minLimit = Integer.MIN_VALUE;
        int maxLimit = Integer.MAX_VALUE;
        System.out.println("min limit of Integer is:"+ minLimit);
        System.out.println("max limipackage com.company;

public class PrimitiveWholeNumDataType {
    public static void main(String[] args) {
        int myVar = 100;
        int minLimit = Integer.MIN_VALUE;
        int maxLimit = Integer.MAX_VALUE;
        System.out.println("min limit of Integer is:"+ minLimit);
        System.out.println("max limit of Integer is:"+ maxLimit);
        System.out.println("busted maximum value:"+ (maxLimit+1)); //overflow, will get some garbage value
        System.out.println("busted minimum value:"+ (minLimit-1)); //underflow, will get some garbage value

        byte minLimitByte = Byte.MIN_VALUE;
        byte maxLimitByte = Byte.MAX_VALUE;
        System.out.println("min limit of Byte is:"+ minLimitByte);
        System.out.println("max limit of Byte is:"+ maxLimitByte);

        short minLimitShort = Short.MIN_VALUE;
        short maxLimitShort = Short.MAX_VALUE;
        System.out.println("min limit of Short is:"+ minLimitShort);
        System.out.println("max limit of Short is:"+ maxLimitShort);

        long longVar = 100L;
        long minLimitLong = Long.MIN_VALUE;
        long maxLimitLong = Long.MAX_VALUE;
        System.out.println("min limit of Long is:"+ minLimitLong);
        System.out.println("max limit of Long is:"+ maxLimitLong);

        long bigLongVal = 2147483647234L;
        System.out.println("Without L, It will print an error");


    }
}
t of Integer is:"+ maxLimit);
        System.out.println("busted maximum value:"+ (maxLimit+1)); //overflow, will get some garbage value
        System.out.println("busted minimum value:"+ (minLimit-1)); //underflow, will get some garbage value

    }
}
