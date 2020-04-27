package com.company.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name  = name;
        this.songs = new ArrayList<Song>();
    }

    private Song findSong(String title) {
        /* for loop of doing the thing
        for(int i=0; i < this.songs.size(); i++) {
            if ( this.songs.get(i).getTitle().equals(title)) {
                return this.songs.get(i);
            }
        }
        */
        //foreach loop
        for(Song checkSong: this.songs) {
            if( checkSong.getTitle().equals(title)) {
                return checkSong;
            }
        }
        return null;
    }

    public boolean addSong(String title, double duration ) {
        if(findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public boolean addSongToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if( (index >=0 ) && index < this.songs.size()) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println( "The tracknumber " + trackNumber + " Not available");
        return false;
    }

    public boolean addSongToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if ( checkedSong != null ) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("Song with title "+ title + " not available in playlist.");
        return false;
    }
    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}
