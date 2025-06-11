package xyz;

public class BinarySearchExample {

	public static void main(String[] args) {
		int [] arr = {4,6,2,8,1,9,5};
		int target = 2;
		int low = 0;
		int high = arr.length-1;
		boolean isfound = false;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==target) {
				System.out.println("The target value is index "+mid);
				isfound = true;
				break;
			}
			else if(arr[mid]<target){
				low = mid+1;
				}
			else {
				high = mid-1;
			}
				
		}
		if(!isfound) {
			System.out.println("This is not an Array");
		}
	}

}

