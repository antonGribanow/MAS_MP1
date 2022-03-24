package com.company;

import java.util.List;

public class Building {
    List<String> tools;
    int sizeOfBuilding;
    int numberOfFloors;
    boolean thereIsParking;

    public Building(List<String> tools, int sizeOfBuilding, int numberOfFloors, boolean thereIsParking) {
        this.tools = tools;
        this.sizeOfBuilding = sizeOfBuilding;
        this.numberOfFloors = numberOfFloors;
        this.thereIsParking = thereIsParking;
    }

    @Override
    public String toString() {
        return "Building{" +
                "tools=" + tools +
                ", sizeOfBuilding=" + sizeOfBuilding +
                ", numberOfFloors=" + numberOfFloors +
                ", thereIsParking=" + thereIsParking +
                '}';
    }
}
