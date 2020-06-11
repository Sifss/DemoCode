package com.cognixia.jump.fullstack.exercises;

import java.util.Scanner;

public class GradeRunner {

	public static void main(String[] args) {
		
		Grade grade = new Grade();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a grade");
			
		grade.setGrade(input.nextInt());
		grade.gradeCheck(grade.getGrade(), input);
		
		grade.letterGrade(grade.getGrade());
		System.out.println(grade.getGrade());
		System.out.println(grade.getGrade() + "%");
		
		
		//System.out.println(grade);
		
		input.close();

	}


}
