package com.company.innerclass_exercise;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class linkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Cannbera");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Cannbera");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");


        printList(placesToVisit);
        //placesToVisit.add(1, "Alice Springs");
        addInOrder(placesToVisit, "Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

        System.out.println("****************************************8");

        System.out.println("*******************************************");
        visit(placesToVisit);

    }
    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("now visiting: "+ i.next());
        }
    }

    private static boolean addInOrder(LinkedList linkedList, String newCity) {
        ListIterator<String> s = linkedList.listIterator();
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

    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if( cities.isEmpty() ) {
            System.out.println("No cities in itenary to visit");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(! quit ) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch( action ) {
                case 0:
                    System.out.println("Holiday (Vacation) is over");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if( listIterator.hasNext()) {
                        System.out.println("Now visiting... " + listIterator.next());
                    } else {
                        System.out.println("Reached to the end of the list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if( goingForward ) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting... " + listIterator.previous());
                    } else {
                        System.out.println("Reached to the start of the list");
                        goingForward = true;
                    }
                    break;

                case 3:

                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \npress ");
        System.out.println("0 - to quit\n" +
                           "1 - go to next city\n" +
                           "2 - go to previous city\n" +
                           "3 - print menu options");
    }

}
