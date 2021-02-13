package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);

        double newMeasurement = calcFeetAndInchesToCentimeters(12, 12);
        System.out.println(newMeasurement);

        double newMeasurementTwo = calcFeetAndInchesToCentimeters(100);
        System.out.println(newMeasurementTwo);

    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + "points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored: " + score + "points");
        return score * 1000;
    }

    public static double calcFeetAndInchesToCentimeters (int feet, int inches) {
        if (feet >=0 && inches >=0 && inches <= 12) {
            feet = feet *12;
            return  (inches + feet) * 2.54;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters (int inches) {
        if (inches >=0) {
            int newInches = inches % 12;
            int feet = inches / 12;
            double centimeters = calcFeetAndInchesToCentimeters(feet, newInches);
            return centimeters;
        }
        return -1;
    }



}
