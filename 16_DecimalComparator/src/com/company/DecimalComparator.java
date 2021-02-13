package com.company;

import java.text.DecimalFormat;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double numOne, double numTwo) {
        numOne = ((double)((int) (numOne * 1000)))/ 1000;
        numTwo = ((double)((int) (numTwo * 1000)))/ 1000;
        System.out.println(numTwo);
        System.out.println(numOne);
        if (numOne == numTwo) {
            return true;
        }
        return false;
    }

}
