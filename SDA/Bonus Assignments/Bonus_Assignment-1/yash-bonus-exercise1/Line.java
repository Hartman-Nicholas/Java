
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

    // Finds the slope of a line
    private double getSlope() {
        return (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    }

    // Checks if a 2d coordinate exists on line
    private boolean existsOnLine(double x, double y){
        boolean xExists = x >= Math.min(this.p1.getX(), this.p2.getX()) && x <= Math.max(this.p1.getX(), this.p2.getX());
        boolean yExists = y >= Math.min(this.p1.getY(), this.p2.getY()) && y <= Math.max(this.p1.getY(), this.p2.getY());
        return xExists && yExists;
    }

    /**
     * Returns the coordinate of the current object in the format (x1,y1) -> (x2,y2)
     * @return String
     */
    @Override
    public String toString(){
        return this.p1.toString()+ " -> "+this.p2.toString();
    }
    /**
     * Returns true if the argument intersects with the current object.
     * This method uses the slope-intercept formula of a line to calculate the intersecting points.
     * @param line the line which is tested with the current object
     * @return {@code true} if the argument intersects with the current object
     */
    public boolean isIntersecting(Line line) {
        double aIntercept, bIntercept, aSlope, bSlope, xIntersect, yIntersect;
        boolean intersect;

        aSlope = this.getSlope();
        //System.out.println("the slope of ab line is: " +aSlope);
        bSlope = line.getSlope();
        //System.out.println("the slope of cd line is: " +bSlope);


        if(aSlope == bSlope){
            // Check for parallel lines, this checks for parallel infinite-slope lines as well
            return false;
        } else if (Double.isInfinite(aSlope) && !Double.isInfinite(bSlope)){
            // If current line has infinity slope and the "line" Line does not, swap their places and return this method again
            return line.isIntersecting(this);
        } else {
            // Get the intercept of the current line
            aIntercept = this.p1.getY() - (aSlope * this.p1.getX());
            //System.out.println("the intercept of ab line is: " +aIntercept);
            if(Double.isInfinite(bSlope)){
                // Assign no intercept for the "line" if its slope is infinite (has line equation x = c) and get the xIntersect
                //System.out.println("do magic");
                xIntersect = line.p1.getX();
                //bIntercept = 0;
            } else{
                /* If slope is real valued get the "line" intercept and calculate
                   the x-coordinate at which the lines can intersect
                */
                bIntercept = line.p1.getY() - (bSlope * line.p1.getX());
                //System.out.println("the intercept of cd line is: " +bIntercept);
                xIntersect = (bIntercept - aIntercept)/(aSlope - bSlope);
            }
        }

        //System.out.println("the intersecting x coordinate is: " +xIntersect);
        // Get the y-coordinate at which the lines can intersect
        yIntersect = (aSlope * xIntersect) + aIntercept;
        //System.out.println("the intersecting y coordinate is: " +yIntersect);
        //Check that intersecting coordinates exist on both the lines
        if(this.existsOnLine(xIntersect, yIntersect) && line.existsOnLine(xIntersect,yIntersect)){
            intersect = true;
            //System.out.println("this happened");
        } else if(this.existsOnLine(xIntersect, yIntersect) && line.existsOnLine(xIntersect, yIntersect)){
            intersect = true;
        } else {
            //System.out.println("don't intersect");
            intersect = false;
        }
        return intersect;
    }
}
