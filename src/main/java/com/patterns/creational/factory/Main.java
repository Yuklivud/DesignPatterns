package com.patterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new DogFactory(); // Or CatFactory
        Animal animal = animalFactory.createAnimal();
        animal.makeSound();
    }
}
