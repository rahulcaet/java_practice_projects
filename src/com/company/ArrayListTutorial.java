package com.company;
import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;
import java.util.ArrayList;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Scanner;

public class ArrayListTutorial {
    private static Scanner s = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit= false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    //removeItem();
                    break;
                case 5:
                    //searchForItem();
                    break;
                case 6:
                    quit=true;
                    break;
            }
        }

    }
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item to the list.");
        System.out.println("\t 4 - To remove an item to the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit.");

    }

    public static void addItem() {
        System.out.println("Please add the grocery item:");
        groceryList.addGroceryItem(s.nextLine());
    }
    public static void modifyItem() {
        System.out.println("Enter item number: ");
        int itemNo = s.nextInt();
        s.nextLine();
        System.out.println("Enter replacement  item: ");
        String newItem = s.nextLine();
        groceryList.modifyGroceryItem(itemNo-1, newItem);
    }
    public static void processArrayList() {
        ArrayList<String> newArray = new  ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
        //Another way of doing it
        ArrayList<String> newAr2 = new ArrayList<String>(groceryList.getGroceryList());

        //to convert an ArrayList into regular array
        String[] regularArray = new String[groceryList.getGroceryList().size()];
        regularArray = groceryList.getGroceryList().toArray(regularArray);
    }
}
