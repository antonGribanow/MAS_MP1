package com.company;

import java.util.List;

public class Vehicle {
    int numberOfSeats;
    List<String> configuration;

    public Vehicle(int numberOfSeats, List<String> configuration){
        this.configuration = configuration;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "numberOfSeats=" + numberOfSeats +
                ", configuration=" + configuration +
                '}';
    }
}
