package com.example.movieproductionhouse.Sadat2420803.SoundSystemManager;

public class Inventory {
    private String equipmentName;
    private Integer equipmentSerial;

    public Inventory(String equipmentName, Integer equipmentSerial) {
        this.equipmentName = equipmentName;
        this.equipmentSerial = equipmentSerial;
    }

    public Integer getEquipmentSerial() {
        return equipmentSerial;
    }

    public void setEquipmentSerial(Integer equipmentSerial) {
        this.equipmentSerial = equipmentSerial;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "equipmentName='" + equipmentName + '\'' +
                ", equipmentSerial=" + equipmentSerial +
                '}';
    }
}
