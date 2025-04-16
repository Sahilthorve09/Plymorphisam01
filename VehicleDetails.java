package com.polymorphisam_day_01;

public class VehicleDetails {

	public static void main(String[] args) {
        Vehicle v;

        v = new Car();
        v.move();  // Output: Car is moving

        v = new Bike();
        v.move();  // Output: Bike is moving
    }
	
}
