package com.company.abstractclass;

public class Main {
    public static void main(String[] args) {
        /*
        Dog dog  =  new Dog("Bruno");
        Parrot parrot = new Parrot("Parrot");
        dog.breathe();
        dog.eat();
        parrot.fly();
        parrot.eat();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
        */

        /*
        MyLinkedList list1 = new MyLinkedList(null);
        list1.traverse(list1.getRoot());

        //String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String stringData   = "5 7 3 9 8 2 1 0 4 1 6";

        String[] data = stringData.split(" ");
        System.out.println("data 0 is: " + data[2]);

        for( String s : data) {
            list1.addItem( new Node(s));
        }

        list1.traverse(list1.getRoot());
        list1.removeItem( new Node("3"));
        System.out.println("**********************************");
        list1.traverse(list1.getRoot());

        list1.removeItem( new Node("9"));
        System.out.println("**********************************");
        list1.traverse(list1.getRoot());

        list1.removeItem( new Node("0"));
        System.out.println("**********************************");
        list1.traverse(list1.getRoot());
*/
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());



    }
}
