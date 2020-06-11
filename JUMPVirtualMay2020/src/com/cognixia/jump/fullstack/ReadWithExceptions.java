package com.cognixia.jump.fullstack;

import java.util.Scanner;

public class ReadWithExceptions {
	public static void main(String[] args) {
		
//		int userInput = 0;
//
//		// Creating a Scanner tool and getting input
//		Scanner input = new Scanner(System.in);
//
//		// Prompt the user for input
//		System.out.println("Please enter an integer: ");
//
//		// Read the user input
//		try {
//			userInput = input.nextInt();
//		} catch(Exception e) {
//			System.out.println("Please enter only numbers");
//		} finally {
//			input.close();
//		}
//		// Print the input to show that we stored / received it
//		System.out.println(userInput);
		
		int userInput = 0;

		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter a number: ");
			boolean valid = false;
			try {
				valid = input.hasNextInt();
				userInput = input.nextInt();
			} catch (Exception e) {
				System.out.println("Please enter only numbers");
			} finally {
				System.out.println("We are done.");
				if(valid) {
					assert userInput > 0 : "Please not negative";
					input.close();
					return;
				}
			}
			// Print the input to show that we stored / received it
			System.out.println(userInput);
		}

	}
}
