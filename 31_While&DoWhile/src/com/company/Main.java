package com.company;

public class Main {

    public static void main(String[] args) {

//        int count = 0;
//        while (count != 5) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        count = 1;
//        while(true) {
//            if (count == 5) {
//                break;
//            }
//            System.out.println("Count Value is " + count);
//            count++;
//        }
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//            if (count>100) {
//                break;
//            }
//        } while (count != 6);

        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            count++;

            if (count == 5) {
                System.out.println(count);
                break;
            }
        }






    }
    public static boolean isEvenNumber (int number) {
        if(number < 0) {
            return false;
        } else return number % 2 == 0;
    }
}
