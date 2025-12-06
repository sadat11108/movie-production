package com.example.movieproductionhouse.Sadat2420803.SoundSystemManager;

import java.time.LocalDate;

public class Schedule {
    private String name,equipment,status;
    private LocalDate shootingDate;

    public Schedule(String name, String equipment, String status, LocalDate shootingDate) {
        this.name = name;
        this.equipment = equipment;
        this.status = status;
        this.shootingDate = shootingDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getShootingDate() {
        return shootingDate;
    }

    public void setShootingDate(LocalDate shootingDate) {
        this.shootingDate = shootingDate;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "name='" + name + '\'' +
                ", equipment='" + equipment + '\'' +
                ", status='" + status + '\'' +
                ", shootingDate=" + shootingDate +
                '}';
    }
}
