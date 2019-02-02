package com.company.player;

public class Song implements Playable {
    private String author;
    private String title;

    public Song(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void play() {
        System.out.println("Playing song: " + getTitle() + ", author: " + getAuthor());
    }
}
