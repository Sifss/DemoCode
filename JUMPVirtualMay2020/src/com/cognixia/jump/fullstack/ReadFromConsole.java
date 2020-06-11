package com.cognixia.jump.fullstack;

import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {
		
		//Declaring and initializing variables (primitives)
		//data type - variable name; (just declaring)
		int ourInt;
		
		//initialization -> variable name = value;
		ourInt = 5;
		
		int ourInt2 = 5;
		
		//Primitive Types
		//Numeric
		//Whole numbers (integers of different sizes)
		int i = 1;
		byte b = 2;
		short s = 3;
		long l = 100000000;
		//Decimals
		float f = 5.00f;
		double d = 5.00;
		
		//Non numeric
		char c = 'c';
		boolean bn = true;
		
		//Not primitive - Object
		String output = "Hello World";
		
		//Show visually a difference between a prim and obj in IDE
		//primitive
		//bn. -> not valud, dot (.) operator does nothing
		
		//Objects
		output.charAt(1);  //this is just to show the . of an obj.
		
		//Conclude user basics demo
		
		System.out.println(output);
		
		//Start UserInput
		
		//Creating a Scanner tool and getting input
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.println("Please enter an integer: ");
		
		//Read the user input
		String userInput = input.nextLine();
		
		//Print the input to show that we stored / received it
		System.out.println(userInput);
		
		//close the input
		input.close();

	}

}
