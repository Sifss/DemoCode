package com.cognixia.jump.fullstack.classesAndObjects;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		//declaring array
		int[] intArr1;
		int intArr2[];
		
		Cat[] cats;
		
		//initializing array
		intArr1 = new int[5];
		
		//declare and initialize
		int intArr3[] = {50, 40, 35, 45, 10};
		
		Cat[] litter = {new Cat(10, "Mittens", "Tabby"), new Cat(), new Cat()};
		
		//initial values
		System.out.println(Arrays.toString(intArr1));
		System.out.println(Arrays.toString(litter));
		
		//reading/writing/accessing array
		System.out.println(litter[0]);
		intArr1[2] = 100;
		
		litter[2] = null;
		
		//out of bounds
		//System.out.println(litter[10]);
		
		System.out.println(Arrays.toString(intArr1));
		System.out.println(Arrays.toString(litter));
		
		//iterating/looping through array
		
			//traditional for loop
			for(int i = 0; i < intArr3.length; i++) {
				System.out.println(intArr3[i]);
			}
				//Goes Backwards
			for(int i = litter.length-1; i >=0; i--) {
				System.out.println(litter[i]);
			}
		
			System.out.println("For Each loops \n");
			//foreach loop
				//primitive array
			for(int elem : intArr3) {
				if (elem == 40) {
					elem = 50;
				}
				System.out.println(elem);
			}
			//test the write of for each loop with prim
			System.out.println(Arrays.toString(intArr3));
				//array of objects
			for(Cat cat: litter) {
				if(cat.getName().equals("Mittens")) {
//					cat = new Cat(10, "Overridden", "New Cat");
//					cat = null;
					cat.setName("Override"); // special case, where write works
				}
				System.out.println(cat);
			}
			
			System.out.println();
			System.out.println(Arrays.toString(litter));
		
		//Homogenous and Heterogenous Arrays (Inheritence)
			
			Animal[] animals = new Animal[3];
//			cats[0] = new Animal();
			
			animals[0] = new Animal();
			animals[1] = new Cat();
		
		//Array class static methods
			//Array.set(array, index, value);
			Array.getInt(intArr3, 4);
		
		//Utility class - Arrays
			Arrays.toString(litter);
			//System.out.println(output);
			
		//pass by ref and value
			//pass by value is making a copy of the data value for your method
			int a = 4;
			int b = 10;
			int ints[] = new int[2];
			ints[0] = a;
			ints[1] = b;
			
			swapInts(ints[0], ints[1]);
			System.out.println(ints[0] + " " + ints[1]);
			//pass by reference is referring to the specific address in heap memory. Not making a copy

	}
	
	public static void swapInts2(int ints[]) {
		int temp = ints[0];
		ints[0] = ints[1];
		ints[1] = temp;
		System.out.println(ints[0] + " " + ints[1]);
	}
	
//	public static void swapInts(int a, int b) {
//		int temp = a;
//		a = b;
//		b = temp;
//		System.out.println(a + " " + b);
//	}

	public static int[] swapInts(int a, int b) {
		int arr[] = {b, a};
		return arr;
	}
}
