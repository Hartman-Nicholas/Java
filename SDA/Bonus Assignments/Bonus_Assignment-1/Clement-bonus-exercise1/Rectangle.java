package shapes;

public class Rectangle {
	// Add the fields necessary to create a rectangle here.
	// Make use of the Line class
	static Line firstLine;
	static Line secondLine;
	static Line thirdLine;
	static Line fourthLine;

	// Create a constructor which receives and stores 4 lines when created

	Rectangle(Line firstLine, Line secondLine, Line thirdLine, Line fourthLine) {
		Rectangle.firstLine = firstLine;
		Rectangle.secondLine = secondLine;
		Rectangle.thirdLine = thirdLine;
		Rectangle.fourthLine = fourthLine;
	}


	// angle calculation
	public static double angleBetween2Lines(Line firstLine, Line secondLine) {

		double angle1 = Math.atan2((firstLine.firstPoint.y - firstLine.secondPoint.y),
				(firstLine.firstPoint.x - firstLine.secondPoint.x));

		double angle2 = Math.atan2((secondLine.firstPoint.y - secondLine.secondPoint.y),
				(secondLine.firstPoint.x - secondLine.secondPoint.x));

		return Math.toDegrees(angle1 - angle2);
	}

	// perpendicular checker

	public static boolean areContiguousPerpendicular(Line firstLine, Line secondLine) {
		double i = angleBetween2Lines(firstLine, secondLine);
		if (i == 270 || i == 90 ||i==-270 ||i==-270) {
			return true;
		}
		return false;
	}

	// parallel checker

	public static boolean areOppositeParallel(Line firstLine, Line secondLine) {
		double j = angleBetween2Lines(firstLine, secondLine);

		if (j == 0 || j == 180||j == -180 ) {
			return true;
		}
		return false;
	}

	// rectangle checker
	public static boolean isRectangle(Rectangle r) {

		boolean a = areContiguousPerpendicular(Rectangle.firstLine, Rectangle.secondLine);
		boolean b = areOppositeParallel(Rectangle.firstLine, Rectangle.thirdLine);

		if (a == true && b == true) {
			return true;
		}
		return false;
	}


	// Implement a method which returns the circumference of the rectangle

	public static double circumference(Rectangle r1) {
		return firstLine.length() + secondLine.length() + thirdLine.length() + fourthLine.length();
	}

	// Implement a method which returns the area of the rectangle

	public static double area(Rectangle r1) {
		return firstLine.length() * secondLine.length();
	}
}