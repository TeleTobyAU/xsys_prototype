package com.example.xsysprototype;

public class User {
    String name, buildingNumber, roomNumber;

    boolean gymMember = false, musicMember = false;

    public User (String name, String buildingNumber, String roomNumber) {
        this.name = name;
        this.buildingNumber = buildingNumber;
        this.roomNumber = roomNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
