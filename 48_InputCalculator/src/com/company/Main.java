package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage () {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long avg = 0;

        while(true) {

            System.out.println("Enter a number");


            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
                avg = Math.round((double) sum / count);




            } else {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }

            scanner.nextLine();
        }


        scanner.close();
    }


}
