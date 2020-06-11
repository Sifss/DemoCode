package com.cognixia.jump.fullstack.codeChallenges;

public class MainArray {

	public static void main(String[] args) {
		
		int arr[] = {45, 7, 4, 3, 15, 60};
		
		for( int i = 0; i < arr.length; i++) {
			if(arr[i] % 5 == 0) {
				System.out.println(PlusMethods.plus(arr[i], arr[i-1]));
			}
		}

	}

}
