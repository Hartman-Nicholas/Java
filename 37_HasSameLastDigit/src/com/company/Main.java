package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(11, 22, 31));

    }

    public static boolean isValid (int number) {
        return number >= 10 && number <= 1000;
    }

    public static boolean hasSameLastDigit (int n1, int n2, int n3) {
        if (!isValid(n1) || !isValid(n2) || !isValid(n3)) {
            return false;
        }
        int nOneLast = n1 % 10;
        int nTwoLast = n2 % 10;
        int nThreeLast = n3 % 10;


        return nOneLast == nTwoLast || nOneLast == nThreeLast || nTwoLast == nThreeLast;

    }


}
