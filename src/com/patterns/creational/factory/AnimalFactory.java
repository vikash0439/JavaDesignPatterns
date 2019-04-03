package com.patterns.creational.factory;

public class AnimalFactory {   //A factory pattern that produces animal 
	
	public Animal createAnimal(String animalType){
		
		if("dog".equalsIgnoreCase(animalType)){
			return new Dog();
		}else if("lion".equalsIgnoreCase(animalType)){
			return new Lion();
		}else if("tiger".equalsIgnoreCase(animalType)){
			return new Tiger();
		}else
		return null;
		
	}

}
