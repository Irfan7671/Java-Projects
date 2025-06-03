package demo;

import java.util.ArrayList;
import java.util.LinkedList;

class Arraylist{
	public void ArrayList() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Basi Reddy");
		names.add("Irfan");
		names.add("Jayanth");
		System.out.println("List Of Students:");
		System.out.println(names);
	}
	
}
class Linkedlist extends Arraylist{
	public void Linkedlist() {
		LinkedList<String> cities = new LinkedList<String>();
		cities.add("Kochi");
		cities.add("Kerala");
		cities.add("Manali");
		System.out.println("List Of Cities:");
		System.out.println(cities);
	}
}




public class AllLists {

	public static void main(String[] args) {
		Linkedlist d = new Linkedlist();
		d.ArrayList();
		d.Linkedlist();
		

	}

}
