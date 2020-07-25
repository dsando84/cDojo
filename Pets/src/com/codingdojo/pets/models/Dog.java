package com.codingdojo.pets.models;

public class Dog extends Animal implements Pet {

	public Dog() {

	}
	
	public Dog(String nameParam, String breedParam, int weightParam) {
		this.name = nameParam;
		this.breed = breedParam;
		this.weight = weightParam;
	}
	
	public String showAffection() {
		if(getWeight() < 30) {
			return String.format("%s hopped into your lap and cuddled you!", getName());
		} else {
			return String.format("%s curled up next to you!", getName());
		}
	}
}
