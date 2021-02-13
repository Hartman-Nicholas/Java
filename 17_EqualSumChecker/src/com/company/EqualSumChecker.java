package com.company;

public class EqualSumChecker {

    public static boolean hasEqualSum (int numOne, int numTwo, int numThree) {
        if ((numOne + numTwo - numThree) == 0) {
            return true;
        }
        return false;
    }
}
