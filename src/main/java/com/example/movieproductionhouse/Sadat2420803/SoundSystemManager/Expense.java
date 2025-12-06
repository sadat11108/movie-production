package com.example.movieproductionhouse.Sadat2420803.SoundSystemManager;

public class Expense {
    private String category,totalExpenses;
    private Double Amount;

    public Expense(String category, String totalExpenses, Double amount) {
        this.category = category;
        this.totalExpenses = totalExpenses;
        Amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(String totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "category='" + category + '\'' +
                ", totalExpenses='" + totalExpenses + '\'' +
                ", Amount=" + Amount +
                '}';
    }
}
