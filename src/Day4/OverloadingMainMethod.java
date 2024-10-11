package Day4;

public class OverloadingMainMethod {

	
	void main(int x) {
		
		System.out.println(x);
	}
	void main(String s) {
		System.out.println(s);
	}
	void main (String x, String y) {
	System.out.println(x+y);	
	}
	
	
	public static void main(String[] args) { //args is string array type of argument.
		
		OverloadingMainMethod ov= new OverloadingMainMethod();
		ov.main(10);
		ov.main("sunder");
		ov.main("jesuses", "servent");
		
	}

}
