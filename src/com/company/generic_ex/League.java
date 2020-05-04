package com.company.generic_ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team>  {
    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if ( teams.contains(team)) {
            System.out.println( team.getName() + " is already part  of league");
            return false;
        }
        teams.add(team);
        return true;
    }

    public int getSize() {
        return this.teams.size();
    }

    public void showLeagueTable() {
        Collections.sort(teams);

        for(Team t: teams) {
            System.out.println(this.getName() + " League has team: " + t.getName());
        }

    }

}
