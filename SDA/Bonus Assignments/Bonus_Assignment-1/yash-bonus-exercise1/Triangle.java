public class Triangle {
    private Line[] sides;

    public Triangle(Line a, Line b, Line c) {
        this.sides = new Line[] {a, b, c};
    }

    public double perimeter(){
        double perimeter = 0;
        for(Line side: this.sides){
            perimeter += side.length();
        }
        return perimeter;
    }

    public double area(){
        // Uses Heron's formula
        double halfPerimeter = this.perimeter()/2;
        double area = 1;
        for(Line side : sides){
            area *= (halfPerimeter - side.length());
        }
        area = Math.sqrt(halfPerimeter * area);
        return area;
    }

    /**
     * Returns true if the argument intersects with the current object
     * @param tr the line which is tested with the current object
     * @return {@code true} if the argument intersects with the current object
     */
    public boolean isIntersecting(Triangle tr){
        boolean intersects = false;
        for(Line a : this.sides){
            for(Line b : tr.sides){
                if(a.isIntersecting(b)){
                    System.out.println(a.toString()+ " intersects " +b.toString());
                    intersects = true;
                }
            }
        }
        return intersects;
    }
}
