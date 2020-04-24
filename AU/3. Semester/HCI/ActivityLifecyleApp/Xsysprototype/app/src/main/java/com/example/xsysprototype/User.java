package com.example.xsysprototype;

import java.io.Serializable;

public class User implements Serializable {
    private String name, buildingNumber, roomNumber;

    private boolean gymMember, musicMember;

    public User (String name, String buildingNumber, String roomNumber, boolean gymMember, boolean musicMember) {
        this.name = name;
        this.buildingNumber = buildingNumber;
        this.roomNumber = roomNumber;
        this.gymMember = gymMember;
        this.musicMember = musicMember;
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

    public boolean isGymMember() {
        return gymMember;
    }

    public void setGymMember(boolean gymMember) {
        this.gymMember = gymMember;
    }

    public boolean isMusicMember() {
        return musicMember;
    }

    public void setMusicMember(boolean musicMember) {
        this.musicMember = musicMember;
    }
}
