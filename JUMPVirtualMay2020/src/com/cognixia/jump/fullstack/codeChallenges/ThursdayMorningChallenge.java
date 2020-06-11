package com.cognixia.jump.fullstack.codeChallenges;

import java.util.Scanner;

public class ThursdayMorningChallenge {

	public static void main(String[] args) {
		
		//Initialize objects and variables
		Scanner input = new Scanner(System.in);
		Calculations calc = new Calculations();
		int userInput = -1;
		int min;
		int max;
		
		//Loop until user wants to quit
		while (userInput != 0) {
			do {
				//Get min/max range from user
				System.out.println("Set a minimum range for your number");
				min = input.nextInt();
				
				System.out.println("Set a maximum range for your number");
				max = input.nextInt();
				
				//Get user input within the specified range
				System.out.println("Please enter a number from " + min + " to " + max + " or press 0 to escape");
				userInput = input.nextInt();

				//Error checking
				if (userInput > (((max - min) / 2) + min) && userInput < min) {
					System.out.println("Please input a number higher than " + min + " and lower than " + (max / 2) );
				}

			} while (userInput > (((max - min) / 2) + min) && userInput < min);
			
			if(userInput == 0)
				break;
			
			//call calculations object
			calc.sumMultiples(userInput, min, max);
		}

		//close scanner
		input.close();
			
		}

}
	

