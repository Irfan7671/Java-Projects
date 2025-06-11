package xyz;

import java.util.Stack;

public class StackTask {

	public static void main(String[] args) {
		Stack<String> plates = new Stack<String>();
		plates.push("plate 1");
		plates.push("plate 2");
		plates.push("plate 3");
		plates.push("plate 4");
		plates.push("plate 5");
		System.out.println("Clean plate is : "+plates.peek());
		System.out.println("Take the top plate : "+ plates.pop());
		System.out.println("Plates are left in stack :");
		
		for(String plate : plates) {
			System.out.println(plate);
		}
		

	}

}