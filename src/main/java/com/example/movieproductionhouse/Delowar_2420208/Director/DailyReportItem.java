package com.example.movieproductionhouse.Delowar_2420208.Director;

public class DailyReportItem {
    private String reportId;
    private String date;
    private String details;

    public DailyReportItem(String reportId, String date, String details) {
        this.reportId = reportId;
        this.date = date;
        this.details = details;
    }


    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }


    @Override
    public String toString() {
        return "DailyReportItem{" +
                "reportId='" + reportId + '\'' +
                ", date='" + date + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
