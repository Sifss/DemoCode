package com.cognixia.jump.fullstack.codeChallenges;


public class Calculations {

	int number;
	int max;
	int min;
	
	

	void sumMultiples(int number, int min, int max) {
		
		this.number = number;
		this.max = max;
		this.min = min;
		
		int sum = 0;
		
		//Add sum of every multiple of user input
		for(int i = min; i <= max; i++) {
			
			//Extra fluff code for visual appeal
			if((max - i) < number) {
				if(i % number == 0) {
					System.out.print(i + " =");
					sum += i;
					break;
				}
				
			}
			//Add up the multiples and print for clarity
			if(i % number == 0) {
				System.out.print(i + " + ");
				sum += i;
			}
		}
		
		System.out.println("\nThe sum of multiples of " + number + " in range " + min + " to " + max + " is "  + sum);
	}
	
}
