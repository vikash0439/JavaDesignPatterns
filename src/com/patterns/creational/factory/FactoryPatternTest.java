package com.patterns.creational.factory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String animalType = "dog";
		
		AnimalFactory animalFactory = new AnimalFactory();
		Animal animal = animalFactory.createAnimal(animalType);
		animal.eat();
	}

}
