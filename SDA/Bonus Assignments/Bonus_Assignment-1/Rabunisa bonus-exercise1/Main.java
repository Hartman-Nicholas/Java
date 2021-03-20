public class Main {
    public static void main(String[] args) {

        // Start of code to print Rectangle

        Point p1 = new Point(1.0, 1.0);
        Point p2 = new Point(4.0, 1.0);
        Point p3 = new Point(4.0, 4.0);
        Point p4 = new Point(1.0, 4.0);

        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p2, p3);
        Line line3 = new Line(p3, p4);
        Line line4 = new Line(p4, p1);

        Rectangle rec = new Rectangle(line1, line2, line3, line4);
        System.out.println("The circumference of the rectangle is " + rec.circumference());
        System.out.println("The Area of Rectangle is  " + rec.area());

        // end of code

        //Start of code to create a triangle
        Point p5 = new Point(2.0, 1.0);
        Point p6 = new Point(4.0, 1.0);
        Point p7 = new Point(3.0, 4.0);

        Line line5 = new Line(p5, p6);
        Line line6 = new Line(p6, p7);
        Line line7 = new Line(p7, p5);

        Triangle tri = new Triangle(line5, line6, line7);
        System.out.println("The Area of triangle is  " + tri.area_triAngle());


    }
}
