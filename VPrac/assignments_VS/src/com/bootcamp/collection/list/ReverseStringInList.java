package com.bootcamp.collection.list;

/**
 * 
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ReverseStringInList {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("how");
		al.add("are");
		al.add("you?");

		ArrayList<String> al1 = new ArrayList<String>();
		String reverseString = "";
		for (int i = 0; i < al.size(); i++) {
			String str = al.get(i);
			for (int j = str.length(); j > 0; j--) {
				reverseString = reverseString + str.charAt(j - 1);
			}
			al1.add(reverseString + " ");
			reverseString = "";
		}
		for (String string : al1) {

			System.out.print(string);
		}
	}

}
