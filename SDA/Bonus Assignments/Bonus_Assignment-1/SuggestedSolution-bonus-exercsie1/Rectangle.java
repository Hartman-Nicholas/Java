public class Rectangle{
	//Add the fields necessary to create a rectangle here.
	//Make use of the Line class
	private Line l1;
	private Line l2;
	private Line l3;
	private Line l4;

	//Create a constructor which recieves and stores 4 lines when created
	public Rectangle(Line l1, Line l2, Line l3, Line l4){
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;
	}

	//Implement a method which returns the circumference of the rectangle
	public double circumference(){
		return l1.length()+l2.length()+l3.length()+l4.length();
	}	

	//Implement a method which returns the area of the rectangle
	public double area(){
		return l1.length()*l2.length();
	}

	public boolean isIntersecting(Rectangle r){
		return (l1.isIntersecting(r.l1) || l1.isIntersecting(r.l2) || l1.isIntersecting(r.l3) || l1.isIntersecting(r.l4))
				|| (l2.isIntersecting(r.l1) || l2.isIntersecting(r.l2) || l2.isIntersecting(r.l3)  || l2.isIntersecting(r.l4))
				|| (l3.isIntersecting(r.l1) || l3.isIntersecting(r.l2) || l3.isIntersecting(r.l3)  || l3.isIntersecting(r.l4))
				|| (l4.isIntersecting(r.l1) || l4.isIntersecting(r.l2) || l4.isIntersecting(r.l3)  || l4.isIntersecting(r.l4));
	}
}