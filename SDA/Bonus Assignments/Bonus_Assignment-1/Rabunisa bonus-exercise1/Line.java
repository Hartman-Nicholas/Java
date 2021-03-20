public class Line {
    public Point p1;
    public Point p2;


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
}
