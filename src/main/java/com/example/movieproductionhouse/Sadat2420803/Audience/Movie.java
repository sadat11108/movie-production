package com.example.movieproductionhouse.Sadat2420803.Audience;

public class Movie {
    private String name, genre, description;
    private int id, year;

    public Movie(String name, String genre, String description, int id, int year) {
        this.name = name;
        this.genre = genre;
        this.description = description;
        this.id = id;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", year=" + year +
                '}';
    }
}
