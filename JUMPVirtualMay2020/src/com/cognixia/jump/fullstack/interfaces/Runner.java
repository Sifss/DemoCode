package com.cognixia.jump.fullstack.interfaces;

public class Runner {

	public static void main(String[] args) {
		
		final int x;
		
		WolfHybrid hybrid = new WolfHybrid();
		
		hybrid.move();
		hybrid.bark();
		
		System.out.println(Calculator.sum(2, 4, 6, 8));
		
		System.out.println(hybrid.multiply(2, 4, 6));
		
		

	}

}
