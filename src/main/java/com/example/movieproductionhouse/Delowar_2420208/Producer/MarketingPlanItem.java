package com.example.movieproductionhouse.Delowar_2420208.Producer;

public class MarketingPlanItem {
    private String movie;
    private String strategy;
    private String status;


    public MarketingPlanItem(String movie, String strategy, String status) {
        this.movie = movie;
        this.strategy = strategy;
        this.status = status;
    }


    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MarketingPlanItem{" +
                "movie='" + movie + '\'' +
                ", strategy='" + strategy + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
