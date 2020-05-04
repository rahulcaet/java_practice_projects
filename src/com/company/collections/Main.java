package com.company.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("PVR", 8, 12);

        /*
        theatre.getSeats();
        if( theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken.");
        }

        if( theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken.");
        }
        */
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        //List<Theatre.Seat> deepcopyList = new ArrayList<>(theatre.seats.size());
        //Collections.copy(deepcopyList, theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if( theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        //Collections.reverse(seatCopy);
        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("Now printing original theatre.seats");

        printList(theatre.seats);

        sortList(seatCopy);
        printList(seatCopy);
        //Theatre.Seat minSeat = Collections.min(seatCopy);
        //Theatre.Seat maxSeat = Collections.max(seatCopy);
        //System.out.println("Minimum seat number is: " + minSeat.getSeatNumber());
        //System.out.println("Maximum seat number is: " + maxSeat.getSeatNumber());


    }

    public static void printList(List<Theatre.Seat> list) {
        for( Theatre.Seat seat : list ) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=========================================================");
    }

    public static void sortList(List<? extends Theatre.Seat> list) {
        System.out.println("GOING TO GET SORT LIST...");
        for(int i=0; i < list.size() - 1; i++ ) {
            for( int j= i+1; j < list.size(); j++) {
                if(list.get(i).compareTo(list.get(j)) > 0 ) {
                    Collections.swap(list, i, j);;
                }
            }
        }
    }
}
