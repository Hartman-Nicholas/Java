package objects;
import static java.lang.Math.sqrt;
public class Triangle {
	private Line lineAB;
	private Line lineBC;
	private Line lineCA;
	
	public Triangle(Line lineAB, Line lineBC, Line lineCA) {
		this.lineAB = lineAB;
		this.lineBC = lineBC;
		this.lineCA = lineCA;
	}
	
	public double perimeter() {
		return this.lineAB.length() + this.lineBC.length() + this.lineCA.length();
	}
	
	public double area() {
		double half_perimeter = (lineAB.length()+lineBC.length()+lineCA.length())/2;
		
        return sqrt(half_perimeter*(half_perimeter-lineAB.length())*(half_perimeter-lineBC.length())*(half_perimeter-lineCA.length()));
	}
	
	public void printTriangle(String name) {
		System.out.println("###################################");
		System.out.printf("%s: \n", name);
		System.out.printf("\tBase length: %.4s \n", this.lineAB.length());
		System.out.printf("\tHeight : %.4s \n", this.lineBC.xLength());
		System.out.printf("\tLine BC length: %.4s \n", this.lineBC.length());
		System.out.printf("\tLine CA length: %.4s \n", this.lineCA.length());
		System.out.printf("\tThe perimeter is: %.4s \n", perimeter());
		System.out.printf("\tThe area is: %.4s \n", area());
		System.out.println("###################################");
	}
}
