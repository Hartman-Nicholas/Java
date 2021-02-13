package com.company;

public class Main {

    public static void main(String[] args) {
       printFactors(6);
    }
    public static void printFactors (int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        StringBuilder value = new StringBuilder("");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                value.append(i).append(" ");
            }
        }
        System.out.println(value.toString());
    }
}
