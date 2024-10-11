package Day8;

interface shape {
	int length = 10; // final & static
	int width = 20; // final & static

	void circle(); // abstract method

	default void squre() { // default method
		System.out.println("this is squre");
	}

	static void rectangle() { // static methods
		System.out.println("this is rectangle- static method");
	}

}

public class interfaceDemo implements shape {

	public void circle() {

		System.out.println("this is circle - abstract method");
	}

	void triangle() {
		System.out.println("this is own method of class not interface that why no need of public.");
	}

	public static void main(String[] args) {

		// Scenario 1
		interfaceDemo idobj = new interfaceDemo();
//		idobj.circle();//abstract method
//		idobj.squre(); // default method
//		
//		shape.rectangle();// static method can directly access from interface.
		idobj.triangle();
		// Scenario2
		shape sh = new interfaceDemo(); // created object for the interfacedemo class your holding it into interface.
		sh.circle(); // abstract
		sh.squre(); // default

		shape.rectangle();// static method can directly access from interface.
		
		System.out.println(shape.length * shape.width); //access static variables directly.

	}

}
