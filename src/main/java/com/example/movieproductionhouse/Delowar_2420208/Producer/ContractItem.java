package com.example.movieproductionhouse.Delowar_2420208.Producer;

public class ContractItem {
    private String name;
    private String type;
    private String status;


    public ContractItem(String name, String type, String status) {
        this.name = name;
        this.type = type;
        this.status = status;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "ContractItem{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
