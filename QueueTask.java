package xyz;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTask {

	public static void main(String[] args) {
		Queue<String> icecream = new LinkedList<String>();
		icecream.add("kid 1");
		icecream.add("kid 2");
		icecream.add("kid 3");
		icecream.add("kid 4");
		icecream.add("kid 5");
		System.out.println("The kids are in line : "+icecream);
		icecream.add("kid 6");
		System.out.println("The new kid is added in line : "+icecream);
		
		
		
	}

}
