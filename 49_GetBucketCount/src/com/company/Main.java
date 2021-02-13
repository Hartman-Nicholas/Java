package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getBucketCount(3.14,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(3.4,1.5));
    }



    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets ) {
        double wallArea = 0;
        int numberOfBuckets = 0;
        double extraBucketArea = 0;

        if (width <= 0 || height <=  0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        wallArea = width * height;
        extraBucketArea = extraBuckets * areaPerBucket;
        wallArea -= extraBucketArea;
        numberOfBuckets = (int) Math.ceil(wallArea / areaPerBucket);

        return numberOfBuckets;

    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {
        double wallArea = 0;
        int numberOfBuckets = 0;

        if (width <= 0 || height <=  0 || areaPerBucket <= 0) {
            return -1;
        }
        wallArea = width * height;
        numberOfBuckets = (int) Math.ceil(wallArea / areaPerBucket);

        return numberOfBuckets;

    }

    public static int getBucketCount (double area, double areaPerBucket) {

        int numberOfBuckets = 0;

        if (area <= 0  || areaPerBucket <= 0) {
            return -1;
        }
        numberOfBuckets = (int) Math.ceil(area / areaPerBucket);

        return numberOfBuckets;

    }



}
