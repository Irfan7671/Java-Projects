package xyz;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExample3 {

	public static void main(String[] args) {
		TreeSet<String> product = new TreeSet<String>();
		Scanner sc = new Scanner(System.in);
		product.add("Keyboard");
		product.add("Mouse");
		product.add("Monitor");
		product.add("CPU");
		product.add("Webcam");
		System.out.println("There are some Product names : "+product);
		System.out.println("Enter the product name : ");
		String pdname = sc.nextLine();
		
		if(product.contains(pdname)) {
			System.out.println("exist");
		}else {
			System.out.println("Not exist");
		}
		sc.close();

	}
	

}
