package demo;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer,String> marks = new TreeMap<>();
		marks.put(100,"Basi");
		marks.put(55,"Vishnu");
		marks.put(60,"jayanth");
		marks.put(70,"Venky");
		marks.put(90,"Irfan");
		System.out.println("The Students marks is:");
		System.out.println(marks);
		
		if(marks.containsKey(100)){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	TreeMap<String,Integer> phonebook = new TreeMap<>();
	phonebook.put("Irfan",2093093920);
	phonebook.put("Basi",412545212);
	System.out.println(phonebook);
	}

}
