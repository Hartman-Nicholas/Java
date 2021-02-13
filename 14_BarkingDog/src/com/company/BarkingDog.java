package com.company;

public class BarkingDog {

    public static boolean shouldWakeUp (boolean barking, int time ) {
        if (time < 0 || time > 23) {
            return false;

        }else if (barking && (time < 8)) {
            return true;
        } else if (barking && (time > 22)) {
            return true;
        }
        return false;
    }
}
