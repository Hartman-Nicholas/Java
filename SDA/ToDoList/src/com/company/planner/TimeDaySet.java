package com.company;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class TimeDaySet implements Serializable {

    private final Map<String, String> timeDaySet = new HashMap<>();
    private final String[] timeOfDay = new String [24];
    private final String[] indexRef = new String[timeOfDay.length];
    @Serial
    private final static long serialVersionUID = 3L;

    public TimeDaySet() {
        generateTimeOfDay();
        generateIndexRef();
        generateMap();

    }

    private void generateTimeOfDay () {
        for (int i = 0; i < 24; i++) {
            if (i < 10) {
                timeOfDay[i] = ("0" + i + ":00");
            } else {
                timeOfDay[i] = (i + ":00");
            }
        }
    }

    private void generateIndexRef () {
        int count = 10;
        for (int i=0; i< timeOfDay.length; i++) {
                indexRef[i] = "" + count;
                count += 10;

        }
    }

    private void generateMap () {
        for (int i = 0; i<timeOfDay.length; i++) {
            timeDaySet.put(indexRef[i], timeOfDay[i]);
        }
    }

    public String findValue (int row, int column) {
        String argsRow = String.valueOf(row);
        String key = argsRow+column;

        return findValue(key);
    }

    private String findValue (String key) {
        if (timeDaySet.containsKey(key)) {
            return timeDaySet.get(key);
        } else {
            System.out.println("Key not found");
            return "";
        }

    }





}
