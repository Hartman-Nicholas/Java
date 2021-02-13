package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;


        while (true) {

            System.out.println("Enter a number");


            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                if (number>maxNumber) {
                    maxNumber=number;

                } else if (number < minNumber) {
                    minNumber = number;

                }

            } else {
                System.out.println("Max number entered: " + maxNumber);
                System.out.println("Min number entered: " + minNumber);
                break;
            }

            scanner.nextLine();
        }

        scanner.close();
    }
}
