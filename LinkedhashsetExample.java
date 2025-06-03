package demo;

import java.util.LinkedHashSet;

public class LinkedhashsetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> candies = new LinkedHashSet<String>();
		candies.add("Choco");
		candies.add("waterMelon");
		candies.add("Mango");
		candies.add("Choco");
		System.out.println(candies);

	}

}
