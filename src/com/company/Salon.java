package com.company;

import java.util.List;

public class Salon extends Building{
    List<Building> salonsInUse;
    String adress;
    String city;


    public Salon(List<String> tools, int sizeOfBuilding, int numberOfFloors, boolean thereIsParking, List<Building> salonsInUse, String adress, String city) {
        super(tools, sizeOfBuilding, numberOfFloors, thereIsParking);
        this.salonsInUse = salonsInUse;
        this.adress = adress;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Salon{" +
                "adress='" + adress + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
