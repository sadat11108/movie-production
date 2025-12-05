package com.example.movieproductionhouse.Delowar_2420208.Producer;

public class MoviePerformanceItem {
    private String movie;
    private String revenue;
    private String rating;


    public MoviePerformanceItem(String movie, String revenue, String rating) {
        this.movie = movie;
        this.revenue = revenue;
        this.rating = rating;
    }


    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }


    @Override
    public String toString() {
        return "MoviePerformanceItem{" +
                "movie='" + movie + '\'' +
                ", revenue='" + revenue + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
