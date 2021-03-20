public class Main {

    public static void main(String[] args) {
        //Create a square using the Point, Line, and Square classes
        //Print the area and circumreference of the square
        //Print using the "System.out.println()" command

        // create a new rectangle using point,line and printing circumference and area of rectangle

        Line l1 = new Line(new Point(2, 1), new Point(7, 1));
        Line l2 = new Line(new Point(2, 1), new Point(2, 4));
        Line l3 = new Line(new Point(2, 4), new Point(7, 4));
        Line l4 = new Line(new Point(7, 4), new Point(7, 1));

        Rectangle rec = new Rectangle(l1, l2, l3, l4);
        System.out.println("The circumference of the Rectangle:" + rec.circumreference());
        System.out.println("The area of the Rectangle:" + rec.area());

        // create a new triangle using point,line and printing Hypotenuse,area,perimeter of triangle

        Line adj1 = new Line(new Point(4, 2), new Point(8, 2));
        Line adj2 = new Line(new Point(4, 2), new Point(4, 6));
        Line opp = new Line(new Point(4, 6), new Point(8, 2));

        Triangle tri = new Triangle(adj1, adj2, opp);
        System.out.println("Hypotenuse of the Triangle way1:" + tri.calculateHypotenuseway1());
        System.out.println("Hypotenuse of the Triangle way2:" + tri.calculateHypotenuseway2());
        System.out.println("area of the Triangle:" + tri.areaoftriangle());
        System.out.println("Perimeter of the Triangle:" + tri.perimeteroftriangle());

        // create a new square using point,line and printing area,perimeter and diagonal of the square

        Line s1 = new Line(new Point(3, 1), new Point(8, 1));
        Line s2 = new Line(new Point(3, 1), new Point(3, 6));
        Line s3 = new Line(new Point(3, 6), new Point(8, 6));
        Line s4 = new Line(new Point(8, 6), new Point(8, 1));

        Square squ = new Square(s1, s2, s3, s4);
        System.out.println("Area of square:" + squ.areaofsquare());
        System.out.println("Perimeter of square:" + squ.perimeterofsquare());
        System.out.println("Diagonal of square:" + squ.diagonalofsquare());

        // are the lines intersecting
        System.out.println("are line1 and Line2 intersecting:" +"" + l1.isIntersecting(l1,l2));

        //are the two rectangles intersecting

        Rectangle num1 = new Rectangle(l1,l2,l3,l4);
        Rectangle num2 = new Rectangle(l1,l2,l3,l4);

        System.out.println("are the two rectangles intersecting: " + " " + Rectangle.aretworectanglesIntersecting(num1,num2));

        System.out.println( "Rectangle lines intersecting:");

        System.out.println("are the lines line1 and line2 intersecting:" + Line.isIntersecting(l1,l2));
        System.out.println("are the lines line2 and line3 intersecting:" + Line.isIntersecting(l2,l3));
        System.out.println("are the lines line3 and line4 intersecting:" + Line.isIntersecting(l3,l4));
        System.out.println("are the lines line4 and line1 intersecting:" + Line.isIntersecting(l4,l1));

        System.out.println("Triangle lines intersecting:");

        System.out.println("are the lines side1 and side2 intersecting:" + Line.isIntersecting(adj1,adj2));
        System.out.println("are the lines side2 and oppositeside intersecting:" + Line.isIntersecting(adj2,opp));
        System.out.println("are the lines oppositeside and side1 intersecting:" + Line.isIntersecting(opp,adj1));

        System.out.println( "Square lines intersecting:");
        System.out.println("are the lines side1 and side2 intersecting:" + Line.isIntersecting(s1,s2));
        System.out.println("are the lines side2 and side3 intersecting:" + Line.isIntersecting(s2,s3));
        System.out.println("are the lines side3 and side4 intersecting:" + Line.isIntersecting(s3,s4));
        System.out.println("are the lines side4 and side1 intersecting:" + Line.isIntersecting(s4,s1));


    }
}





