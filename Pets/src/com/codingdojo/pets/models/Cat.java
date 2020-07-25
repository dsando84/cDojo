package com.codingdojo.pets.models;

public class Cat extends Animal implements Pet{
	
	public Cat() {
	}
	
	public Cat(String nameParam, String breedParam, int weightParam) {
		this.name = nameParam;
		this.breed = breedParam;
		this.weight = weightParam;
		
	}
	
	public String showAffection() {
		return String.format("Your %s cat, %s, looked at you with some affection. You think!",
			 getBreed(), getName());
	}
}
