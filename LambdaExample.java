package lambda;

interface Message {
	void say();
}
public class LambdaExample{
	public static void main(String[]args) {
		Message hellomessage = () -> System.out.println("This is Lambda Example");
		hellomessage.say();
	}
}
