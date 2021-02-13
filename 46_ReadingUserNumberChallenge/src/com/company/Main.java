package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to sum calculator");
        System.out.println("Please Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name + " lets get started");

        int sum = 0;
        int number = 0;
        int counter = 1;

        for (int i = 1; counter<11; i++ ) {

            System.out.println("Please enter number #" + counter);

            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                number = scanner.nextInt();
                counter++;
            } else {
                System.out.println("Please enter a valid number");
            }
            scanner.nextLine();
            sum += number;
        }

        System.out.println("The sum of your values is: " + sum);
        scanner.close();

    }
}
