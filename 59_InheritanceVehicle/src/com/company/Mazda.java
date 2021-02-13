package com.company;

public class Mazda extends Car {

    private String type;

    public Mazda(String steering, int changingGears, double speed, int wheels, int doors, int color, String type) {
        super(steering, changingGears, speed, wheels, doors, color);
        this.type = type;
    }
}
