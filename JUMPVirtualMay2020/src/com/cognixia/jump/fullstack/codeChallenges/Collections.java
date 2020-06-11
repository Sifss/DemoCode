package com.cognixia.jump.fullstack.codeChallenges;

import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Collections {

	public static void main(String[] args) {
		
		//Create an ArrayList
		ArrayList<String> seasons = new ArrayList<String>();
		
		//Create a HashSet
		HashSet<String> months = new HashSet<String>();
		//Add elements to a set
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("May");
		//Print set with an iterator (No duplicates)
		Iterator<String> iterator = months.iterator();
		while(iterator.hasNext()) {
			String set = iterator.next();
			System.out.println(set);
		}
		//Remove an element
		months.remove("May");

		for (String string : months) {
			System.out.println(months);
		}
		
		
		//Create a Queue (LinkedList)
		Queue<Integer> days = new LinkedList<Integer>();
		//Add elements to queue
		days.add(1);
		days.add(2);
		days.add(3);
		//check first element
		Integer first = days.element();
		System.out.println(first);
		//Print queue
		for (Integer integer : days) {
			System.out.println(days);
		}
		//Remove first element
		days.remove();
		//Print queue
		for (Integer integer : days) {
			System.out.println(days);
		}
					
		//Create a Deque
		Deque<Integer> years = new ArrayDeque<Integer>();
		//Create Entries
		years.addLast(2020);
		years.addFirst(2019);
		years.add(2018);
		//Get element
		System.out.println(years.getFirst());
		//Loop through collection
		for (Integer integer : years) {
			System.out.println(years);
		}
		//Delete an entry
		years.removeLast();
		
		for (Integer integer : years) {
			System.out.println(years);
		}
		
	}

}