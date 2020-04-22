package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList  = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in the list");
        for(int i=0; i < groceryList.size() ; i++) {
            System.out.println((i+1) + " ," + groceryList.get(i));
        }
    }
    public void modifyGroceryItem(String newItem) {
        int position = groceryList.indexOf(newItem);
        if(position>=0 ) {
            modifyGroceryItem(position, newItem);
        }

    }
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("grocery item : " + (position+1) + " has been modified.");
    }
    public void removeGroceryItem(String item) {
        int position = groceryList.indexOf(item);
        if(position>=0) {
            removeGroceryItem(position);
        }
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);

    }
    public String findItem(String searchItem) {
        //boolean exists = groceryList.contains(searchItem);
        int position  = groceryList.indexOf(searchItem);
        if( position != -1 ) {
            return groceryList.get(position);
        }
        return null;
    }
}
