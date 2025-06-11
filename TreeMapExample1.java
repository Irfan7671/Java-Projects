package xyz;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<String,String>();
		map.put("India", "New Delhi");
		map.put("USA", "Washington");
		map.put("Germany", "Berlin");
		map.put("Japan", "Tokyo");
		map.put("India", "Delhi");
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " -> "+entry.getValue());
		}

	}

}
