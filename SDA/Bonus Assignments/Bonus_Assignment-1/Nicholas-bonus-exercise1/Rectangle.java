
public class Rectangle {
	//Add the fields necessary to create a rectangle here.
	//Make use of the Line class

	private Line L1;
	private Line L2;
	private Line L3;
	private Line L4;
	private Line L5;

	// Create a constructor which receives and stores 4 lines when created

	public Rectangle(Line l1, Line l2, Line l3, Line l4) {
		L1 = l1;
		L2 = l2;
		L3 = l3;
		L4 = l4;
		L5 = new Line (new Point(0,0), new Point(0,0));
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

	public Line getL4() {
		return L4;
	}

	// Checks if the order of the Lines to ensure both the .area method, .calcHypotLength
	// and .sidesAreRectangle methods work properly.

	public boolean adjacentLengthDiff () {
		return L1.length() != L2.length();
	}

	// Checks that sides confirm to rectangle expectations.

	public boolean sidesAreRectangle () {
		if (adjacentLengthDiff()) {
			return L1.length() == L3.length() && L2.length() == L4.length();
		}
		return L1.length() == L2.length() && L3.length() == L4.length();
	}

	// Calculates the length of the Hypotenuse for use in the .rightAngleTriangle method

	public double calcHypotLength () {
		if (adjacentLengthDiff()) {
			if (L1.getP1().equals(L2.getP1())) {
				L5 = new Line(L1.getP2(), L2.getP2());
			} else if(L1.getP1().equals(L2.getP2())) {
				L5 = new Line(L1.getP2(), L2.getP1());
			} else if (L1.getP2().equals(L2.getP1())) {
				L5 = new Line(L1.getP1(), L2.getP2());
			} else {
				L5 = new Line(L1.getP1(), L2.getP1());
			}

		} else {
			if (L1.getP1().equals(L3.getP1())) {
				L5 = new Line(L1.getP2(), L3.getP2());
			} else if(L1.getP1().equals(L3.getP2())) {
				L5 = new Line(L1.getP2(), L3.getP1());
			} else if (L1.getP2().equals(L3.getP1())) {
				L5 = new Line(L1.getP1(), L3.getP2());
			} else {
				L5 = new Line(L1.getP1(), L3.getP1());
			}

		}
		return L5.length();
	}

	// Used to check that object is a rectangle and not a parallelogram

	public boolean rightAngleTriangle () {
		if(sidesAreRectangle()) {
			if (adjacentLengthDiff()) {
				double a = Math.pow(L1.length(), 2);
				double b = Math.pow(L2.length(), 2);
				double c = calcHypotLength();
				double test = (a + b) - Math.pow(c, 2);
				return test < 0.00002 && test >= 0;
			} else {
				double a = Math.pow(L1.length(), 2);
				double b = Math.pow(L3.length(), 2);
				double c = calcHypotLength();
				double test = (a + b) - Math.pow(c, 2);
				return test < 0.00002 && test >= 0;
			}
		} return false;
	}

	// Checks that the points given draw a rectangle.

	public boolean isRectangle () {

		int matchCheck1 = 0;
		int matchCheck2 = 0;
		int matchCheck3 = 0;
		int matchCheck4 = 0;

		// Created an array to store all the points from the Rectangle

		Point [] PointArray = new Point[8];
		PointArray[0] = L1.getP1();
		PointArray[1] = L1.getP2();
		PointArray[2] = L2.getP1();
		PointArray[3] = L2.getP2();
		PointArray[4] = L3.getP1();
		PointArray[5] = L3.getP2();
		PointArray[6] = L4.getP1();
		PointArray[7] = L4.getP2();

		// For loop, loops over all the array points and increments matchCheck if match found
		// For an object to join all points should have only 2 point matches

		for(Point x : PointArray) {
			if (x.equals(PointArray[0])) {
				matchCheck1++;
			} if (x.equals(PointArray[1])) {
				matchCheck2++;
			} if (x.equals(PointArray[2])) {
				matchCheck3++;
			} if (x.equals(PointArray[3])) {
				matchCheck4++;
			}
		}

		// Checks if 2 matches where found for each point
		// it then checks if object is a rectangle or a parallelogram

		if (matchCheck1 == 2 && matchCheck2 == 2 && matchCheck3 == 2 && matchCheck4 == 2) {
			return rightAngleTriangle();
		}
		return false;
		}


	//Implement a method which returns the circumference of the rectangle
	public double circumference(){
		if(isRectangle()) {
			return L1.length() + L2.length() + L3.length() + L4.length();
		} else return -1;

	}	

	//Implement a method which returns the area of the rectangle
	public double area() {
		if (isRectangle()) {
			if (adjacentLengthDiff()) {
				return L1.length() * L2.length();
			}
			return L1.length() * L3.length();

		}
		return -1;
	}

	// Implement a method which returns a boolean if the position of 2 rectangles intersect.

	public boolean isIntersecting (Rectangle R1) {

		int i = 0;

		// Created 2 arrays to store each Rectangles Line values

		Line [] secondLineArray = new Line [4];

		secondLineArray[0] = R1.getL1();
		secondLineArray[1] = R1.getL2();
		secondLineArray[2] = R1.getL3();
		secondLineArray[3] = R1.getL4();

		Line [] firstLineArray = new Line [4];

		firstLineArray[0] = L1;
		firstLineArray[1] = L2;
		firstLineArray[2] = L3;
		firstLineArray[3] = L4;

		// Loop the first array over the second array to check if anyone of the lines intersect
		// using the isIntersecting method generated in the Line class

		for(Line x : firstLineArray) {
			while (i < 4) {
				if(x.isIntersecting(secondLineArray[i])){
					return true;
				} else
					i++;
			}
		}
		return false;
	}

}