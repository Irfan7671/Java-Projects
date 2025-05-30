package xyz;

import java.util.Scanner;

public class InpuExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age:");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		System.out.println();
		
		System.out.println("Hi! My name is "+name+" " +"and my age is "+age);
		
		
	}

}
