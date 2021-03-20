public class Line
{
   private Point p1;
   private Point p2;
   
   public Line(Point p1, Point p2){
	this.p1=p1;
	this.p2=p2;
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

   //Alternative 1: use logical math based approach similar to https://stackoverflow.com/a/3838357
   //Alternative 2: use library Line2D with intersectsLine method found here:
    //https://docs.oracle.com/javase/7/docs/api/java/awt/geom/Line2D.html#intersectsLine(double,%20double,%20double,%20double)
    public boolean isIntersecting(Line l){ //...
        return ccw(p1,l.p1,l.p2) != ccw(p2,l.p1,l.p2) && ccw(p1,p2,l.p1) != ccw(p1,p2,l.p2);
    }
    private static boolean ccw(Point a, Point b, Point c){
       return (c.getY()-a.getY())*(b.getX()-a.getX()) > (b.getY()-a.getY())*(c.getX()-a.getX());
    }
}
