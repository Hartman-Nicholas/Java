package com.company;

public class Main {

    public static void main(String[] args) {
	boolean gameOver = true;
	int score = 5000;
	int levelCompleted = 5;
	int bonus = 100;

//	if(score < 5000 && score > 1000) {
//        System.out.println("Your score was less than 5000 but greater than a 1000");
//    } else if (score < 1000) {
//	    System.out.println("your score was less than 1000");
//    } else {
//        System.out.println("Got here");
//    }

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        if (gameOver) {
            int scoreTwo = 10000;
            int levelCompletedTwo = 8;
            int bonusTwo = 200;
            int finalScore = scoreTwo + (levelCompletedTwo * bonusTwo);
            System.out.println("Your final score was " + finalScore);

        }

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            int gameOn = -1;
            return gameOn;
        }

    }
}
