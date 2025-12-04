package com.example.movieproductionhouse.Delowar_2420208.Director;

public class MovieReleaseItem {
    private String title;
    private String status;

    public MovieReleaseItem(String title, String status) {
        this.title = title;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MovieReleaseItem{" +
                "title='" + title + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
