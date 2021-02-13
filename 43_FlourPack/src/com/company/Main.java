package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(2,1,5));
    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        bigCount *= 5;

        if(bigCount < 0 || smallCount < 0 || goal <0){
            return false;
        }
        int goalRemainder =  bigCount>=goal ? goal % 5: goal - bigCount;
        int finalSum = goalRemainder - smallCount;
        return finalSum <= 0;
    }

}
