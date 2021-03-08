package com.company;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class WeekDaySet implements Serializable {

    private final Map<String, String> daysOfWeek = new HashMap<>();
    private final String[] weekDays = {"Time"," Sunday", " Monday", " Tuesday", " Wednesday", " Thursday", " Friday", " Saturday"};
    private final String[] indexRef = new String[weekDays.length];
    private final static long serialVersionUID = 2L;

    public WeekDaySet() {
        generateIndexRef();
        generateMap();
    }


    private void generateIndexRef () {
        for (int i=0; i< weekDays.length; i++) {
            indexRef[i] = "0"+i;
        }

    }
    private void generateMap () {
        for (int i = 0; i< weekDays.length; i++) {
            daysOfWeek.put(indexRef[i], weekDays[i]);
        }
    }

    public String findValue (int row, int column) {
        String argsRow = String.valueOf(row);
        String key = argsRow+column;

        return findValue(key);
    }

    private String findValue (String key) {
        if (daysOfWeek.containsKey(key)) {
            return daysOfWeek.get(key);
        } else {
            System.out.println("Key not found");
            return "";
        }

    }



}
