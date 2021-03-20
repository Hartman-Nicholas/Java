package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import application.Exceptions.ShapeException;
import objects.Line;
import objects.Point;
import objects.Rectangle;
import objects.ShapesList;
import objects.Triangle;

public class App extends Exception {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws ShapeException {
		Locale.setDefault(new Locale("es", "US"));
		Scanner scanner = new Scanner(System.in);

		System.out.print("Choose a shape:(Rectangle, Line, Square, Triangle) > ");
		String user_input = scanner.next();
		ShapesList shapesList = new ShapesList("Rectangle", "Line", "Square", "Triangle");

		if (!shapesList.contains(user_input)) {
			scanner.close();
			throw new ShapeException("Invalid shape");
		} else {

			switch (user_input) {
			case "Triangle":
				ArrayList<Double> coordinates = new ArrayList<>();
				ArrayList<Point> points = new ArrayList<>();
				ArrayList<Line> lines = new ArrayList<>();

				int index = 0;
				double point;

				// For receiving coordinates and store them in a array List:
				try {
					for (int i = 0; i < 12; i = i + 2) {
						System.out.printf("Enter point %d (x) > ", i);
						point = scanner.nextDouble();
						coordinates.add(i, point);
						System.out.printf("Enter point %d (y) > ", i + 1);
						point = scanner.nextDouble();
						coordinates.add(i + 1, point);
					}
				} catch (Exception InputMismatchException) {
					System.out.println("Invalid input - try agian!");
				}

				// For generating points from the received coordinates:
				for (int i = 0; i <= 10; i = i + 2) {
					points.add(index, new Point(coordinates.get(i), coordinates.get(i + 1)));
					index++;
				}

				// Generating lines from the points:
				index = 0;
				for (int i = 0; i <= 4; i = i + 2) {
					lines.add(index, new Line(points.get(i), points.get(i + 1)));
					index++;
				}

				// Generating areas and circumference from lines:
				Triangle triangle = new Triangle(lines.get(0), lines.get(1), lines.get(2));
				triangle.area();
				triangle.perimeter();
				triangle.printTriangle("The triangle's data");

				break;

			case "Square":

				ArrayList<Double> sqr_coordinates = new ArrayList<>();
				ArrayList<Point> sqr_points = new ArrayList<>();
				ArrayList<Line> sqr_lines = new ArrayList<>();

				int sqr_index = 0;
				double sqr_point;
				int sqr_coordinates_index = 0;
				// For receiving coordinates and store them in a array List:
				try {
					for (int i = 0; i < 16; i = i + 2) {
						System.out.printf("Enter point %d (x) > ", sqr_coordinates_index);
						sqr_point = scanner.nextDouble();
						sqr_coordinates.add(i, sqr_point);
						System.out.printf("Enter point %d (y) > ", sqr_coordinates_index);
						sqr_point = scanner.nextDouble();
						sqr_coordinates.add(i + 1, sqr_point);
						sqr_coordinates_index++;
					}

				} catch (Exception InputMismatchException) {
					System.out.println("Invalid input - try again!");
				}

				// For generating points from the received coordinates:
				for (int i = 0; i <= 14; i = i + 2) {
					sqr_points.add(sqr_index, new Point(sqr_coordinates.get(i), sqr_coordinates.get(i + 1)));
					sqr_index++;
				}

				// Generating lines from the points:
				sqr_index = 0;
				for (int i = 0; i <= 6; i = i + 2) {
					sqr_lines.add(sqr_index, new Line(sqr_points.get(i), sqr_points.get(i + 1)));
					sqr_index++;
				}

				// Generating areas and circumference from lines:
				Rectangle square = new Rectangle(sqr_lines.get(0), sqr_lines.get(1), sqr_lines.get(2),
						sqr_lines.get(3));
				square.area();
				square.perimeter();
				square.printRectangle("The Rectangle's data");

				break;

			case "Rectangle":

				ArrayList<Double> rct_coordinates = new ArrayList<>();
				ArrayList<Point> rct_points = new ArrayList<>();
				ArrayList<Line> rct_lines = new ArrayList<>();

				System.out.print("How many Lines you want to create(1-2)? >");
				int loopLimit = scanner.nextInt();

				int rct_index = 0;
				double rct_point;
				int rct_coordinates_index = 0;
				// For receiving and storing coordinates:
				try {
					for (int i = 0; i < 16 * loopLimit; i = i + 2) {
						System.out.printf("Enter point %d (x) > ", rct_coordinates_index);
						rct_point = scanner.nextDouble();
						rct_coordinates.add(i, rct_point);
						System.out.printf("Enter point %d (y) > ", rct_coordinates_index);
						rct_point = scanner.nextDouble();
						rct_coordinates.add(i + 1, rct_point);
						rct_coordinates_index++;
					}

				} catch (Exception InputMismatchException) {
					System.out.println("Invalid input - try again!");
					;
				}
				rct_coordinates.forEach(e -> System.out.println(e));
				// For generating points from the received coordinates:
				for (int i = 0; i <= (16 * loopLimit) - 1; i = i + 2) {
					rct_points.add(rct_index, new Point(rct_coordinates.get(i), rct_coordinates.get(i + 1)));
					rct_index++;
				}
				rct_points.forEach(e -> System.out.println(e.getX() + ", " + e.getY()));

				// For generating lines from the points:
				if (loopLimit == 2) {
					List<Point> rct2_points = rct_points.subList(7, 15);

					rct_index = 0;
					for (int i = 0; i <= 6; i = i + 2) {
						rct_lines.add(rct_index, new Line(rct_points.get(i), rct_points.get(i + 1)));

						rct_index++;
					}
					rct_index = 0;
					for (int i = 0; i <= 6; i = i + 2) {
						rct_lines.add(rct_index, new Line(rct2_points.get(i), rct2_points.get(i + 1)));

						rct_index++;
					}
					rct_lines.forEach(e -> e.length());
					// Generating areas and circumference from lines:
					Rectangle rectangle = new Rectangle(rct_lines.get(0), rct_lines.get(1), rct_lines.get(2),
							rct_lines.get(3));
					rectangle.area();
					rectangle.perimeter();
					rectangle.printRectangle("The Rectangle's data");
					if (loopLimit == 2) {
						Rectangle rectangle2 = new Rectangle(rct_lines.get(4), rct_lines.get(5), rct_lines.get(6),
								rct_lines.get(7));
						rectangle2.area();
						rectangle2.perimeter();
						rectangle2.printRectangle("The Second rectangle's data");
						rectangle.isIntersecting(rectangle2);
					}

				} else {
					rct_index = 0;
					for (int i = 0; i <= 6 * loopLimit; i = i + 2) {
						rct_lines.add(rct_index, new Line(rct_points.get(i), rct_points.get(i + 1)));

						rct_index++;
					}
					rct_lines.forEach(e -> e.length());
					// Generating areas and circumference from lines:
					Rectangle rectangle = new Rectangle(rct_lines.get(0), rct_lines.get(1), rct_lines.get(2),
							rct_lines.get(3));
					rectangle.area();
					rectangle.perimeter();
					rectangle.printRectangle("The Rectangle's data");
				}

				break;

			case "Line":
				ArrayList<Double> ln_coordinates = new ArrayList<>();
				ArrayList<Point> ln_points = new ArrayList<>();
				ArrayList<Line> ln_lines = new ArrayList<>();

				System.out.print("How many Lines you want to create? >");
				int loop_limit = scanner.nextInt();

				int ln_index = 0;
				int coordinates_index = 0;
				double ln_point;

				// For receiving coordinates and store them in a array List:
				try {
					for (int i = 0; i < 4 * loop_limit; i = i + 2) {
						System.out.printf("Enter point %d (x) > ", coordinates_index);
						ln_point = scanner.nextDouble();
						ln_coordinates.add(i, ln_point);
						System.out.printf("Enter point %d (y) > ", coordinates_index);
						ln_point = scanner.nextDouble();
						ln_coordinates.add(i + 1, ln_point);
						coordinates_index++;
					}
				} catch (Exception InputMismatchException) {
					System.out.println("Invalid input - try again!");
					;
				}

				// For generating points from the received coordinates:
				for (int i = 0; i < (4 * loop_limit) - 1; i = i + 2) {
					ln_points.add(ln_index, new Point(ln_coordinates.get(i), ln_coordinates.get(i + 1)));
					ln_index++;
				}
				ln_points.forEach(e -> System.out.println(e.getX() + ", " + e.getY()));

				// For generating lines from the generated points:
				ln_index = 0;
				for (int i = 0; i < 2 * loop_limit; i = i + 2) {
					ln_lines.add(ln_index, new Line(ln_points.get(i), ln_points.get(i + 1)));
					ln_index++;
				}

				ln_lines.forEach(e -> e.printLine());
				break;
			}
			scanner.close();
		}
	}

}
