package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(22, 24));
    }
    public static boolean hasSharedDigit (int number, int numberTwo) {
        if(number <= 10 || number > 99 || numberTwo <= 10 || numberTwo > 99) {
            return false;
        }
        int firstDigit = (number % 10);
        int secondDigit = (number / 10);
        int thirdDigit = (numberTwo % 10);
        int fourthDigit = (numberTwo / 10);

        return firstDigit == thirdDigit || firstDigit == fourthDigit || secondDigit == thirdDigit || secondDigit == fourthDigit;
    }

}
