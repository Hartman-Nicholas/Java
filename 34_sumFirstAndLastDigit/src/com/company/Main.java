package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(9112));
    }
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = 0;
        int firstDigit = number % 10;
        while (number > 0 ) {

            lastDigit = number % 10;
            number /= 10;
        }
        return lastDigit + firstDigit;

    }
}
