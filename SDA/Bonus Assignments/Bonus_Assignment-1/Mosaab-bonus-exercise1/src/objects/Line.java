package objects;

public class Line {
	private Point p1;
	private Point p2;
	private int id;
	private static int count = 0;

	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
		this.id = count;
		count++;
	}

	public Point getP1() {
		return this.p1;
	}

	public Point getP2() {
		return this.p2;
	}

	public double xLength() {
		return p1.xDistanceTo(p2);
	}

	public double yLength() {
		return p1.yDistanceTo(p2);
	}

	public double length() {
		return Math.hypot(xLength(), yLength());
	}

	public void printLine() {
		System.out.println("###################################");
		System.out.printf("\t Line's ID %s\n", this.id);
		System.out.printf("\tLine's length: %.4s \n", this.length());
		System.out.println("###################################");
	}
}
