package com.company.abstractclass;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if ( this.root == null ) {
            this.root = newItem;
            return true;
        } else {
            ListItem currentItem = this.root;
            while ( currentItem != null ) {
                int comparison = currentItem.comparisonTo(newItem);
                if ( comparison < 0 ) {
                    if (currentItem.next() != null ) {
                        currentItem = currentItem.next();
                    } else {
                        /*
                        currentItem.setNext(newItem);
                        newItem.setPrevious(currentItem);*/
                        currentItem.setNext(newItem).setPrevious(currentItem) ; //shortcut
                        return true;
                    }
                } else if ( comparison > 0 ) {
                    if ( currentItem.previous() != null ) {
                        /*
                        currentItem.previous().setNext(newItem);
                        newItem.setPrevious(currentItem.previous());
                        */
                        //clubbing 2 lines
                        currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                        /*
                        newItem.setNext(currentItem);
                        currentItem.setPrevious(newItem);
                        */
                        //clubbing 2 lines
                        newItem.setNext(currentItem).setPrevious(newItem);
                    } else {
                        /*
                        currentItem.setPrevious(newItem);
                        newItem.setNext(currentItem);
                         */
                        //clubbing 2 lines
                        currentItem.setPrevious(newItem).setNext(currentItem);
                        newItem.setPrevious(null);
                        this.root = newItem;
                    }
                    return true;
                } else {
                    System.out.println(newItem.getValue() + " is already present ");
                    return false;
                }
            }
            return false;
        }
    }

    @Override
    public boolean removeItem(ListItem item) {
       if( item != null ) {
           System.out.println( "deleting item: " + item.getValue());

           ListItem currentItem = this.root;
           while( currentItem != null ) {
               int comparison = currentItem.comparisonTo(item);
               if( comparison == 0 ) {
                   if( currentItem == this.root) {
                       this.root = currentItem.next();
                   } else {
                       currentItem.previous().setNext(currentItem.next());
                       if(currentItem.next() != null ) {
                           currentItem.next().setPrevious(currentItem.previous());
                       }
                   }
                   return true;
               } else if ( comparison < 0 ) {
                   currentItem = currentItem.next();
               } else {
                   return false;
               }
           }
       }
       return false;
    }

    @Override
    public void traverse(ListItem root) {
        if( root == null ) {
            System.out.println("The list is empty.");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
