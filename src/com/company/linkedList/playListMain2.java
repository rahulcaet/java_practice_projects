package com.company.linkedList;

import java.util.*;

public class playListMain2 {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("DDLJ");
        album.addSong("Ruk jaa O Dil Diwane" , 4.45);
        album.addSong("Tujhe Dekha toh" , 5.05);
        album.addSong("Mehndi laga ke Rakhna" , 6.35);
        albums.add(album);

        album = new Album("Dil");
        album.addSong("Dil Kho Gaya" , 5.45);
        album.addSong("O Priya Priya" , 4.05);
        albums.add(album);
        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addSongToPlayList("Mehndi laga ke Rakhna", playList);
        albums.get(1).addSongToPlayList("Dil Kho Gaya", playList);
        albums.get(0).addSongToPlayList("Tujhe Dekha toh", playList);
        albums.get(0).addSongToPlayList(1, playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList ) {
        Scanner scanner = new Scanner(System.in);
        ListIterator<Song> listIterator = playList.listIterator();
        boolean quit = false;
        boolean forward  =  true;
        if(playList.size() == 0) {
            System.out.println("No Song in playlist");
            return;
        } else {
            System.out.println("Now playing "+ listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("PlayList complete.");
                    quit=true;
                    break;

                case 1:
                    if(! forward) {
                        if( listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward =  true;
                    }
                    if ( listIterator.hasNext() ) {
                        System.out.println("Now Playing -> " + listIterator.next().toString() );
                    } else {
                        System.out.println("We have reached to end of the playlist");
                        forward = true;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if ( listIterator.hasPrevious() ) {
                        System.out.println("Now Playing -> " + listIterator.previous().toString());
                    } else  {
                        System.out.println("We have reached to the start of the playlist");
                        forward = false;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else  {
                            System.out.println("We are at the end of the list");

                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0) {
                        listIterator.remove();
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing : "+ listIterator.next());
                    } else if(listIterator.hasPrevious()) {
                        System.out.println("Now playing : "+ listIterator.previous());
                    }
                    break;

            }

        }

    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                           "1 - to play next song\n" +
                           "2 - to play previous song\n" +
                           "3 - to replay the current song\n" +
                           "4 - list songs in playlist\n" +
                           "5 - print available actions\n" +
                           "6 - remove current song from playlist\n");
    }

    private static void printList( LinkedList<Song> playList) {
        Iterator<Song> it  = playList.iterator();
        while(it.hasNext()) {
            System.out.println( "Song is : " + it.next().toString());
        }

    }
}
