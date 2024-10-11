package Day5;

public class StaticMain {

	public static void main(String[] args) {
		System.out.println(StaticDemo.a); // static variable does not need object to call from "StaticDemo" 
		StaticDemo.m1();// static method does not need object to call from "StaticDemo" 
		
	//	System.out.println(b); //non-static cant access
	//	m2(); // non-static method cant access.
		
		
		StaticDemo sd= new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		sd.m();

	}

}
