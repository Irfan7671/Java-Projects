package practice;
class Animal{
	void sound() {
		System.out.println("Animal make sound");
	}
}
class dog extends Animal{
	@Override
	void sound() {
		System.out.println("Dog Barks");
	}
}
class cat extends Animal{
	@Override
	void sound() {
		System.out.println("cat Meow");
	}
}

public class overridingExample {

	public static void main(String[] args) {
		Animal MyAnimal = new Animal();
		Animal MyDog = new dog();
		Animal Mycat = new cat();
		MyAnimal.sound();
		MyDog.sound();
		Mycat.sound();
	}

}
