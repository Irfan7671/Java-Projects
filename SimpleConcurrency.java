package xyz;

class myTask extends Thread{
	private String taskName;
	public myTask(String taskName) {
		this.taskName = taskName;
	}
public void run() {
	for(int i=0;i<=5;i++) {
		System.out.println(taskName+ "Step" + i);
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			System.out.println(taskName+ "was Interrupted");
		}
	}
}
public class SimpleConcurrency {
	public static void main(String[]args) {
		myTask t1 = new myTask("Cooking");
		myTask t2 = new myTask("Washing");
		t1.start();
		t2.start();
		}
	}
}
