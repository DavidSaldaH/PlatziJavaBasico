package com.anvicode.amazonviewer.model;

import java.util.Date;

public class Movie extends Film implements IVisualizable {
    
    private int id;
    private int timeViewed;
    
    public Movie(String title, String genre, String creator, int duration, short year) {
        super(title, genre, creator, duration);
        setYear(year);
    }

    //Getters and Setters
    public int getId() {
        return id;
    }
    
    public int getTimeViewed() {
        return timeViewed;
    }
    
    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }
    
    @Override
    public String toString() {
        return "Movie"
                + "\n Title: " + getTitle()
                + "\n Genero: " + getGenre()
                + "\n Year: " + getYear()
                + "\n Creator: " + getCreator()
                + "\n Duration: " + getDuration();
    }
    
    @Override
    public Date startTosee(Date dateI) {
        return dateI;
    }
    
    @Override
    public void stopToSee(Date dateI, Date dateF) {
        if (dateF.getSeconds() > dateI.getSeconds()) {
            setTimeViewed(dateF.getSeconds() - dateI.getSeconds());
        } else {
            setTimeViewed(0);
        }
    }
    
}
