package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2));

        for(int i=0; i<5; i++) {
            System.out.println("Loop " + i + " hello");
        }

        for(int i=2; i<9; i++) {
            System.out.println(calculateInterest(10000.0, i));
        }

        for(int i=8; i>1; i--) {
            System.out.println(calculateInterest(10000.0, i));
        }
        int count = 0;
        for(int i=10; i<= 100; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i);
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
        int counter = 0;
        int countSum = 0;


        for (int i=1; i<= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                counter++;
                countSum += i;
                System.out.println(i);
                if (counter == 5) {
                    System.out.println(countSum);
                    break;
                }
            }
        }









    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for(int i=2; i<=(long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount *(interestRate/100));
    }
}
