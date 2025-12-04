package com.example.movieproductionhouse.Delowar_2420208.Director;

public class CrewItem {
    private String crewName;
    private String role;
    private String contact;


    public CrewItem(String crewName, String role) {
        this.crewName = crewName;
        this.role = role;
        this.contact = contact;
    }

    public String getCrewName() {
        return crewName;
    }

    public void setCrewName(String crewName) {
        this.crewName = crewName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "CrewItem{" +
                "crewName='" + crewName + '\'' +
                ", role='" + role + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
