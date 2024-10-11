package Day7;


final class Test1{
	
	final void m() {
		System.out.println("this method is test1 class");
	}
}

class Test2 extends Test1{ // can no inhert the test1 class
	
	void m() {
		System.out.println("this m method from test2 class");
	}
}

public class FinalKeyWord2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
