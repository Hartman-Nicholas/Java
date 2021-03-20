public class Rectangle{
	//Add the fields necessary to create a rectangle here.
	//Make use of the Line class
	private Line line1;
	private Line line2;
	private Line line3;
	private Line line4;


	//Create a constructor which recieves and stores 4 lines when created
	public Rectangle(Line line1, Line line2, Line line3, Line line4){
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.line4 = line4;
	}

	//Implement a method which returns the circumreference of the rectangle
	public double circumreference(){
		return 2 * line1.distance() + 2 * line2.distance();
	}	

	//Implement a method which returns the area of the rectangle
	public double area(){
		return line1.distance() * line2.distance();
	}

	public static boolean areRectanglesIntersecting(Rectangle rectangle1, Rectangle rectangle2) {
		boolean result = false;
		Line[] rectangleLines = {rectangle1.line1, rectangle1.line2, rectangle1.line3, rectangle1.line4};
		Line[] rectangle2Lines = {rectangle2.line1, rectangle2.line2, rectangle2.line3, rectangle2.line4};

		for (int i = 0; i < rectangleLines.length; i++) {
			for (int j = 0; j < rectangle2Lines.length; j++) {
				if (Line.isIntersecting(rectangleLines[i], rectangle2Lines[j])) {
					result = true;
				}
			}
		}
		return result;
	}
}