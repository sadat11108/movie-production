package com.example.movieproductionhouse.Sadat2420803.SoundSystemManager;

public class Notification {
    private String title,type;
    private Integer date;

    public Notification(String title, String type, Integer date) {
        this.title = title;
        this.type = type;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", date=" + date +
                '}';
    }
}
