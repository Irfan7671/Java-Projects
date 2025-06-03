package demo;

import java.util.Scanner;

public class RainUmbrella {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the input value:");
	String ans = sc.nextLine();
	if(ans.equals("yes")) {
		System.out.println("Take an umbrella");
	}else {
		System.out.println("No need of an umbrella");
	}
	sc.close();
	}
}
