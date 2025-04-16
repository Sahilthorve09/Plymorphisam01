package com.polymorphisam_day_01;

public class Student {

    int rollNumber;
    String name;

    // Constructor 1: No arguments
    public Student() {
        System.out.println("Constructor with no arguments called.");
        rollNumber = 0;
        name = "Unknown";
    }

    // Constructor 2: Takes roll number
    public Student(int rollNumber) {
        System.out.println("Constructor with roll number called.");
        this.rollNumber = rollNumber;
        name = "Unknown";
    }

    // Constructor 3: Takes roll number and name
    public Student(int rollNumber, String name) {
        System.out.println("Constructor with roll number and name called.");
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Method to display student info
    public void displayInfo() {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name);
    }

    // Main method to test constructor overloading
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayInfo();

        Student s2 = new Student(101);
        s2.displayInfo();

        Student s3 = new Student(102, "Alice");
        s3.displayInfo();
    }
}

