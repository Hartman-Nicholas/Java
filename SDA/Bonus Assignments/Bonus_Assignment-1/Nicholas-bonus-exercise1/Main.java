

public class Main
{
        public static void main(String[] args){

                // RECTANGLE
                // this is a standard rectangle draw correctly that checks basic
                // functionality of .circumference and .area methods.

                Point point0 = new Point(1, 1);
                Point point1 = new Point(4,1);
                Point point2 = new Point(4, 1);
                Point point3 = new Point(4,4);
                Point point4 = new Point(4, 4);
                Point point5 = new Point(1,4);
                Point point6 = new Point(1, 4);
                Point point7 = new Point(1,1);

                Line line0 = new Line(point0, point1);
                Line line1 = new Line(point2, point3);
                Line line2 = new Line(point4, point5);
                Line line3 = new Line(point6, point7);

                Rectangle rectangle1 = new Rectangle(line0, line1, line2, line3);

                System.out.println();
                System.out.println("Standard Rectangle");
                System.out.println("Rectangles1 circumference is " + rectangle1.circumference());
                System.out.println("Rectangles1 area is " + rectangle1.area());
                System.out.println("Checks if rectangle1 is a rectangle " + rectangle1.isRectangle());
                System.out.println("Checks if rectangle1 adjacent sides are different " + rectangle1.adjacentLengthDiff());
                System.out.println("Checks if rectangle1 has right angles " + rectangle1.rightAngleTriangle());
                System.out.println();

                // PARALLELOGRAM
                // creates a block but it is not a square this is to check the
                // isRectangle method is working properly.

                Point point8 = new Point(2, 2);
                Point point9 = new Point(6,2);
                Point point10 = new Point(6, 2);
                Point point11 = new Point(9,5);
                Point point12 = new Point(9, 5);
                Point point13 = new Point(3,5);
                Point point14 = new Point(3, 5);
                Point point15 = new Point(2,2);

                Line line4 = new Line(point8, point9);
                Line line5 = new Line(point10, point11);
                Line line6 = new Line(point12, point13);
                Line line7 = new Line(point14, point15);

                Rectangle parallelogram = new Rectangle(line4, line5, line6, line7);

                System.out.println("Parallelogram");
                System.out.println("Parallelogram circumference is " + parallelogram.circumference());
                System.out.println("Parallelogram area is " + parallelogram.area());
                System.out.println("Checks if parallelogram is a rectangle " + parallelogram.isRectangle());
                System.out.println("Checks if parallelogram adjacent sides are different " + parallelogram.adjacentLengthDiff());
                System.out.println("Checks if parallelogram has right angles " + parallelogram.rightAngleTriangle());
                System.out.println();

                // RECTANGLE SIDE TRICK
                // Line 2 is horizontal to Line 1 and Line 3 and Line 4 join
                // the rectangle. This is to check that the adjacentSideDiff method is working properly, when
                // using the .area method.

                Point point16 = new Point(1, 1);
                Point point17 = new Point(6,1);
                Point point18 = new Point(1, 4);
                Point point19 = new Point(6,4);
                Point point20 = new Point(1, 1);
                Point point21 = new Point(1,4);
                Point point22 = new Point(6, 4);
                Point point23 = new Point(6,1);

                Line line8 = new Line(point16, point17);
                Line line9 = new Line(point18, point19);
                Line line10 = new Line(point20, point21);
                Line line11 = new Line(point22, point23);

                Rectangle rectangleSideTrick = new Rectangle(line8, line9, line10, line11);

                System.out.println("Rectangle with Line 1 and Line 2 equal and Line 3 and Line 4 equal");
                System.out.println("RectangleSideTrick circumference is " + rectangleSideTrick.circumference());
                System.out.println("RectangleSideTrick area is " + rectangleSideTrick.area());
                System.out.println("Checks if rectangleSideTrick is a rectangle " + rectangleSideTrick.isRectangle());
                System.out.println("Checks if rectangleSideTrick adjacent sides are different " + rectangleSideTrick.adjacentLengthDiff());
                System.out.println("Checks if rectangleSideTrick has right angles " + rectangleSideTrick.rightAngleTriangle());
                System.out.println();

                // RECTANGLE UNEVEN SIDES
                // Line 3 is longer than Line 1 but still connects. so
                // should fail the is a rightAngle Test.


                Point point24 = new Point(1, 1);
                Point point25 = new Point(4,1);
                Point point26 = new Point(4, 1);
                Point point27 = new Point(6,5);
                Point point28 = new Point(6, 5);
                Point point29 = new Point(1,5);
                Point point30 = new Point(1, 5);
                Point point31 = new Point(1,1);

                Line line12 = new Line(point24, point25);
                Line line13 = new Line(point26, point27);
                Line line14 = new Line(point28, point29);
                Line line15 = new Line(point30, point31);

                Rectangle rectangleUnEvenSides = new Rectangle(line12, line13, line14, line15);

                System.out.println("Not a rectangle 4 uneven sides connected");
                System.out.println("RectangleUnEvenSides circumference is " + rectangleUnEvenSides.circumference());
                System.out.println("RectangleUnEvenSides area is " + rectangleUnEvenSides.area());
                System.out.println("Checks if rectangleUnEvenSides is a rectangle " + rectangleUnEvenSides.isRectangle());
                System.out.println("Checks if rectangleUnEvenSides adjacent sides are different " + rectangleUnEvenSides.adjacentLengthDiff());
                System.out.println("Checks if rectangleUnEvenSides has right angles " + rectangleUnEvenSides.rightAngleTriangle());
                System.out.println();


                // TRIANGLE
                // No tricks with Triangles!! Lines just need to connect.
                // First example with connected lines.

                Point point32 = new Point(1, 1);
                Point point33 = new Point(4,1);
                Point point34 = new Point(4, 1);
                Point point35 = new Point(2,6);
                Point point36 = new Point(2, 6);
                Point point37 = new Point(1,1);


                Line line16 = new Line(point32, point33);
                Line line17 = new Line(point34, point35);
                Line line18 = new Line(point36, point37);

                Triangle triangle = new Triangle(line16, line17, line18);

                System.out.println("Standard Triangle");
                System.out.println("Triangles circumference is " + triangle.circumference());
                System.out.println("Triangles area is " + triangle.area());
                System.out.println("Checks if triangle is a triangle " + triangle.isTriangle());
                System.out.println();

                // TRIANGLE DISCONNECTED
                // Lines are not connected checking isTriangle method.

                Point point38 = new Point(1, 1);
                Point point39 = new Point(7,1);
                Point point40 = new Point(8, 1);
                Point point41 = new Point(2,9);
                Point point42 = new Point(3, 6);
                Point point43 = new Point(5,8);

                Line line19 = new Line(point38, point39);
                Line line20 = new Line(point40, point41);
                Line line21 = new Line(point42, point43);

                Triangle triangleDisconnected = new Triangle(line19, line20, line21);

                System.out.println("Disconnected Triangle");
                System.out.println("Triangles circumference is " + triangleDisconnected.circumference());
                System.out.println("Triangles area is " + triangleDisconnected.area());
                System.out.println("Checks if triangleDisconnected is a triangle " + triangleDisconnected.isTriangle());
                System.out.println();


                // LINE INTERSECTION
                // Checking for intersection of 2 sloped Lines

                Point point44 = new Point(32, 32);
                Point point45 = new Point(29,5);
                Point point46 = new Point(15, 10);
                Point point47 = new Point(49,25);

                Line line22 = new Line(point44, point45);
                Line line23 = new Line(point46, point47);

                System.out.println("Line Intersection bothSloped");
                System.out.println("Line Intersection " + line22.isIntersecting(line23));
                System.out.println();


                // VERTICAL LINE AND SLOPED LINE
                // Checking for intersection of vertical line and slopedLine

                Point point48 = new Point(3, 1);
                Point point49 = new Point(3,6);
                Point point50 = new Point(1, 1);
                Point point51 = new Point(4,5);

                Line line24 = new Line(point48, point49);
                Line line25 = new Line(point50, point51);

                System.out.println("Line Intersection VerticalLine and SlopeLine");
                System.out.println("Line Intersection " + line24.isIntersecting(line25));
                System.out.println();


                // HORIZONTAL LINE AND SLOPED LINE
                // Checking for intersection of Horizontal line and slopedLine

                Point point52 = new Point(1, 3);
                Point point53 = new Point(4,3);
                Point point54 = new Point(2, 1);
                Point point55 = new Point(3,5);

                Line line26 = new Line(point52, point53);
                Line line27 = new Line(point54, point55);

                System.out.println("Line Intersection HorizontalLine and SlopeLine");
                System.out.println("Line Intersection " + line26.isIntersecting(line27));
                System.out.println();

                // LINES THAT DONT INTERSECT
                // Checking lines that dont intersect

                Point point56 = new Point(1, 4);
                Point point57 = new Point(1,8);
                Point point58 = new Point(3, 5);
                Point point59 = new Point(3,9);

                Line line28 = new Line(point56, point57);
                Line line29 = new Line(point58, point59);

                System.out.println("Line Intersection dont intersect");
                System.out.println("Line Intersection " + line28.isIntersecting(line29));
                System.out.println();


                // RECTANGLE INTERSECTS
                // Checking if rectangles intersect uses rectangle1 and rectangleIntersect
                // created to intersect
                // should return true.


                // Points for rectangle1 for reference purposes only DO NOT comment out!
                // Point point0 = new Point(1, 1);
                // Point point1 = new Point(4,1);
                // Point point2 = new Point(4, 1);
                // Point point3 = new Point(4,4);
                // Point point4 = new Point(4, 4);
                // Point point5 = new Point(1,4);
                // Point point6 = new Point(1, 4);
                // Point point7 = new Point(1,1);

                Point point60 = new Point(3, 3);
                Point point61 = new Point(7,3);
                Point point62 = new Point(7, 3);
                Point point63 = new Point(7,-2);
                Point point64 = new Point(7, -2);
                Point point65 = new Point(3,-2);
                Point point66 = new Point(3, -2);
                Point point67 = new Point(3,3);

                Line line30 = new Line(point60, point61);
                Line line31 = new Line(point62, point63);
                Line line32 = new Line(point64, point65);
                Line line33 = new Line(point66, point67);

                Rectangle rectangleIntersect= new Rectangle(line30, line31, line32, line33);

                System.out.println("Rectangles that Intersect");
                System.out.println("RectangleIntersect circumference is " + rectangleIntersect.circumference());
                System.out.println("RectangleIntersect area is " + rectangleIntersect.area());
                System.out.println("Checks if rectangleIntersect is a rectangle " + rectangleIntersect.isRectangle());
                System.out.println("Checks if rectangleIntersect adjacent sides are different " + rectangleIntersect.adjacentLengthDiff());
                System.out.println("Checks if rectangleIntersect has right angles " + rectangleIntersect.rightAngleTriangle());
                System.out.println("Checks if rectangleIntersect intersects with rectangle1 " + rectangleIntersect.isIntersecting(rectangle1));
                System.out.println();

                // RECTANGLE DOES NOT INTERSECT
                // Checking if rectangles intersect uses rectangle1 and rectangleNotIntersect
                // created to not intersect
                // should return false.

                Point point68 = new Point(5, 3);
                Point point69 = new Point(7,3);
                Point point70 = new Point(7, 3);
                Point point71 = new Point(7,-2);
                Point point72 = new Point(7, -2);
                Point point73 = new Point(5,-2);
                Point point74 = new Point(5, -2);
                Point point75 = new Point(5,3);

                Line line34 = new Line(point68, point69);
                Line line35 = new Line(point70, point71);
                Line line36 = new Line(point72, point73);
                Line line37 = new Line(point74, point75);

                Rectangle rectangleNotIntersect= new Rectangle(line34, line35, line36, line37);

                System.out.println("Rectangles that Do Not Intersect");
                System.out.println("RectangleNotIntersect circumference is " + rectangleIntersect.circumference());
                System.out.println("RectangleNotIntersect area is " + rectangleIntersect.area());
                System.out.println("Checks if rectangleNotIntersect is a rectangle " + rectangleNotIntersect.isRectangle());
                System.out.println("Checks if rectangleNotIntersect adjacent sides are different " + rectangleNotIntersect.adjacentLengthDiff());
                System.out.println("Checks if rectangleNotIntersect has right angles " + rectangleNotIntersect.rightAngleTriangle());
                System.out.println("Checks if rectangleNotIntersect intersects with rectangle1 " + rectangleNotIntersect.isIntersecting(rectangle1));
                System.out.println();

                // TRIANGLES THAT INTERSECT
                // Checking if triangles intersect uses triangle and triangleIntersect
                // created to intersect
                // should return true


                // Points of triangle for reference purposes only DO NOT comment out!
                // Point point32 = new Point(1, 1);
                // Point point33 = new Point(4,1);
                // Point point34 = new Point(4, 1);
                // Point point35 = new Point(2,6);
                // Point point36 = new Point(2, 6);
                // Point point37 = new Point(1,1);


                Point point76 = new Point(2, 2);
                Point point77 = new Point(6,2);
                Point point78 = new Point(6, 2);
                Point point79 = new Point(3,7);
                Point point80 = new Point(3, 7);
                Point point81 = new Point(2,2);


                Line line38 = new Line(point76, point77);
                Line line39 = new Line(point78, point79);
                Line line40 = new Line(point80, point81);

                Triangle triangleIntersect = new Triangle(line38, line39, line40);

                System.out.println("Triangles that Intersect");
                System.out.println("Triangles circumference is " + triangleIntersect.circumference());
                System.out.println("Triangles area is " + triangleIntersect.area());
                System.out.println("Checks if triangleIntersect is a triangle" + triangleIntersect.isTriangle());
                System.out.println("Checks if triangle intersects with triangleIntersect " + triangleIntersect.isIntersecting(triangle));
                System.out.println();

                // TRIANGLES THAT DO NOT INTERSECT
                // Checking if triangles intersect uses triangle and triangleNotIntersect
                // created to not intersect
                // should return false

                Point point82 = new Point(6, 1);
                Point point83 = new Point(12,1);
                Point point84 = new Point(12, 1);
                Point point85 = new Point(9,9);
                Point point86 = new Point(9, 9);
                Point point87 = new Point(6,1);


                Line line41 = new Line(point82, point83);
                Line line42 = new Line(point84, point85);
                Line line43 = new Line(point86, point87);

                Triangle triangleNotIntersect = new Triangle(line41, line42, line43);

                System.out.println("Triangles that do not Intersect");
                System.out.println("Triangles circumference is " + triangleNotIntersect.circumference());
                System.out.println("Triangles area is " + triangleNotIntersect.area());
                System.out.println("Checks if triangleNotIntersect is a triangle" + triangleNotIntersect.isTriangle());
                System.out.println("Checks if triangle intersects with triangleNotIntersect " + triangleNotIntersect.isIntersecting(triangle));
                System.out.println();


































		//Create a square using the Point, Line, and Square classes
		//Print the area and circumference of the square
		//Print using the "System.out.println()" command
		
        }
}
