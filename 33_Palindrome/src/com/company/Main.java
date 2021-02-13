package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome((-1221)));
    }
    public static boolean isPalindrome (int number) {

        if (number <= 0) {
            number *= -1;
            int startNumber = number;
            int reverse = 0;

            while (number > 0) {
                int digit = number % 10;
                reverse *= 10;
                reverse += digit;
                number /= 10;
            }
            return reverse == startNumber;

        } else if (number >=10) {
            int startNumber = number;
            int reverse = 0;

            while (number > 0) {
                int digit = number % 10;
                reverse *= 10;
                reverse += digit;
                number /= 10;
            }
            return reverse == startNumber;

        }
        return false;
    }

}
