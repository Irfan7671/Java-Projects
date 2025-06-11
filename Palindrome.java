package xyz;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int originalnum = n;
		int reversednum = 0;
		while(n>0) {
			int val = n % 10;
			reversednum = reversednum * 10 + val;
			n = n/10;
		}
		if(reversednum == originalnum) {
			System.out.println("It is a Palindrome");
		}else {
			System.out.println("It is not a Palindrome");
		}
		sc.close();

	}
	

}
