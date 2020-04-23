package com.company;
import java.util.ArrayList;

class IntClass {
    private int val;

    public IntClass(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
public class autoboxingTutorial {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray    = new int[10];

        ArrayList<String> strArrList = new ArrayList<String>();
        strArrList.add("Tim");

        //ArrayList<int> intArrList = new ArrayList<int>(); primitive data type, so not working

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer intVal = new Integer(54);
        Double doubleVal = new Double(24.5);

        ArrayList<Integer> intArayList = new ArrayList<Integer>();

        for(int i=0; i< 10; i++) {
            intArayList.add(Integer.valueOf(i));
        }

        for(int i=0; i<10; i++) {
            System.out.println("value is :"+ intArayList.get(i).intValue());
        }

        Integer intVal2 = 56; //implied  to Integer.valueOf(56)

        int intVal3 = intVal2;   //implied to intVal2.intValue()

        ArrayList<Double> doubleValues = new ArrayList<Double>();

        for(double dbl=0.0; dbl <= 10.0; dbl += 0.5) {
            //doubleValues.add(Double.valueOf(dbl));
            doubleValues.add(dbl); //shortcut
        }

        for(int i=0; i< doubleValues.size(); i++) {
            //System.out.println("double value is: " + doubleValues.get(i).doubleValue());
            System.out.println("double value is: " + doubleValues.get(i)); //shortcut
        }


    }
}
