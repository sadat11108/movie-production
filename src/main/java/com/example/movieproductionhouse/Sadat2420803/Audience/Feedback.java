package com.example.movieproductionhouse.Sadat2420803.Audience;

public class Feedback {
    private Movie movie;
    private String feedbackText;
    private Double rating;

    public Feedback(Movie movie, String feedbackText, Double rating) {
        this.movie = movie;
        this.feedbackText = feedbackText;
        this.rating = rating;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "movie=" + movie +
                ", feedbackText='" + feedbackText + '\'' +
                ", rating=" + rating +
                '}';
    }
}
