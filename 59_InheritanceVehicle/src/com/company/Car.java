package com.company;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int color;

    public Car(String steering, int changingGears, double speed, int wheels, int doors, int color) {
        super(steering, changingGears, speed);
        this.wheels = wheels;
        this.doors = doors;
        this.color = color;
    }


}
