package professional;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> num = new TreeSet<Integer>();
		num.add(10);
		num.add(30);
		num.add(50);
		num.add(20);
		num.add(40);
		System.out.println(num);
		System.out.println(num.first());
		System.out.println(num.higher(30));
		System.out.println(num.size());
		System.out.println(num.reversed());
		System.out.println(num.lower(30));

	}

}
