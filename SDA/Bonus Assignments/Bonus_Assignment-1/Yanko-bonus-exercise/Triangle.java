import java.lang.Math;

public class Triangle {

    Line line1;
    Line line2;
    Line line3;

    public Triangle(Line line1, Line line2, Line line3) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }

    public  double perimeterOfATriangle() {
       return line1.distance() + line2.distance() + line3.distance();
    }

    public double areaOfTheTriangle() {
        double halfPerimeter = this.perimeterOfATriangle() / 2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - line1.distance()) * (halfPerimeter - line2.distance()) * (halfPerimeter - line3.distance()));
        return area;
    }
}
