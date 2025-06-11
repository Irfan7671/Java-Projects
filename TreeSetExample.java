package xyz;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> books = new TreeSet<Integer>();
		books.add(5002);
		books.add(4998);
		books.add(5005);
		books.add(4999);
		books.add(5001);
		System.out.println(books);
		System.out.println("The first book ID is : "+books.first());
		System.out.println("The Last book ID is : "+books.last());
		System.out.println("The Id just greater than 4999 : "+books.higher(4999));
		System.out.println("The Id just lower than 5005 : "+books.lower(5005));

	}

}
