package com.polymorphisam_day_01;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}