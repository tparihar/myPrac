package com.bootcamp.collection.list;

/**
 * 
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class DoubleList {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("how");
		al.add("are");
		al.add("you?");

		DoubleList dl = new DoubleList();
		dl.doubleList(al);

		for (String string : al) {
			System.out.println(string);
		}
	}

	public void doubleList(List a) {
		int i = 0;
		for (int j = 0; j < a.size(); j++) {
			a.add(i, a.get(j));
			i = i + 2;
			j++;
		}
	}

}
