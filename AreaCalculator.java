package com.polymorphisam_day_01;

public class AreaCalculator {

    // Method to calculate area of a circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of a rectangle
    public double area(double length, double breadth) {
        return length * breadth;
    }

    // Method to calculate area of a square
    public int area(int side) {
        return side * side;
    }

    // Main method to test the overloaded methods
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        double circleArea = calc.area(5.0);
        double rectangleArea = calc.area(4.0, 6.0);
        int squareArea = calc.area(4);

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Square: " + squareArea);
    }
}

