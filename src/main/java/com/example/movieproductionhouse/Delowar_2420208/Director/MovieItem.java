package com.example.movieproductionhouse.Delowar_2420208.Director;

public class MovieItem {
    private String title;
    private String genre;
    private String description;

    public MovieItem(String title, String genre, String description) {
        this.title = title;
        this.genre = genre;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    @Override
    public String toString() {
        return "MovieItem{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
