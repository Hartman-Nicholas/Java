import java.awt.geom.Line2D;

public class Rectangle {

    private Line line1;
    private Line line2;
    private Line line3;
    private Line line4;


    //Create a constructor which recieves and stores 4 lines when created
    public Rectangle(Line l1, Line l2, Line l3, Line l4) {
        this.line1 = l1;
        this.line2 = l2;
        this.line3 = l3;
        this.line4 = l4;

    }

    //Implement a method which returns the circumreference of the rectangle
    public double circumreference() {

        return (2 * (line1.length() + line2.length()));
    }

    //Implement a method which returns the area of the rectangle
    public double area() {
        return (line1.length() * line2.length());
    }

    public static boolean  aretworectanglesIntersecting(Rectangle num1, Rectangle num2) {

        boolean solution = false;
        Line[] shape1 = {num1.line1, num1.line2, num1.line3, num1.line4};
        Line[] shape2 = {num2.line1, num2.line2, num2.line3, num2.line4};

        for (int i = 0; i < shape1.length; i++) {
            for (int j = 0; j < shape2.length; j++) {
                if (Line.isIntersecting(shape1[i], shape2[j])) {
                    solution = true;

                }
            }

        }
        return solution;
    }
}


