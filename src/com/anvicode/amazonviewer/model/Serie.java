package com.anvicode.amazonviewer.model;

public class Serie extends Film {

    private int id;
    private int sessionQuantity;
    private Chapter[] chapter;

    public Serie(String title, String genre, String creator, int duration, int sessionQuantity) {
        super(title, genre, creator, duration);
        this.sessionQuantity = sessionQuantity;
    }

    public int getId() {
        return id;
    }

    public int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    public Chapter[] getChapter() {
        return chapter;
    }

    public void setChapter(Chapter[] chapter) {
        this.chapter = chapter;
    }

    @Override
    public String toString() {
        return "Serie: "
                + "\n Title:" + getTitle()
                + "\n Genre: " + getGenre()
                + "\n Year: " + getYear()
                + "\n Creator: " + getCreator()
                + "\n Duration: " + getDuration();
    }

}
