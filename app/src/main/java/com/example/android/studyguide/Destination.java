package com.example.android.studyguide;


public class Destination {

    private int location;
    private int date;
    private int photoId;

    public int getLocation() {return location;}

    public void setLocation(int location) {this.location = location;}

    public int getQuestion() {return date;}

    public void setQuestion(int question) {this.date = question;}

    public int getPhotoId() {return photoId;}

    public void setPhotoId(int photoId) {this.photoId = photoId;}


    public Destination (int location, int date, int photoId) {

        this.location = location;
        this.date = date;
        this.photoId = photoId;
    }
}
