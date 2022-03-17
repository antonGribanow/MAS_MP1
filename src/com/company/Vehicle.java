package com.company;

import java.util.List;

public class Vehicle {
    String model;
    String color;
    List<String> configuration;

    public Vehicle(String model, String color, List<String> configuration){
        this.model = model;
        this.color = color;
        this.configuration = configuration;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", configuration=" + configuration +
                '}';
    }
}
