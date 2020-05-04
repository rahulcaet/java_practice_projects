package com.company.generic_ex;

public abstract class Team  implements Comparable<Team> {
    private String name;
    int played =0 ;
    int won  = 0;
    int lost  = 0 ;
    int tied = 0;
    private int rank = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void ranking(int played, int won, int lost, int tied) {
        this.rank =  (won * 2) + tied;
    }

    public int ranking() {
        return this.rank;
    }

    public int compareTo(Team team) {
        if ( this.ranking() > team.ranking()) {
            return -1 ;
        } else if( this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }

}
