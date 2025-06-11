package xyz;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet<String> employee = new TreeSet<String>(Collections.reverseOrder());
		employee.add("Sumit");
		employee.add("Karan");
		employee.add("Anjali");
		employee.add("Mohan");
		employee.add("Zoya");
		System.out.println(employee);
		//System.out.println(employee.reversed().toString());

	}

}
