package xyz;

public class OopsTask {
	private String name;
	private int rollNo;
	private int marks;

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getRollNo() {
		return rollNo;
	}



	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public String checkResult() {
		if(marks >= 40) {
			return "pass";
		}else {
			return "Fail";
		}
		
	}
	public void displaydetails() {
		System.out.println("Rollno :"+getRollNo());
		System.out.println("Name :"+getName());
		System.out.println("Marks :"+getMarks());
		System.out.println("result : "+checkResult());
	}



	public static void main(String[] args) {
		OopsTask s1 = new OopsTask();
		s1.setMarks(50);
		s1.setRollNo(3310);
		s1.setName("Irfan");
		s1.checkResult();
		s1.displaydetails();
		

	}

}
