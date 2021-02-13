package com.company;

public class Main {

    public static void main(String[] args) {
        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        double challengeVar = 20;
        double challengeVarTwo = 80;

        double result = (challengeVarTwo + challengeVar) * 100;

        result = result % 40;

       boolean challengeResult = result == 0 ? true : false;
        System.out.println(challengeResult);

        if (!challengeResult) {
            System.out.println("Got some remainder");
        }


    }
}
