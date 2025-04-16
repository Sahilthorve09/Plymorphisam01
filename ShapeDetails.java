package com.polymorphisam_day_01;

public class ShapeDetails {

	 public static void main(String[] args) {
	        Shape s;

	        s = new Circle();
	        s.draw();  // Output: Drawing a Circle

	        s = new Rectangle();
	        s.draw();  // Output: Drawing a Rectangle

	        s = new Triangle();
	        s.draw();  // Output: Drawing a Triangle
	    }
	
}
