package com.bootcamp.collection.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * This class prints the elements which are present in both the elements
 *
 */
public class CommonCount {

	public int countCommon(Collection<Integer> a, Collection<Integer> a2) {

		Set<Integer> hs = new HashSet<Integer>();
		hs.addAll(a);

		Set<Integer> hs1 = new HashSet<Integer>();
		hs1.addAll(a2);

		int i = 0;
		for (Integer integer : hs) {
			for (Integer integer1 : hs1) {
				if (integer.intValue() == integer1.intValue()) {
					i++;
				}
			}
		}

		return i;
	}

	public static void main(String[] args) {

		Collection<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(7);
		a.add(3);
		a.add(-1);
		a.add(2);
		a.add(3);
		a.add(7);
		a.add(2);
		a.add(15);
		a.add(15);

		Collection<Integer> a2 = new ArrayList<Integer>();

		a2.add(-5);
		a2.add(15);
		a2.add(2);
		a2.add(-1);
		a2.add(7);
		a2.add(-15);
		a2.add(36);

		CommonCount cc = new CommonCount();
		int commonNumbers = cc.countCommon(a, a2);

		System.out.println("Total number of sommon elements are : " + commonNumbers);
	}

}
