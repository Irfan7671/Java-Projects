package xyz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueueTask {

	public static void main(String[] args) {
		Stack<String> toys = new Stack<String>();
		toys.push("Ball");
		toys.push("Blocks");
		toys.push("Puzzle");
		System.out.println("The ToyBox is contains : "+toys);
		System.out.println("The toy is top in ToyBox : "+toys.peek());
		System.out.println("The toy is Takeout from ToyBox : "+toys.pop());
		System.out.println("The remaining toys is in ToyBox : ");
		System.out.println(toys);
		
		
		Queue<String> icecream = new LinkedList<String>();
		icecream.add("Maya");
		icecream.add("Leo");
		icecream.add("Nina");
		System.out.println("The kids are in line : "+icecream);
		System.out.println("Serve the first kid : "+icecream.poll());
		System.out.println("The remaining kids are in line : "+icecream);
		

	}

}
