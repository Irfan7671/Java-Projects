package xyz;

import java.util.Stack;

public class burgerStack {

	public static void main(String[] args) {
		Stack<String> burger = new Stack<String>();
		burger.push("Burger 1");
		burger.push("Burger 2");
		burger.push("Burger 3");
		System.out.println("Top Burger is :"+burger.peek());
		System.out.println("Serving"+burger.pop());
		if(burger.isEmpty()) {
			System.out.println("All burgers are served");
		}
	}

}
