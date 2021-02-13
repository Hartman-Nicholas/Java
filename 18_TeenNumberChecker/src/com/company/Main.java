package com.company;

public class Main {

    public static void main(String[] args) {
	boolean teenInList = TeenNumberChecker.hasTeen(13,15,19);
	boolean isTeenAge = TeenNumberChecker.isTeen(13);
        System.out.println(teenInList);
        System.out.println(isTeenAge);
    }
}
