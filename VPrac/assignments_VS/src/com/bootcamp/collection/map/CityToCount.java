package com.bootcamp.collection.map;

/***
 * 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CityToCount {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("John", "Dallas");
		map.put("Babbar", "NewYork City");
		map.put("Akbar", "Houston");
		map.put("Rizwan", "Dallas");
		map.put("Jorge", "Paris");
		map.put("Roshan", "Dallas");
		map.put("Sujit", "Houston");

		CityToCount ctc = new CityToCount();
		Map<String, Integer> map1 = ctc.countCity(map);

		Iterator<Entry<String, Integer>> it = map1.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Object, Object> pair = (Map.Entry) it.next();
			System.out.println(pair.getKey() + "=" + pair.getValue());
			it.remove();
		}

	}

	public Map<String, Integer> countCity(Map<String, String> map) {

		Map<String, Integer> map1 = new HashMap<String, Integer>();

		ArrayList<String> al = new ArrayList<String>();
		al.addAll(map.values());

		ArrayList<Integer> al1 = new ArrayList<Integer>();

		for (int i = 0; i < al.size(); i++) {
			int j = Collections.frequency(al, al.get(i));
			al1.add(j);
		}

		for (int i = 0; i < al.size(); i++) {
			map1.put(al.get(i), al1.get(i));
		}

		return map1;

	}
}
