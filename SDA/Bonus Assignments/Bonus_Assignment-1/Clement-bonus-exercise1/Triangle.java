package shapes;

public class Triangle {
	// Add the fields necessary to create a rectangle here.
	// Make use of the Line class
	static Line firstLine;
	static Line secondLine;
	static Line thirdLine;
	

	// Create a constructor which receives and stores 4 lines when created

	Triangle(Line firstLine, Line secondLine, Line thirdLine) {
		Triangle.firstLine = firstLine;
		Triangle.secondLine = secondLine;
		Triangle.thirdLine = thirdLine;
		
	}

	
	// triangle checker
	public static boolean isTriangle(Triangle t) {

			if ((Triangle.firstLine != Triangle.secondLine) && (Triangle.firstLine != Triangle.thirdLine)) {
			return true;
		}
		return false;
	}
	
	
		// Implement a method which returns the circumference of the triangle- OK

	public static double circumference(Triangle t1) {
		
		return firstLine.length() + secondLine.length() + thirdLine.length();
	}

	//TODO -- Implement a method which returns the area of the triangle
	

	public static double area(Triangle t1) {
		
		

		double s=(firstLine.length()+secondLine.length()+thirdLine.length())/2;
        double area=Math.sqrt(s*(s-firstLine.length())*(s-secondLine.length())*(s-thirdLine.length()));
        
        return area;     
         }
        
	
		
	}
