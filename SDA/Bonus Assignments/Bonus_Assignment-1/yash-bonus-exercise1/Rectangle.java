import java.util.Arrays;


public class Rectangle{
	//Add the fields necessary to create a rectangle here.
	//Make use of the Line class
	private Line[] sides;

	//Create a constructor which receives and stores 4 lines when created
	public Rectangle(Line a, Line b, Line c, Line d) {
		this.sides = new Line[]{a, b, c, d};
	}

	//Implement a method which returns the circumference of the rectangle
	public double perimeter(){
		double perimeter = 0;
		for(Line side: this.sides){
			perimeter += side.length();
		}
		return perimeter;
	}	

	//Implement a method which returns the area of the rectangle
	public double area(){
		double[] sideLength = new double[4];
		for(int i = 0; i < this.sides.length; i++){
			sideLength[i] = this.sides[i].length();
		}
		double[] distinctSideLengths = Arrays.stream(sideLength).distinct().toArray();
		double area = 1;
		if(distinctSideLengths.length > 2){
			System.err.println("Not a real rectangle! Area calculated will not be calculated!");
			area = 0;

		}else if(distinctSideLengths.length == 2){
			for (double distinctSideLength : distinctSideLengths){
				area *= distinctSideLength;
			}
		} else {
			area = distinctSideLengths[0] * distinctSideLengths[0];
		}

		return area;
	}

	/**
	 * Returns true if the argument intersects with the current object
	 * @param rect the line which is tested with the current object
	 * @return {@code true} if the argument intersects with the current object
	 */
	public boolean isIntersecting(Rectangle rect){
		boolean intersects = false;
		for(Line a : this.sides){
			for(Line b : rect.sides){
				if(a.isIntersecting(b)){
					intersects = true;
				}
			}
		}
		return intersects;
	}

}