package com.company;

public class Vehicle {

    private String steering;
    private int ChangingGears;
    private double speed;

    public Vehicle(String steering, int changingGears, double speed) {
        this.steering = steering;
        ChangingGears = changingGears;
        this.speed = speed;
    }

    public String TurnCar () {
       return "left";
    }


}
