package com.company;

public class PrimitiveDecimalNum {
    public static void main(String[] args)  {
        float minLimitFloat = Float.MIN_VALUE;
        float maxLimitFloat = Float.MAX_VALUE;
        System.out.println("float minimum value is:"+minLimitFloat);
        System.out.println("float maximum value is:"+maxLimitFloat);

        double minLimitDouble = Double.MIN_VALUE;
        double maxLimitDouble = Double.MAX_VALUE;
        System.out.println("Double minimum value is:"+minLimitDouble);
        System.out.println("Double maximum value is:"+maxLimitDouble);

        int myIntVal = 5;
        float myFloatVal = 5.25f; //default data type  for decimal number is double
        //another way to do the same
        //float myFloatVal = (float) 5.25;
        double myDoubleFloatVal = 5.25d; //or  only 5.25 implies 5.25d

        int intVal = 5;
        float floatVal = 5;
        double doubleVal = 5;
        System.out.println("integer value is: "+ intVal);
        System.out.println("float value is: " + floatVal);
        System.out.println("double value is: " + doubleVal);

        int  divIntVal      = 5/2;
        float divFloatVal   = 5f/2;
        double divDoubleVal = 5d/2;
        System.out.println("integer value is:" + divIntVal);
        System.out.println("float value is: " + divFloatVal);
        System.out.println("double value is: " + divDoubleVal);

        int  div2IntVal      = 5/3;
        float div2FloatVal   = 5f/3;
        double div2DoubleVal = 5d/3;
        double divDVal       = 5.0/3;
        System.out.println("integer value is:" + div2IntVal);
        System.out.println("float value is: " + div2FloatVal);
        System.out.println("double value is: " + div2DoubleVal); // more better precision over here
        System.out.println("another double val is:"+ divDVal); //double are faster to process compared to float


    }
}
