package com.company;

public class TeenNumberChecker {

    public static boolean hasTeen (int ageOne, int ageTwo, int ageThree) {
        if ( ageOne >= 13 && ageOne <= 19 ) {
            return true;
        } else   if ( ageTwo >= 13 && ageTwo <= 19 ) {
            return true;
        } else   if ( ageThree >= 13 && ageThree <= 19 ) {
            return true;
        }
        return false;
    }

    public static boolean isTeen (int ageOne) {
        if ( ageOne >= 13 && ageOne <= 19 ) {
            return true;
        }
        return false;
    }

}
