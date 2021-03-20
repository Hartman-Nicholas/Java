public class Triangle {
    private Line l1;
    private Line l2;
    private Line l3;

    public Triangle(Line l1, Line l2, Line l3){
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public double circumference(){
        return l1.length() + l2.length() + l3.length();
    }

    public double area(){
        double s = circumference()/2;
        return Math.sqrt(s*(s-l1.length())*(s-l2.length())*(s-l3.length()));
    }

    public boolean isIntersecting(Triangle t){
        return (l1.isIntersecting(t.l1) || l1.isIntersecting(t.l2) || l1.isIntersecting(t.l3))
                || (l2.isIntersecting(t.l1) || l2.isIntersecting(t.l2) || l2.isIntersecting(t.l3))
                || (l3.isIntersecting(t.l1) || l3.isIntersecting(t.l2) || l3.isIntersecting(t.l3));
    }
}
