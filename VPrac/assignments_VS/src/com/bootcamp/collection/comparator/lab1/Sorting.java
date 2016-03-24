package com.bootcamp.collection.comparator.lab1;

import java.util.*;

class Sorting {

	public static void main(String[] args) {
		int listSize = 30;
		int magnitude = 500;
		Random rand = new Random(12345);

		ArrayList<Integer> numbers = new ArrayList<Integer>(listSize);
		for (int i = 0; i < listSize; i++) {
			numbers.add(rand.nextInt() % magnitude);
		}

		Collections.sort(numbers);

		for (Integer num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();
		Collections.sort(numbers, new BackwardOrdering());

		for (Integer num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();
	
	Collections.sort(numbers, new AlternatingOrdering());

	for (Integer num : numbers) {
		System.out.print(num + " ");
	}
	System.out.println();
}
	}

	class BackwardOrdering implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return -(o1.compareTo(o2));
	}
	}
	
	class AlternatingOrdering implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
		
		if(o1<0 || o2<0){
		
		return o1.compareTo(o2);	
		}else{
		return -(o1.compareTo(o2));
		}
		}
	}
	
