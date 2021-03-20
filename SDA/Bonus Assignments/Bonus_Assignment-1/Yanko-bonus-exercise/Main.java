public class Main
{
        public static void main(String[] args){
		//Create two squares using the Point, Line, and Square classes
		Line line1 = new Line(new Point(0, 0), new Point(5, 0));
		Line line2 = new Line(new Point(0, 0), new Point(0, 5));
		Line line3 = new Line(new Point(0, 5), new Point(5, 5));
		Line line4 = new Line(new Point(5, 0), new Point(5, 5));

		Line line5 = new Line(new Point(1, 1), new Point(1, 4));
		Line line6 = new Line(new Point(1, 1), new Point(6, 1));
		Line line7 = new Line(new Point(1, 4), new Point(6, 4));
		Line line8 = new Line(new Point(6, 4), new Point(6, 1));

		Rectangle square = new Rectangle(line1, line2, line3, line4);
		Rectangle rectangle = new Rectangle(line5, line6, line7, line8);

		// Creating a triangle using Line class.
        Line triangleLine1 = new Line(new Point(1, 1), new Point(3, 1));
        Line triangleLine2 = new Line(new Point(1, 1), new Point(1, 3));
        Line triangleLine3 = new Line(new Point(1, 3), new Point(3, 1));

        Triangle triangle = new Triangle(triangleLine1, triangleLine2, triangleLine3);

        //Print the area and circumreference of the square
		System.out.println("Area of the rectangle is " + square.area() + ".");
		System.out.println("Perimeter of the rectangle is " + square.circumreference() + ".");

		//Print the area and circumreference of the triangle
		System.out.println("\nPerimeter of the triangle is " + triangle.perimeterOfATriangle());
		System.out.println("Area of the triangle is " + triangle.areaOfTheTriangle());

		// Print out do the lines of the square object intersect
		System.out.println("\nSQUARE\nDo line1 and line2 intersect: " + Line.isIntersecting(line1, line2));
		System.out.println("Do line1 and line3 intersect: " + Line.isIntersecting(line1, line3));
		System.out.println("Do line2 and line4 intersect: " + Line.isIntersecting(line2, line4));
		System.out.println("Do line2 and line3 intersect: " + Line.isIntersecting(line2, line3));

		// Print out do the lines of the triangle object intersect
		System.out.println("\nTRIANGLE\nDo line1 and line2 intersect: " + Line.isIntersecting(triangleLine1, triangleLine2));
		System.out.println("Do line1 and line3 intersect: " + Line.isIntersecting(triangleLine1, triangleLine3));
		System.out.println("Do line2 and line3 intersect: " + Line.isIntersecting(triangleLine2, triangleLine3));

		// Do 2 rectangles intersect
			System.out.println("\nRECTANGLE INTERSECTION\nDo this two rectangles intersect: " + Rectangle.areRectanglesIntersecting(square, rectangle));
        }
}
