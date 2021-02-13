package com.company;

public class Main {

    public static void main(String[] args) {
       int position = calculateHighScorePosition(50);
       displayHighScorePosition("Nicholas Hartman", position);
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + "Managed to get into position" + position);
    }

}
