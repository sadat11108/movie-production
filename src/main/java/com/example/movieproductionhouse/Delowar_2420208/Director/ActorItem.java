package com.example.movieproductionhouse.Delowar_2420208.Director;

public class ActorItem {
    private String name;
    private String role;


    public ActorItem(String name, String role) {
        this.name = name;
        this.role = role;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "ActorItem{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
