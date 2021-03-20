package shapes;

public class Line {
	Point firstPoint;
	Point secondPoint;

	public Line(Point firstPoint, Point secondPoint) {
		this.firstPoint = firstPoint;
		this.secondPoint = secondPoint;
	}

	public double length() {
		return Math.hypot(xLength(), yLength());
	}

	public double xLength() {
		return firstPoint.xDistanceTo(secondPoint);
	}

	public double yLength() {
		return firstPoint.yDistanceTo(secondPoint);
	}

}
