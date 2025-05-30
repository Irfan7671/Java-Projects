package xyz;

interface InterfaceExample{
	void print();
}
class Message implements InterfaceExample{
	public void print() {
		System.out.println("HELLO FROM INTERFACE");
	}
}
public class Printable{
	Message msg = new Message();
	msg.print();
}