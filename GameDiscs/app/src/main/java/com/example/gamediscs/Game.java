package com.example.gamediscs;

public class Game{

    private final String Game;
    private final int ImageResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Game(final String Game,
                final int imageResourceId) {
        this.Game=Game;
        this.ImageResourceId = imageResourceId;
    }

    public Game(final String Game) {
        this.Game=Game;
        this.ImageResourceId=NO_IMAGE_PROVIDED;
    }

    public String getGame() {
        return Game;
    }

    public int getImageResourceId() {
        return ImageResourceId;
    }


    public boolean hasImage() {
        return ImageResourceId != NO_IMAGE_PROVIDED;
    }



}
