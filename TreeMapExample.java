package professional;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<>();
		map.put(1,"Irfan");
		map.put(2, "Vishnu");
		map.put(3, "Dilip");
		map.put(2, "Vishnu");
		map.replace(1, "Irfan");
		System.out.println(map);
		

	}

}
