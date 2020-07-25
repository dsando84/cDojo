package com.codingdojo.pets.models;

public class Animal implements java.io.Serializable {
	
	protected String name;
	protected String breed;
	protected int weight;
	
	public Animal() {
		
	}
	
	public Animal(String nameParam, String breedParam, int weightParam) {
		this.name = nameParam;
		this.breed = breedParam;
		this.weight = weightParam;
	}
	
	
	public void setName(String nameParams) {
		this.name = nameParams;
	}
	
	public void setBreed(String breedParams) {
		this.breed = breedParams;
	}
	
	public void setWeight(int weightParams) {
		this.weight = weightParams;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	public int getWeight() {
		return this.weight;
	}
}
