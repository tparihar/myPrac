package com.bootcamp.collection.map;

/**
 * 
 */
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Rarest {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Alyssa", 22);
		map.put("Char", 25);
		map.put("Dan", 25);
		map.put("Jeff", 20);
		map.put("Kasey", 20);
		map.put("Kim", 20);
		map.put("Mogran", 25);
		map.put("Ryan", 25);
		map.put("Stef", 22);

		Rarest rs = new Rarest();
		rs.rarest(map);

	}

	public int rarest(Map<String, Integer> map) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.addAll(map.values());

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		for (int i = 0; i < map.size(); i++) {

			int j = Collections.frequency(al, al.get(i));
			al1.add(j);
		}
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();

		for (int i = 0; i < map.size(); i++) {
			map1.put(al.get(i), al1.get(i));
		}

		/*
		 * Iterator<Entry<Integer, Integer>> it = map1.entrySet().iterator();
		 * while (it.hasNext()) { Map.Entry<Object, Object> pair = (Map.Entry)
		 * it.next(); System.out.println(pair.getKey() + "=" + pair.getValue());
		 * it.remove(); }
		 */

		int rareNum = 0;
		int rareCount = 0;

		for (Map.Entry<Integer, Integer> ent : map1.entrySet()) {
			int cKey = ent.getKey();
			int cValue = ent.getValue();
			if (rareNum == 0 && rareCount == 0) {
				rareNum = cKey;
				rareCount = cValue;
				continue;
			}

			if (cValue > rareCount) {
				continue;
			} else if (cValue < rareCount) {
				rareCount = cValue;
				rareNum = cKey;
			} else if (cValue == rareCount) {
				if (cKey < rareNum) {
					rareNum = cKey;

				}

				else if (cKey > rareNum) {
					rareNum = rareNum;

				}

			}

		}
		/*
		 * int max = 0; int rarest; int rarestnNum =0;
		 * 
		 * for (int i = 0; i < al.size(); i++) { if(max<al1.get(i)){
		 * max=al1.get(i); } } for (int i = 0; i < al.size(); i++) {
		 * if(max>al1.get(i)){ max = al1.get(i); } }
		 */

		/*
		 * for (int i = 0; i < al1.size(); i++) { for (int j = 1; j <
		 * al1.size(); j++) { if(al1.get(i)<al1.get(j)){ rarest=al1.get(i); }
		 * else if (al1.get(i)>al1.get(j)){ rarest= al1.get(j) ; } else{
		 * if(al.get(i)<al.get(j)){ rarestnNum = al.get(i); }else{ rarestnNum
		 * =al.get(j); } } }}
		 */
		System.out.println(rareCount);
		System.out.println(rareNum);
		return 10;
	}
}
