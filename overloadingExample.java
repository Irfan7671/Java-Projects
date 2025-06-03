package practice;
class calculator{
		int calc(int a ,int b) {
			return a+b;
		}
		double calc1(double a , double b) {
			return a*b;
		}
		int calc2(int a,int b) {
			return a/b;
		}
	}

public class overloadingExample {
	
	public static void main(String[] args) {
		calculator c = new calculator();
		System.out.println(c.calc(10,30));
		System.out.println(c.calc1(23.5,5.6));
		System.out.println(c.calc2(5,10));

	}

}
