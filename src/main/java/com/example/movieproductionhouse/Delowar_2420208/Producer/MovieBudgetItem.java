package com.example.movieproductionhouse.Delowar_2420208.Producer;

public class MovieBudgetItem {
    private String movieName;
    private String estimatedBudget;
    private String status;


    public MovieBudgetItem(String movieName, String estimatedBudget, String status) {
        this.movieName = movieName;
        this.estimatedBudget = estimatedBudget;
        this.status = status;
    }


    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getEstimatedBudget() {
        return estimatedBudget;
    }

    public void setEstimatedBudget(String estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "MovieBudgetItem{" +
                "movieName='" + movieName + '\'' +
                ", estimatedBudget='" + estimatedBudget + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
