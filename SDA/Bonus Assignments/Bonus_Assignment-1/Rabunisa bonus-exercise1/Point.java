public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double xDistanceTo(Point p) {
        if (p.x >= x)
            return p.x - x;
        else
            return x - p.x;
    }

    public double yDistanceTo(Point p) {
        if (p.y >= y)
            return p.y - y;
        else
            return y - p.y;
    }
}
