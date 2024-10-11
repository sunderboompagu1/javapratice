package Day7;

class ABC {
	void m1(int a) {

		System.out.println(a);
	}

	void m2(int b) {
		System.out.println(b);
	}
}

class XYZ extends ABC {
	void m1(int a) { // overriding because only implemention is changed. only with inhertence
						// over rided method will run always.
		System.out.println(a * a);
	}

	void m2(int a, int b) { // overloading because we als changing the diclarerition as well only method name is same. only polymosrshim.
		System.out.println(a + b);
	}

}

public class OverloadingVSOverriding {

	public static void main(String[] args) {
	
		XYZ xyzobj = new XYZ();
		xyzobj.m1(10); // overrided
		xyzobj.m2(20);//over loaded
		xyzobj.m2(10, 20); // over loaded

	}

}
