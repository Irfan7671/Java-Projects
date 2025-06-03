package xyz;

class Car implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println(" BMW car is Moving"+i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
}
class Bike implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("NINJA bike is Moving"+i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
}

public class simpleRace{

	public static void main(String[] args) {
		Thread caThread = new Thread(new Car());
		Thread baThread =  new Thread(new Bike());
		System.out.println("Car");
		System.out.println("Bike");
		caThread.start();
		baThread.start();
		 
		
	}
}
