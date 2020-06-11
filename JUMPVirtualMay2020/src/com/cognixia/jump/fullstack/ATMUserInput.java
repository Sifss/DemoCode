package com.cognixia.jump.fullstack;

import java.util.Scanner;

public class ATMUserInput {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		boolean valid;
		int userInput = 0;
		
		do {
			System.out.println("Please Pick an option 1-3 (withdrawl, deposit, or balance)");
			
			input = new Scanner(System.in);
			
			valid = input.hasNextInt();
			if(valid) {
			
				userInput = input.nextInt();
			}
		
		}while(!valid);
		
		
		switch(userInput) {
		case 1:
			System.out.println("Enter withdrawl code here");
			break;
		case 2:
			System.out.println("Enter deposit code here");
			break;
		case 3:
			System.out.println("Enter check balance code here");
			break;
		}
		
		input.close();

	}

}
