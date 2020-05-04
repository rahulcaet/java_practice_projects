package com.company.generic_ex;

import java.util.IllegalFormatCodePointException;

public class Main {
    public static void main(String[] args) {
        CricketTeam india = new CricketTeam("India");
        india.ranking(3,1, 2, 0);

        CricketTeam westindies = new CricketTeam("West Indies");
        westindies.ranking(3, 3, 0, 0);

        CricketTeam sriLanka = new CricketTeam("Sri Lanka");
        sriLanka.ranking(3,2, 1, 0);

        FootballTeam germany = new FootballTeam("Germany");
        FootballTeam brazil  = new FootballTeam("Brazil");
        FootballTeam uruguve = new FootballTeam("Uruguve");

        HockeyTeam pakistan = new HockeyTeam("Pakistan");
        HockeyTeam belgium  = new HockeyTeam("Belgium");

        League<CricketTeam> league_cricket  = new League<>("Cricket League");
        League<FootballTeam> league_football = new League<>("Football League");
        League<HockeyTeam> league_hockey     = new League<>("Hockey League");

        league_cricket.addTeam(india);
        league_cricket.addTeam(sriLanka);
        league_cricket.addTeam(westindies);

        league_football.addTeam(germany);
        league_football.addTeam(brazil);
        league_football.addTeam(uruguve);

        league_hockey.addTeam(pakistan);
        league_hockey.addTeam(belgium);

        System.out.println("Size of  cricket team is: " + league_cricket.getSize());

        league_cricket.showLeagueTable();
    }
}
