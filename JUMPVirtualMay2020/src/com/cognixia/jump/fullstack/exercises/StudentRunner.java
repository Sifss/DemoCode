package com.cognixia.jump.fullstack.exercises;

public class StudentRunner {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		Student student2 = new Student("Bill");
		
		Undergraduate student3 = new Undergraduate();
		Graduate student4 = new Graduate();
		
		char c = student2.firstLetter(student2.getName());
		
		student3.setName("Karen");
		student4.setName("Trey");
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		student3.toString(student3.getName());
		student4.toString(student4.getName());
		
		System.out.println(c);

	}

}
