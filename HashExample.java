package demo;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;

public class HashExample {

	public static void main(String[] args) {
		HashSet<String> mobiles = new HashSet<String>();
		mobiles.add("Moto");
		mobiles.add("Blackberry");
		mobiles.add("Iphone");
		mobiles.add("IQ00");
		mobiles.add("Realme");
		mobiles.add("Vivo");
		mobiles.add("Iphone");
		
		ArrayList<String> arr = new ArrayList<>(mobiles);
		System.out.println(arr);
		
		Iterator<String> iterator = mobiles.iterator();
		while(iterator.hasNext()) {
			String phone = iterator.next();
					System.out.println(phone);
		 }
 	}

}
