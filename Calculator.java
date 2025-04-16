package com.polymorphisam_day_01;

public class Calculator {

    // Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Adds two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Adds three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Main method to test overloaded add methods
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum1 = calc.add(10, 20);
        double sum2 = calc.add(5.5, 6.3);
        int sum3 = calc.add(1, 2, 3);

        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of two doubles: " + sum2);
        System.out.println("Sum of three integers: " + sum3);
    }
}

