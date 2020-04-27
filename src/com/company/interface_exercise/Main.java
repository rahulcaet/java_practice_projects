package com.company.interface_exercise;

import com.company.interface_exercise.ISaveable;
import com.company.interface_exercise.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());
        saveObject(tim);
        tim.setHitPoints(8);
        System.out.println(tim.toString());
        tim.setWeapon("Gun");
        saveObject(tim);
        //loadObject(tim);
        System.out.println(tim);

        ISaveable rahul = new Monster("Rahul", 15, 16);
        System.out.println(rahul.toString());
        System.out.println("Strength = " + ((Monster)rahul).getStrength());
        saveObject(rahul);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner  = new Scanner(System.in);
        boolean quit = false;
        int  index = 0;
        System.out.println("Choose\n" +
                           "1 to enter a string\n" +
                           "0 to quit");

        while( !quit) {
            System.out.println("Choose an option");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string");
                    String stringInput =scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i=0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }
    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
