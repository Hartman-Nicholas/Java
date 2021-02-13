package com.company;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int kilobytes = kiloBytes % 1024;
            int megabytes = Math.round(kiloBytes / 1024);
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + kilobytes + " KB");
        }
    }

}
