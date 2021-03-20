package objects;

import java.util.ArrayList;

import application.Exceptions.ShapeException;

public class ShapesList {
	private ArrayList<String> shapesList = new ArrayList<>();

	public ShapesList(String object1, String object2, String object3, String object4) {
		this.shapesList.add(object1);
		this.shapesList.add(object2);
		this.shapesList.add(object3);
		this.shapesList.add(object4);
	}

	public ArrayList<String> getObjects() {
		return this.shapesList;
	}
	

	public void addObject(String object) {
		this.shapesList.add(object);
	}

	public boolean contains(String object) {
		
		return shapesList.contains(object);
	}
	
	public void getList() {
		this.shapesList.forEach(e -> System.out.println(e));
	}
	
	
	
	public boolean validateShapeInput(String user_input) throws ShapeException {
		if(!this.shapesList.contains(user_input)) {
			throw new ShapeException("Invalid shape");
			
		} else {
		return true;
		}
	}
}
