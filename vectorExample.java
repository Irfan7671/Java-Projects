package demo;

import java.util.Enumeration;
import java.util.Vector;

public class vectorExample {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<>();
        vec.add("Red");
        vec.add("Green");
        vec.add("Blue");

        Enumeration<String> e = vec.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
	}

}
