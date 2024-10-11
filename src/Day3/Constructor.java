package Day3;

public class Constructor {

	int x, y;

	Constructor() { // default constructor with no parameters.

		x = 1;
		y = 2;
	}

	Constructor(int a, int b) { // Parameterized constructor with no parameters.

		x = a;
		y = b;
	}

	void sum() {

		System.out.println(x + y);
	}

	public static void main(String[] args) {
		// Constructor c = new Constructor(); // invoke default constructor.

		Constructor c = new Constructor(10, 20); // invoke parameterized constructor.
		c.sum();

	}

}
