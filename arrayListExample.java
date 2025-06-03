package demo;
import java.util.ArrayList;
import java.util.Collections;

public class arrayListExample {

	public static void main(String[] args) {
		ArrayList<String> mobiles = new ArrayList<String>();
		mobiles.add("Moto");
		mobiles.add("Blackberry");
		mobiles.add("Iphone");
		mobiles.add("IQ00");
		mobiles.add("Realme");
		mobiles.add("Vivo");
		mobiles.remove(4);
		
		int idx = mobiles.indexOf("Blackberry");
		System.out.println(idx);
		
		Collections.sort(mobiles);
		for(int i=0;i<mobiles.size();i++) {
			System.out.println(mobiles);
		}
		System.out.println();
		
		Collections.reverse(mobiles);
			for(int i=mobiles.size();i>=0;i--) {
				System.out.println(mobiles);
			}
		
		if(mobiles.contains("blackberry")){
			System.out.println("Exist");
		}else {
			System.out.println("Does not Exist");
		}

	}

}
