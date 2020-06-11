package com.cognixia.jump.fullstack.codeChallenges;

public class SameArrayDriver {

	public static void main(String[] args) {

		int arr1[] = { 1, 3, 1, 0 };
		int arr2[] = { 0, 1, 1, 3 };
		//String arr1[] = {"cookie", "milk", "sugar"};
		//String arr2[] = {"cookie", "milk", "sugar"};
		
		int count = SameArray.compareArrays(arr1, arr2);
		
		// Final output
		if (count == arr1.length) {
			System.out.println("These arrays match");
		} else {
			System.out.println("These arrays do not match");
		}
	}

}
