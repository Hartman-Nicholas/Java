package com.company;

import com.sun.jdi.Value;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(hoursMinSec(61, 5));
        System.out.println(hoursMinSec(500));

    }
    public static String hoursMinSec (int min, int sec) {
        if (min >= 0 && sec >=0 && sec <= 59) {
            int newMin = min % 60;
            int hour = min / 60;

            String hoursString = hour + "h ";
            if (hour < 10 ) {
                hoursString = "0" + hoursString;
            }

            String minutesString = newMin + "m ";
            if (newMin < 10 ) {
                minutesString = "0" + minutesString;
            }

            String secondsString = sec + "s";
            if (sec < 10 ) {
                secondsString = "0" + secondsString;
            }


            return hoursString + minutesString + secondsString;
        }
        return INVALID_VALUE_MESSAGE;
    }
    public static String hoursMinSec (int sec) {
        if (sec>=0) {
            int newSec = sec % 60;
            int min = sec / 60;
            return hoursMinSec(min, newSec);
        }
        return INVALID_VALUE_MESSAGE;
    }
}
