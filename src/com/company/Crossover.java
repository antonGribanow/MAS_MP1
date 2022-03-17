package com.company;

import java.util.List;

public class Crossover extends Vehicle {

    String model;
    Double engineCapacity;
    String color;
    String registrationNumber;
    List<Vehicle> vihicleInRent;

     public Crossover(String model, Double engineCapacity, String color, String registrationNumber, List<Vehicle> vihicleInRent, int numberOfSeats, List<String> configuration){
         super(numberOfSeats, configuration);
         this.model = model;
         this.engineCapacity = engineCapacity;
         this.color = color;
         this.registrationNumber = registrationNumber;
         this.vihicleInRent = vihicleInRent;
     }


    @Override
    public String toString() {
        return "Crossover{" +
                "model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", color='" + color + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
