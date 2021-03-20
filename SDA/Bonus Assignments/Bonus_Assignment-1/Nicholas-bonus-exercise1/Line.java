public class Line
{
   private Point p1;
   private Point p2;
   
   public Line(Point p1, Point p2){
	this.p1=p1;
	this.p2=p2;
   }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }


    public boolean isIntersecting (Line l1) {

        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        double x3 = l1.getP1().getX();
        double y3 = l1.getP1().getY();
        double x4 = l1.getP2().getX();
        double y4 = l1.getP2().getY();

//        System.out.println("X1 - " + x1);
//        System.out.println("Y1 - " + y1);
//        System.out.println("X2 - " + x2);
//        System.out.println("Y2 - " + y2);
//        System.out.println("X3 - " + x3);
//        System.out.println("Y3 - " + y3);
//        System.out.println("X4 - " + x4);
//        System.out.println("Y4 - " + y4);

        // Calculates the slope of the line to generate the m value for the line y = mx + b

        double slopeLineOne = (y2 - y1) / (x2 - x1);
        double slopeLineTwo = (y4 - y3) / (x4 - x3);

//        System.out.println("slopeLineOne " + slopeLineOne);
//        System.out.println("SlopeLineTwo " + slopeLineTwo);

        // Calculates the b value

        double bLineOne = y1 - slopeLineOne * x1;
        double bLineTwo = y3 - slopeLineTwo * x3;

//        System.out.println("bLineOne " + bLineOne);
//        System.out.println("bLineTwo " + bLineTwo);

        // Calculates the x intersect.

        double bLine = (bLineTwo - bLineOne);
        double slopeLine = (slopeLineTwo - slopeLineOne);

        double intersectX = (bLine / slopeLine) * -1;
//        double intersectY = (slopeLineOne * intersectX + bLineOne);

//        System.out.println("IntersectX" + intersectX);
//        System.out.println("IntersectY" + intersectY);

        // Below if statement checks the following.
        // That the line is not compared against itself
       if (l1 == this) {
           return false;
       }
       // If the line is a vertical or horizontal line
       else if (Double.isInfinite(slopeLineOne) && Double.isInfinite(slopeLineTwo)) {
            return false;
        } else if (Double.isInfinite((slopeLineOne))) {
            if (x3 > x4) {
                return x3 >= x1 && x4 <= x1;
            } else {
                return x3 <= x1 && x4 >= x1;
            }

        } else if (Double.isInfinite(slopeLineTwo)) {
            if (x1 > x2) {
                return x1 >= x3 && x2 <= x3;
            } else {
                return x1 <= x3 && x2 >= x3;
            }
        }
       // Checks if the intersectX falls within the Line range

        else if (x1 > x2) {
            return x1 >= intersectX && x2 <= intersectX;
        }

        else {
            return x1 <= intersectX && x2 >= intersectX;
        }
    }

    public double length(){
	return Math.hypot(xLength(), yLength());
   }

   public double xLength(){
       return p1.xDistanceTo(p2);
   }

   public double yLength(){
       return p1.yDistanceTo(p2);
   }
}
