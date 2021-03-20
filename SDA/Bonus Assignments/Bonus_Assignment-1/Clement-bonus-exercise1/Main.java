package shapes;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Which shape are we working with? :\n 1- Rectangle \n 2- Triangle  ");

		int userChoice = sc.nextInt();

		if (userChoice == 1) {   //Rectangle calculation
			try {
				// input user
				System.out.print("Enter  coordinates of first point of the rectangle : ");

				double x1 = sc.nextInt();
				double y1 = sc.nextInt();

				System.out.print("Enter  coordinates of second point of the rectangle: ");

				double x2 = sc.nextInt();
				double y2 = sc.nextInt();

				System.out.print("Enter  coordinates of third point of the rectangle : ");

				double x3 = sc.nextInt();
				double y3 = sc.nextInt();

				System.out.print("Enter  coordinates of fourth point of the rectangle : ");

				double x4 = sc.nextInt();
				double y4 = sc.nextInt();

				// Create/ instantiate a rectangle using the Point, Line, and SqRectangle
				// classes

				Point pA = new Point(x1, y1);
				Point pB = new Point(x2, y2);
				Point pC = new Point(x3, y3);
				Point pD = new Point(x4, y4);

				Line lA = new Line(pA, pB);
				Line lB = new Line(pB, pC);
				Line lC = new Line(pC, pD);
				Line lD = new Line(pD, pA);

				Rectangle rectangleUser = new Rectangle(lA, lB, lC, lD);

				// check if it is a Rectangle

				boolean isPerpendicular = Rectangle.areContiguousPerpendicular(lA, lB);
				System.out.println(
						"Here we go:\nIs angle between 2 contiguous lines perpendicular? : " + isPerpendicular);

				boolean isParallel = Rectangle.areOppositeParallel(lA, lC);
				System.out.println("Are opposite lines parallels? : " + isParallel);

				boolean isRect = Rectangle.isRectangle(rectangleUser);
				System.out.println("\nIs it a rectangle? " + isRect + "\n");

				if (isRect) {
					// Print the area and circumference of the square
					double perimeter = Rectangle.circumference(rectangleUser);
					System.out.println("the perimeter is : " + perimeter);

					// Print using the "System.out.println()" command
					double area = Rectangle.area(rectangleUser);
					System.out.println("the area is : " + area);
				} else {
					System.out.println("Well the given points did not draw a rectangle bro, sorry :( try again ");
				}

			}

			catch (Exception e) {
				System.out.println("Invalid data entered, please insert numbers ");

			}
		}else if (userChoice == 2) { //Triangle calculation
			
			try {
				System.out.print("Enter  coordinates of first point of the triangle : ");
			

			double x1 = sc.nextInt();
			double y1 = sc.nextInt();

			System.out.print("Enter  coordinates of second point of the triangle: ");

			double x2 = sc.nextInt();
			double y2 = sc.nextInt();

			System.out.print("Enter  coordinates of third point of the triangle : ");

			double x3 = sc.nextInt();
			double y3 = sc.nextInt();
			
			// Create/ instantiate a rectangle using the Point, Line, and Triangle
			// classes

			Point pA = new Point(x1, y1);
			Point pB = new Point(x2, y2);
			Point pC = new Point(x3, y3);
			

			Line lA = new Line(pA, pB);
			Line lB = new Line(pB, pC);
			Line lC = new Line(pC, pA);
			
			Triangle triangleUser = new Triangle(lA, lB, lC);
			
			
			// check if the triangle is correct:
			boolean isTriangleCorrect = Triangle.isTriangle(triangleUser);
					
			if (isTriangleCorrect) {
				// Print the area and circumference of the triangle
				

				double perimeter = Triangle.circumference(triangleUser);
				System.out.println("the perimeter is : " + perimeter);	

				double area = Triangle.area(triangleUser);
				System.out.println("the area is : " + area);
				
		

			} else {
				System.out.println("Well the point does not draw a proper triangle... ");
			}
			}
			catch (Exception e) {
				System.out.println("Invalid data entered, please insert numbers ");

			}
			
			
		}else {
			System.out.println("Please make a choice between possible options. ");	
		}

		
		
	}
}
