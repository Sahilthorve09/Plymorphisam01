package com.polymorphisam_day_01;



	public class DisplayExample {

	    // Display a string
	    public void display(String message) {
	        System.out.println("String: " + message);
	    }

	    // Display an integer
	    public void display(int number) {
	        System.out.println("Integer: " + number);
	    }

	    // Display both a string and an integer
	    public void display(String message, int number) {
	        System.out.println("String: " + message + ", Integer: " + number);
	    }

	    // Main method to test overloaded display methods
	    public static void main(String[] args) {
	        DisplayExample example = new DisplayExample();

	        example.display("Hello World");
	        example.display(100);
	        example.display("Age", 25);
	    }
	}

	

