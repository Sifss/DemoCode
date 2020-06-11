package com.cognixia.jump.fullstack.codeChallenges;

public class SameArray {
	
	public static int compareArrays(int arr1[], int arr2[]) {
		int count = 0;
		
		//Check each element of array against every element of the other array
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					count++;
					break;
				}
			}

		}
		return count;
	}

}
