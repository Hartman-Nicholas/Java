package com.company;

public class Main {

    public static void main(String[] args) {
        numberToWords(1455);


    }
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int reversedNumber = reverse(number);
            int originalNumberSize = getDigitCount(number);
            int reversedNumberSize = getDigitCount(reversedNumber);
            while (reversedNumber != 0) {
                switch (reversedNumber % 10) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Other");
                        break;
                }
                reversedNumber = reversedNumber / 10;
            }
            for (int i = reversedNumberSize; i < originalNumberSize; i++) {

                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }
        if (number < 0) {
            return -reversedNumber;
        } else {
            return reversedNumber;
        }
    }

    public static int getDigitCount(int number) {
        int digitCount = 0;
        if (number > 0) {
            while (number != 0) {
                digitCount++;
                number = number / 10;
            }
            return digitCount;
        } else if (number == 0) {
            return 1;
        }
        return -1;
    }
}
