package com.company;

import com.company.player.*;

public class Main {

    public static void main(String[] args) {

        Playlist mainList = new Playlist(Playlist.PlayMode.SEQUENCE);
        mainList.add(new Song("Rolling Stones", "Brown Sugar"));

        Playlist childList = new Playlist(Playlist.PlayMode.SHUFFLE);
        childList.add(new Song("Led Zeppelin", "Immigrant Song"));
        childList.add(new Movie("John Wick"));

        mainList.add(childList);
        mainList.add(new Movie("Casablanca"));

        mainList.play();

    }
}
