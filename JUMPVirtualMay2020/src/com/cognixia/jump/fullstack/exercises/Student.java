package com.cognixia.jump.fullstack.exercises;

public class Student {
	
	//At least 1 attribute
	private String name;
	
	//Default Constructor
	Student() {
		name = "Cindy";
	}
	
	//Constructor with fields
	Student(String name){
		this.name = name;
	}
	
	//Static Method
	public static char firstLetter(String name) {
		char first = name.charAt(0);
		return first;
	}

	//Getter and Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Overriden toString method
	@Override
	public String toString() {
		return "Student [name=" + name + ", getName()=" + getName() + "]";
	}


	

}
