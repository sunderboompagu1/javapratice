package Day3;

public class Greetings {

	// 1. No params - no return value.

	void m1() {
		System.out.println("Jesus...");
	}

	// 2. No params - Return value.
	// if you return something we need to hold it in variable and print it.

	String m2() {
		return "Is True GOD...";
	}

	// 3. Take params - No return value.
	void m3(String name) {
		System.out.println("Jesus" + name);

	}

	// 4. Take params - Return value.
	String m4(String name) {
		return ("Jesus" + name);
	}
}
