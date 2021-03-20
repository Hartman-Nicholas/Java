public class Triangle {
    private Line side1;
    private Line side2;
    private Line opposite;

    public Triangle(Line adj1, Line adj2, Line opp) {

        this.side1 = adj1;
        this.side2 = adj2;
        this.opposite = opp;
    }


    public double calculateHypotenuseway1() {
        return Math.sqrt((side1.xLength() * side1.xLength()) + (side2.yLength() *side2.yLength() ));
    }

    public double calculateHypotenuseway2() {
        return Math.pow(Math.pow(side1.xLength(), 2) + Math.pow(side2.yLength(), 2), 0.5);
    }

    public double perimeteroftriangle() {
        double hypotenuse = calculateHypotenuseway1();
        return side1.xLength() + side2.yLength() + hypotenuse;
    }

    public double areaoftriangle(){
        return (0.5)* side1.xLength() * side2.yLength();

    }
}
