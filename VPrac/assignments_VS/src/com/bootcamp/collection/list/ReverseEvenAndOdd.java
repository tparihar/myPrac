package com.bootcamp.collection.list;

/**
 * 
 */
import java.util.ArrayList;

public class ReverseEvenAndOdd {
	public void reverseOddAndEvenList(ArrayList<String> array) {
		String temp = "";
		for (int i = 0; i < array.size(); i += 2) {
			if (i < array.size() - 1) {
				temp = array.get(i);
				array.set(i, array.get(i + 1));
				array.set(i + 1, temp);
			}
		}
		System.out.println("replacing the even with odd are:");
		for (String str : array) {
			System.out.print(str + " ");
		}

	}

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("how");
		al.add("are");
		al.add("you?");
		al.add("I");
		al.add("am");
		al.add("doing");
		al.add("fine");

		ReverseEvenAndOdd reao = new ReverseEvenAndOdd();
		reao.reverseOddAndEvenList(al);
	}

}
