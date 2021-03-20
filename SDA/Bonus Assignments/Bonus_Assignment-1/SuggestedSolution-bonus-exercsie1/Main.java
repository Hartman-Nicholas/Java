import org.w3c.dom.css.Rect;

public class Main
{
        public static void main(String[] args){
		//Create a square using the Point, Line, and Square classes
		//Print the area and circumference of the square
		//Print using the "System.out.println()" command
                Point p1 = new Point(0,0);
                Point p2 = new Point(0,1);
                Point p3 = new Point(1,1);
                Point p4 = new Point(1,0);

                Line l1 = new Line(p1,p2);
                Line l2 = new Line(p2,p3);
                Line l3 = new Line(p3,p4);
                Line l4 = new Line(p4,p1);

                Line l5 = new Line(p1,p3);
                Rectangle r = new Rectangle(l1,l2,l3,l4);
                Triangle t = new Triangle(l1,l2,l5);

                System.out.println(t.area());
                System.out.println(t.circumference());


        }
}
