package demo;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> students = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the names of 5 students");
		
		for(int i=1;i<=5;i++) {
			System.out.println("Enter the name of student"+i+":");
			String name = sc.nextLine();
			students.add(name);
			
		}
		for(String student:students) {
			System.out.println(student);
		}

	}

}
