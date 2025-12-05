package com.example.movieproductionhouse.Delowar_2420208.Producer;

public class ProgressItem {
    private String movieName;
    private int progress;
    private String remarks;


    public ProgressItem(String movieName, int progress, String remarks) {
        this.movieName = movieName;
        this.progress = progress;
        this.remarks = remarks;
    }


    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


    @Override
    public String toString() {
        return "ProgressItem{" +
                "movieName='" + movieName + '\'' +
                ", progress=" + progress +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
