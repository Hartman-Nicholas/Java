public class Triangle {

    //Add the fields necessary to create a Triangle here.
    //Make use of the Line class

    private Line L1;
    private Line L2;
    private Line L3;


    // Create a constructor which receives and stores 3 lines when created

    public Triangle(Line l1, Line l2, Line l3) {
        L1 = l1;
        L2 = l2;
        L3 = l3;

    }

    public Line getL1() {
        return L1;
    }

    public Line getL2() {
        return L2;
    }

    public Line getL3() {
        return L3;
    }


    public boolean isTriangle() {

        int matchCheck1 = 0;
        int matchCheck2 = 0;
        int matchCheck3 = 0;

        // Created an array to store all the points from the Triangle

        Point[] PointArray = new Point[6];
        PointArray[0] = L1.getP1();
        PointArray[1] = L1.getP2();
        PointArray[2] = L2.getP1();
        PointArray[3] = L2.getP2();
        PointArray[4] = L3.getP1();
        PointArray[5] = L3.getP2();

        // For loop, loops over all the array points and increments matchCheck if match found
        // For an object to join all points should have only 2 point matches


        for(Point x : PointArray) {
            if (x.equals(PointArray[0])) {
                matchCheck1++;
            } if (x.equals(PointArray[1])) {
                matchCheck2++;
            } if (x.equals(PointArray[2])) {
                matchCheck3++;
            }
        }

        // Checks if 2 matches where found for each point

        return (matchCheck1 == 2 && matchCheck2 == 2 && matchCheck3 == 2);
    }


    //Implement a method which returns the circumference of the Triangle
    public double circumference() {
        if (isTriangle()) {
            return L1.length() + L2.length() + L3.length();
        } else return -1;

    }

    //Implement a method which returns the area of the Triangle
    public double area() {
        if (isTriangle()) {
            double a = L1.length();
            double b = L2.length();
            double c = L3.length();

            double p = (a+b+c) / 2;

            return Math.sqrt(p*(p-a)*(p-b)*(p-c));


        }
        return -1;
    }

    // Implement a method which returns a boolean if the position of 2 Triangles intersect.

    public boolean isIntersecting (Triangle T1) {

        int i = 0;

        // Created 2 arrays to store each Triangles Line values

        Line [] secondLineArray = new Line [4];

        secondLineArray[0] = T1.getL1();
        secondLineArray[1] = T1.getL2();
        secondLineArray[2] = T1.getL3();

        Line [] firstLineArray = new Line [4];

        firstLineArray[0] = L1;
        firstLineArray[1] = L2;
        firstLineArray[2] = L3;

        // Loop the first array over the second array to check if anyone of the lines intersect
        // using the isIntersecting method generated in the Line class

        for(Line x : firstLineArray) {
            while (i < 3) {
                if(x.isIntersecting(secondLineArray[i])){
                    return true;
                } else
                    i++;
            }
        }
        return false;
    }


}





