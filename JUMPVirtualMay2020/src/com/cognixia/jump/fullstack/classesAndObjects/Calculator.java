package com.cognixia.jump.fullstack.classesAndObjects;

public class Calculator {

	// attributes
	int one;
	int two;
	static int opsCount = 0;
	
	//code block (instance will not see this without an object)
	{
		System.out.println("This is the code block");
	}
	//static code block
	static {
		System.out.println("this is the static block");
	}
	
	static {
		System.out.println("This is the second static block");
	}

	// constructor
	Calculator(int one, int two) {

		this.one = one;
		this.two = two;
	}

	// methods
	public static void sumOfTwoNumbers(int one, int two) {
		System.out.println(one + two);
		opsCount++;
	}

	public static int sum(int num1, int num2) {
		int total = num1 + num2;
		opsCount++;
		return total;

	}

	public static void multiply(int one, int two) {
		System.out.println(one * two);
		opsCount++;
	}

	public double divide(double dividend, double divisor) {
		double quotient = dividend / divisor;
		opsCount++;
		return quotient;
	}
}
