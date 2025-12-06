package com.example.movieproductionhouse.Sadat2420803.SoundSystemManager;

public class Report {
    private String reportType,describtion,value,item;

    public Report(String reportType, String describtion, String value, String item) {
        this.reportType = reportType;
        this.describtion = describtion;
        this.value = value;
        this.item = item;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Report{" +
                "reportType='" + reportType + '\'' +
                ", describtion='" + describtion + '\'' +
                ", value='" + value + '\'' +
                ", item='" + item + '\'' +
                '}';
    }
}
