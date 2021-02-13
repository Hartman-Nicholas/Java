package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));

    }
    public static int getLargestPrime (int number){

        MyLambda isPrime;
        isPrime = (int n) -> {
            for(int i = 2; i< n; i++) {
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        };


        if(isPrime.isPrime(number)) {
            return number;
        }
        if(number <1) {
            return -1;
        }
        for (int i = number/2; i >= number; i-- ) {
            if (number % i == 0 && isPrime.isPrime(i)) {
              return i;
            }
        }
        return -1;
    }
}  interface MyLambda {
    boolean isPrime(int number);
}



//    public static int getLargestPrime(int number) {
//        if(number <= 1){
//            return -1;
//        }
//        for(int i = number/2; i >= 2; i--) {
//            if(number % i == 0) {
//                number = i;
//            }
//        }
//        return number;
//    }
