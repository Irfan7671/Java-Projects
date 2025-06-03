package demo;

import java.util.Scanner;

public class calendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input value:");
		String Day = sc.nextLine().toLowerCase();
		switch (Day) {
		case "monday":
			System.out.println("Lets learn python");
			break;
		case "tuesday":
			System.out.println("Lets learn java");
			break;
		case "wednesday":
			System.out.println("Lets learn Angular");
			break;
		case "thursday":
			System.out.println("Lets learn React");
			break;
		case "friday":
			System.out.println("Lets learn MongoDB");
			break;
		case "saturday":
			System.out.println("Lets learn SQL");
			break;
		
		default:
			System.out.println("Invalid day entered");
			break;
		}
		sc.close();
		
	}

}
