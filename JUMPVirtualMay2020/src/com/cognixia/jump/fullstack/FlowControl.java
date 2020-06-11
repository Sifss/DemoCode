package com.cognixia.jump.fullstack;

import java.util.Scanner;

public class FlowControl {

	public static void main(String[] args) {
		//Start UserInput
		
				//Creating a Scanner tool and getting input
				Scanner input = new Scanner(System.in);
				boolean valid;
				
//				do {
//					System.out.println("Please enter a number : ");
//					
//					input = new Scanner(System.in);
//					
//					valid = input.hasNextInt();
//					System.out.println(valid);
//					if(valid) {
//					
//						int userInput = input.nextInt();
//					}
//				
//				}while(!valid);
//				
				//Prompt the user for input
				//System.out.println("Please enter an integer: ");
				
				//Read the user input
				//int userInput = input.nextInt();

				
				//Flow Control Demo Starts Here
				
				//Conditionals (Ifs and Switch)
				
//				boolean condition = userInput >= 0;
//				
//				if (condition) {
//					System.out.println("Your number is positive.");
//				}
//				if (userInput > 50) {
//					System.out.println("You're in the magic range");
//				}
//				else {
//					System.out.println("Your number is negative");
//				}
				
//				switch (userInput) {
//				case "a": 
//				case "A":
//					System.out.println("User Settings");
//					break;
//				case "b":
//				case "B":
//					System.out.println("Home Menu");
//					break;
//				default:
//					System.out.println("No options valid");
	//}
				//Conditionals
//				if(userInput <= 5 && userInput > 1 && userInput % 2 == 0) {
//					System.out.println("Target Range. ");
//				}
				
				
				//Loops
				//While loop
				//int counter = 0;
				
//				while(counter < 20) {
//					System.out.println("This is loop iteration: " + userInput);
//					userInput++;
//				}
				
//				while (userInput < 0) {
//					System.out.println("Enter a number: ");
//					userInput = input.nextInt();
//					System.out.println(userInput);
//				}
				
//				do {
//					System.out.println("Enter a positive number only: ");
//					userInput = input.nextInt();
//					System.out.println("Iterating through a do-while");
//				} while(userInput > 0);
//				
//				System.out.println(userInput);

				
//				//Print the input to show that we stored / received it
//				System.out.println(userInput);
//				
//				//print demo
//				System.out.println("New line after here \nnew line started.");
//				System.out.print("New content \tThis is a tab started.");
//				
//				System.out.println("\n I want to print \\");
//				System.out.println("Printing quotes: \"Quote \" ");
				
//				int j = 5;
//				
//				j = j * 2;
				
//				for(int i = 0; i < 10; i++) {
//					System.out.println(i);
//				}
				
				for(int i = 9; i >= 0; i--) {
					System.out.println(i);
				}
				
				//nested for loop
				for(int i = 0; i < 10; i++) {
					for(int j = 0; j < 10; j++) {
						System.out.println(i + ":" + j);
					}
				}
//				
				
				//close the input
				input.close();

				}
}

