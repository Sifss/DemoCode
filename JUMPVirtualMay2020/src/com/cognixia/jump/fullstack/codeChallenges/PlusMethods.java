package com.cognixia.jump.fullstack.codeChallenges;

public class PlusMethods {
	
	int sum;
	
	public static int plus(int x, int y) {
		
		return x + y;
	}
	
	public static String plus(int x, int y, int pos) {
		
		String one = Integer.toString(x);
		String two = Integer.toString(y);
		
		String concat = one + two;
		
		return concat;
	}

}
