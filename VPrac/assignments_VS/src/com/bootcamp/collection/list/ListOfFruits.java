package com.bootcamp.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * 
 * @author Boot Camp User 011
 *
 */
public class ListOfFruits {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("pear");
		al.add("banana");
		al.add("tangerine");
		al.add("strawberry");
		al.add("blackberry");

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\n");
		ListIterator<String> lit = al.listIterator(al.size());
		
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		System.out.println("\n");
		for (int i = 0; i < al.size(); i++) {
			if (i == 3) {
				al.add(3, "banana");
			}
		}
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
