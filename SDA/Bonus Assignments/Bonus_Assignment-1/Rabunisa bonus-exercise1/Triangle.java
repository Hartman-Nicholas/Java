public class Triangle {
    private Line line5;
    private Line line6;
    private Line line7;

    //Constructor to create triangle using Line class
    Triangle(Line line5, Line line6, Line line7) {
        this.line5 = line5;
        this.line6 = line6;
        this.line7 = line7;

    }

    //Area of a triangle using the length of 3 sides of a triangle
    public double area_triAngle() {

        double PerimeterOfTriangle = (line5.length() + line6.length() + line7.length()); //Perimeter of a Triangle
        double s = PerimeterOfTriangle / 2;   //Semi perimeter
        double area_triAngle = Math.sqrt(s * ((s - line5.length()) * (s - line6.length()) * (s - line7.length())));

        return area_triAngle;
    }


}
