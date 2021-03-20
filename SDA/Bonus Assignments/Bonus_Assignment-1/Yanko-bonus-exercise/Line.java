import java.awt.geom.Line2D;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double distance() {
        return Math.hypot(xLength(), yLength());
    }

    public double xLength() {
        return p1.xDistanceTo(p2);
    }

    public double yLength() {
        return p1.yDistanceTo(p2);
    }

    public static boolean isIntersecting(Line line1, Line line2) {
        boolean result;
        result = Line2D.linesIntersect(line1.p1.getX(), line1.p1.getY(), line1.p2.getX(), line1.p2.getY(), line2.p1.getX(), line2.p1.getY(), line2.p2.getX(), line2.p2.getY());
        return result;
    }


}
