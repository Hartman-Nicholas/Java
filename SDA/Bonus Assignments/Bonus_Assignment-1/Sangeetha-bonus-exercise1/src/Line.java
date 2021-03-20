
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;

public class Line {

    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double length() {
        return Math.hypot(xLength(), yLength());
    }

    public double xLength() {
        return p1.xDistanceTo(p2);
    }

    public double yLength() {
        return p1.yDistanceTo(p2);
    }


    public static boolean isIntersecting(Line line1, Line line2) {

        boolean solution;
        Line2D linee1 = new Line2D.Double(line1.p1.getX(), line1.p1.getY(),line1.p2.getX(), line1.p2.getY());
        Line2D linee2 = new Line2D.Double(line2.p1.getX(), line2.p1.getY(), line2.p2.getX(), line2.p2.getY());
       return solution = linee2.intersectsLine(linee1);
       
    }
}

