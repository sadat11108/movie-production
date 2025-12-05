package com.example.movieproductionhouse.Delowar_2420208.Director;

public class ShootingScheduleItem {
    private String startDate;
    private String endDate;
    private String location;


    public ShootingScheduleItem(String startDate, String endDate, String location) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "ShootingScheduleItem{" +
                "startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
