public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
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

    // Overriding equals() to compare two Complex objects
    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Point)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Point c = (Point) o;

        // Compare the data members and return accordingly
        return Double.compare(x, c.x) == 0
                && Double.compare(y, c.y) == 0;


    }
}
