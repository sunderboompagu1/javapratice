package Day7;

public class SuperKeyWord {

	String color = "black";

	void eat() {
		System.out.println("eating");
	}

}

class Dog extends SuperKeyWord {
	String color = "white";

	void display() {
		System.out.println(super.color); 
	}

	void eat() {
		// System.out.println("eating bread");// overriding
		super.eat();// super helps to invoke 1st supper
					// class method

	}
}