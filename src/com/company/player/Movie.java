package com.company.player;

public class Movie implements Playable {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void play() {
        System.out.println("Playing movie: " + getTitle());
    }
}
