package com.example.movieproductionhouse.Delowar_2420208.Producer;

public class PaymentItem {
    private String name;
    private double payAmount;
    private String paymentStatus;


    public PaymentItem(String name, double payAmount, String paymentStatus) {
        this.name = name;
        this.payAmount = payAmount;
        this.paymentStatus = paymentStatus;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(double payAmount) {
        this.payAmount = payAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }


    @Override
    public String toString() {
        return "PaymentItem{" +
                "name='" + name + '\'' +
                ", payAmount=" + payAmount +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
