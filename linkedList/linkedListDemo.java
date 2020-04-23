package com.company.linkedList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Cannbera");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);
        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

    }
    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("now visiting: "+ i.next());
        }
        System.out.println("*******************************************");
    }

    private static boolean addInOrder(LinkedList linkedList, String newCity) {
        ListIterator<String> s = linkedList.listIterator();
        s.next();
        while(s.hasNext()) {
            int comparison = s.next().compareTo(newCity);
            if(comparison == 0) {
                System.out.println(newCity + " is already added to the destination.");
                return false;
            } else if(comparison > 0) {
                //new city to be added before this one
                s.previous();
                s.add(newCity);
                return true;
            } else {

            }
        }
        s.add(newCity);
        return true;
    }

}
