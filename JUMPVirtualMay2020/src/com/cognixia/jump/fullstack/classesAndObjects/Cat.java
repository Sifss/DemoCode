package com.cognixia.jump.fullstack.classesAndObjects;

public class Cat extends Animal {

	//attributes with access modifiers
	private String type;
	private int id;
	
	private static int count = 0;
	//Constructors - you can call a parent constructor but it us no directly inherited
	Cat(){
//		super.weight = 0;
//		super.name = "";
		
		//super = ANimal;
		super(0, "");
		this.type = "";
		count++;
		this.id = count;
	}
	
	Cat(int weight, String name, String type){
		super(weight, name);
		this.type = type;
		count++;
		this.id = count;
	}
	
	// Methods
	
	//Override
//	@Override
//	public void move() {
//		System.out.println("The cat jumps");
//	}
	
	@Override
	public int noises (String sound, int volume) {
		System.out.println("The cat overrode this method");
		return 1;
	}

	
	//Overload
	public int move(int y, String x) {
		System.out.println("Cat move x dist " + x + " y dist " + y);
		return 1;
	}
	
	public int move(String x, int y) {
		System.out.println("Cat move x dist " + x + " y dist " + y);
		return 1;
	}
	
	

	public static void printCatCount() {
		System.out.println("The number of cats is " + count);
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "\nCat [type=" + type + ", \n\tid=" + id + ", \n\tgetWeight()=" + getWeight() + ", \n\tgetName()=" + getName() + "\n]";
	}
	
}
