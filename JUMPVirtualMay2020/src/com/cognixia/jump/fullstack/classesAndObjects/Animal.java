package com.cognixia.jump.fullstack.classesAndObjects;

public class Animal {
	
	//Attributes and access modifiers
	
	// top down least restrictive / most available to least available
	public int publicAt;
	protected int weight;
	int defaultAt;
	private String name;

	//Constructors
	Animal(){
		this.weight = 0;
	}
	
	Animal(int weight){
		this.weight = weight;
	}
	
	Animal(int weight, String name){
		this.weight = weight;
		this.name = name;
	}
	
	//Methods
	public void move() {
		System.out.println("The animal moves");
	}
	
	public int noises (String sound, int volume) {
		System.out.println("The animal makes a " + sound + " at volume " + volume);
		return volume;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

//	public void showStats() {
//		System.out.println(weight + " " + name);
//	}
}
