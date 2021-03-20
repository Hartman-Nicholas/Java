public class Main
{
        public static void main(String[] args){
		//Create a square using the Point, Line, and Square classes
		//Print the area and circumference of the square
		//Print using the "System.out.println()" command

            //
            Point a = new Point(1,1);
            Point b = new Point(3,7);
            // infinty < slope < 0
            Line ab = new Line(a, b);

            Point c = new Point(1,5);
            Point d = new Point(4,2);
            // infinty < slope < 0
            Line cd = new Line(c, d);


            Point e = new Point(2,2);
            Point f = new Point(2,7);
            // slope = infinite
            Line ef = new Line(e, f);

            Point g = new Point(5,2);
            // slope = 0
            Line eg = new Line(e, g);


            Point h = new Point(4,7);
            // slope = infinite
            Line dh = new Line(d, h);


            Line bd = new Line(b, d);
            Line dc = new Line(d, c);
            Line ca = new Line(c,a);
            Line ac = new Line(a,c);
            Rectangle rect1 = new Rectangle(ab,cd, ac, bd);

            Point p1 = new Point(2,2);
            Point p2 = new Point(3,4);
            Point p3 = new Point(7,4);
            Point p4 = new Point(7,2);

            Line p12 = new Line(p1, p2);
            Line p23 = new Line(p2, p3);
            Line p34 = new Line(p3, p4);
            Line p41 = new Line(p4, p1);
            Rectangle rect2 = new Rectangle(p12, p23, p34, p41);
            System.out.println("Rectangle intersection: "+rect2.isIntersecting(rect1));
            System.out.println("Area of rectangle is: "+rect2.area());
            System.out.println("Perimeter of rectangle is: "+rect1.perimeter());

            //Use line ac, ab
            Line bc = new Line(b, c);
            Triangle tr1 = new Triangle(ac, ab, bc);

            // Use line ef,
            Point f1 = new Point(7,2);
            Line ef1 = new Line(e, f1);
            Line f1h = new Line(f1, h);
            Line eh = new Line(e, h);
            Triangle tr2 = new Triangle(ef1, f1h, eh);

            System.out.println("Triangle intersection: "+tr1.isIntersecting(tr2));
            System.out.println("Area of triangle is: "+tr1.area());
            System.out.println("Perimeter of triangle is: "+tr2.perimeter());
            //System.out.println(ab.isIntersecting(eg));
        }
}
