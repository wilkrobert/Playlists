package com.company.player;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements Playable {

    private List<Playable> medias;

    private PlayMode playMode;

    public Playlist(PlayMode playMode) {
        this.medias = new ArrayList<>();
        this.playMode = playMode;
    }

    public void add(Playable playable) {
        medias.add(playable);
    }

    public enum PlayMode {
        SHUFFLE {
        },
        LOOP {
        },
        SEQUENCE {
        }
    }

    @Override
    public void play() {
        switch (playMode) {

            case LOOP:
                playLoop();
                break;

            case SHUFFLE:
                playShuffle();
                break;

            case SEQUENCE:
                playSequence();
                break;

        }
    }

    private void playSequence() {
        for (Playable playable : medias) {
            playable.play();
        }
    }

    private void playShuffle() {
        for (Playable playable : medias) {
            playable.play();
        }
    }

    private void playLoop() {
        for (Playable playable : medias) {
            playable.play();
        }
    }
}
