package xyz;

public class LinearsearchExample {

	public static void main(String[] args) {
		int [] numbers = {5,8,2,9,4,7};
		int target = 2;
		
		boolean isfound = false;
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==target) {
				System.out.println("Found"+" "+target+"  at index "+i);
				isfound = true;
				break;
			}
		}
		if(!isfound) {
			System.out.println("Target value is not in index");
		}

	}

}
