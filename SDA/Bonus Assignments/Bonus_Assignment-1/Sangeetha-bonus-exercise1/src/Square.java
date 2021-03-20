public class Square {

    private Line side1;
    private Line side2;
    private Line side3;
    private Line side4;

    public Square(Line s1,Line s2,Line s3,Line s4){
       this.side1 = s1;
       this.side2 = s2;
       this.side3 = s3;
       this.side4 = s4;
    }

    public double areaofsquare(){
          return (side1.xLength() * side1.xLength());
    }

    public double perimeterofsquare(){
        return 4 * side1.xLength();
    }

    public double diagonalofsquare(){
        return side1.xLength() * Math.sqrt(2);
    }

}
