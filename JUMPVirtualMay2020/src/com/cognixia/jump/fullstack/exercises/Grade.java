package com.cognixia.jump.fullstack.exercises;

import java.util.Scanner;

public class Grade {

	private String subject;
	private int grade;
	
	public int gradeCheck(int grade, Scanner input) {
		while(this.grade < 0 || this.grade > 100) {
			System.out.println("The grade must be between 0 and 100");
			this.grade = input.nextInt();
		}
			return this.grade;		
	}
	
	public void letterGrade(int grade) {
		if (grade >= 97) {
			System.out.println("Your grade is an A+");
		}

		if (grade >= 94 && grade < 97) {
			System.out.println("Your grade is an A");
		}

		if (grade >= 90 && grade < 94) {
			System.out.println("Your grade is an A-");
		}

		if (grade >= 87 && grade < 90) {
			System.out.println("Your grade is a B+");
		}

		if (grade >= 84 && grade < 87) {
			System.out.println("Your grade is a B");
		}

		if (grade >= 80 && grade < 84) {
			System.out.println("Your grade is a B-");
		}

		if (grade >= 77 && grade < 80) {
			System.out.println("Your grade is a C+");
		}

		if (grade >= 74 && grade < 77) {
			System.out.println("Your grade is a C");
		}

		if (grade >= 70 && grade < 74) {
			System.out.println("Your grade is a C-");
		}

		if (grade < 70) {
			System.out.println("Your grade is an F");
		}

	}
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	
}
