package Day5;

public class StaticDemo {

	static int a = 10; // static variable
	int b= 20; // non-static 

	
	static void m1 () {
		System.out.println("this is static method");
	}
	
	void m2() {
		System.out.println("this is non-static method");	
	}
	
	void m() { // non static method.
		
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	//public static void main(String[] args) {
	/*	System.out.println(a); // static variable does not need object to call from "StaticDemo" 
		m1();// static method does not need object to call from "StaticDemo" 
		
		//System.out.println(b); //non-static cant access
		//m2(); // non-static method cant access.
		
		
		StaticDemo sd= new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		sd.m();*/
		
	}

