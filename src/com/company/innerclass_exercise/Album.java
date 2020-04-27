package com.company.innerclass_exercise;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private SongList songList;

    public Album(String name) {
        this.name  = name;
        this.songList = new SongList();
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public ArrayList<Song> getSongs() {
            return songs;
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
            for (Song checkSong : this.songs) {
                if (checkSong.getTitle().equals(title)) {
                    return checkSong;
                }
            }
            return null;
        }

        public boolean addSong(String title, double duration) {
            if (findSong(title) == null) {
                this.songs.add(new Song(title, duration));
                return true;
            }
            return false;
        }

    }
    public boolean addSongToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if( (index >=0 ) && index < this.songList.getSongs().size()) {
            playList.add(this.songList.getSongs().get(index));
            return true;
        }
        System.out.println( "The tracknumber " + trackNumber + " Not available");
        return false;
    }

    public boolean addSongToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = this.songList.findSong(title);
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

    public boolean addSong(String title, double duration) {
        return this.songList.addSong( title, duration);
    }

    public ArrayList<Song> getSongs() {
        return this.songList.getSongs();
    }
}
