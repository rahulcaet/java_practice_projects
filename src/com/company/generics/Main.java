package com.company.generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        //items.add("Tim");
        items.add(4);
        items.add(5);
        items.add(6);

        printDoubled(items);
        */
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat =  new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

        Team<BaseballPlayer> basketballTeam = new Team<>("Chicago Cups");
        basketballTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("Soccer Champs");
        soccerTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourneTeam = new Team<>("Mellbourne");
        FootballPlayer baichung = new FootballPlayer("Baichung");
        melbourneTeam.addPlayer(baichung);
        Team<FootballPlayer> sunil = new Team<>("Sunil Khetri");
        Team<FootballPlayer> mahesh = new Team<>("Mahesh Sajjan");

        sunil.matchResult(mahesh, 1, 0);
        sunil.matchResult(adelaideCrows, 3, 8);


       //Team<Player> mixTeam = new Team<>("Mixing players");
       //mixTeam.addPlayer(joe);
        System.out.println("Number of players are: " + adelaideCrows.numPlayers());

    }
    private static void  printDoubled( ArrayList<Integer> n ) {
        //for(Object i: n) {
        //for(int i : n) {
        for(Integer i : n) {
            //System.out.println(((Integer)i)*2);
            System.out.println(i*2);
        }
    }
}
