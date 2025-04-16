package com.polymorphisam_day_01;

public class AnimalDetails {

	public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound();  // Output: Bark

        a = new Cat();
        a.sound();  // Output: Meow
    }
	
}
