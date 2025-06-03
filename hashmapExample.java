package demo;

import java.util.HashMap;

public class hashmapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> students = new HashMap<Integer,String>();
		
		//insert some values
		students.put(01, "Muttahar");
		students.put(02, "Irfan");
		students.put(03, "Charith");
		students.put(04, "Ameen");
		System.out.println(students);
		
		//remove the values by using remove keyword
		students.remove(04);
		System.out.println(students);
		
		//update the value by using put keyword
		students.put(01,"Mutthu");
		System.out.println(students);
		

	}

}
