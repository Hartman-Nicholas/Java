package com.company;

public class Main {

    public static void main(String[] args) {
	int value = 2;
	if (value == 1) {
        System.out.println("Value was 1");
    } else if (value == 2) {
        System.out.println("Value was 2");
    } else {
        System.out.println("Was not 1 or 2");
    }

	int switchValue = 1;

	switch(switchValue) {
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("Value was 2");
            break;
        case 3: case 4: case 5:
            System.out.println("was a 3 , or a 4 or a 5");
        default:
            System.out.println("Was not 1 or 2");
            break;
        }

    char charValue = 'A';

	switch (charValue) {
        case 'A':
            System.out.println("Value was A");
            break;
        case 'B':
            System.out.println("Value was B");
            break;
        default:
            System.out.println("Value was not found");
            break;
    }

    String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("Value was not found");
                break;
        }
    }
}
