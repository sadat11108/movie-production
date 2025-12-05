package com.example.movieproductionhouse.Delowar_2420208.Producer;

public class StudioResource {
    private String resourceName;
    private String type;
    private int quantity;


    public StudioResource(String resourceName, String type, int quantity) {
        this.resourceName = resourceName;
        this.type = type;
        this.quantity = quantity;
    }


    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "StudioResource{" +
                "resourceName='" + resourceName + '\'' +
                ", type='" + type + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
