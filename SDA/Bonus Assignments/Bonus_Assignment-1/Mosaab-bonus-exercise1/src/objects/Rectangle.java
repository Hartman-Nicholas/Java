package objects;

public class Rectangle {
	private Line lineAB;
	private Line lineBC;
	private Line lineCD;
	private Line lineDA;

	public Rectangle(Line lineAB, Line lineBC, Line lineCD, Line lineDA) {
		this.lineAB = lineAB;
		this.lineBC = lineBC;
		this.lineCD = lineCD;
		this.lineDA = lineDA;
	}

	public double perimeter() {
		return lineAB.length() + lineBC.length() + lineCD.length() + lineDA.length();
	}

	public double area() {
		return lineAB.length() * lineBC.length();
	}

	public boolean isIntersecting(Rectangle r2) {
		double line_B_X = r2.lineAB.getP2().getX();
		double line_B_Y = r2.lineAB.getP2().getY();
		double line_D_X = r2.lineCD.getP2().getX();
		double line_D_Y = r2.lineCD.getP2().getY();

		if (lineDA.getP1().getX() < line_B_X && lineAB.getP2().getX() > line_D_X && lineDA.getP1().getY() > line_B_Y
				&& lineAB.getP2().getY() < line_D_Y) {
			System.out.println("###################################");
			System.out.println("Intersect!");
			System.out.println("###################################");
			return true;
		}
		System.out.println("###################################");
		System.out.println("Do ot Intersect!");
		System.out.println("###################################");
		return false;
	}

	public void printRectangle(String name) {
		System.out.println("###################################");
		System.out.printf("%s: \n", name);
		System.out.printf("\tLine AB length: %.4s \n", this.lineAB.length());
		System.out.printf("\tLine BC length: %.4s \n", this.lineBC.length());
		System.out.printf("\tLine CD length: %.4s \n", this.lineCD.length());
		System.out.printf("\tLine DA length: %.4s \n", this.lineDA.length());
		System.out.printf("\tThe perimeter is: %.4s \n", perimeter());
		System.out.printf("\tThe area is: %.4s \n", area());
		System.out.println("###################################");
	}
}
