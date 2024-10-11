package operators;

public class arthamaticOprts {

	public static void main(String[] args) {
		
		//1)  Arithmetic operators + - * / %
		
		int a = 10, b = 20;
		
		System.out.println("addition of number" + (a + b));
		System.out.println("sburaction of number" + (a - b));
		System.out.println("multiplication of number" + (a * b));
		System.out.println("devision of number" + (a / b));
		System.out.println("modulo devision of number" + (a % b));
		
		
		//2) Relational/comparison operatora= >, >=, <, <=, !=, ==
			// this will return always return boolen.
		//only between only 2 varibles
		System.out.println(a>b); //false
		System.out.println(a<b); //true
		System.out.println(a>=b); //false
		
		a=20;
		System.out.println(a>=b); //true
		System.out.println(a<=b); //true
		System.out.println(a!=b);//false
		System.out.println(a==b); //true
		
			boolean res= a>b;
			System.out.println(res); //false
			
		//	Logical operators= &&, ||, !
			// this will also return always return boolean.
			// works between 2 boolean variables.
			
			
			boolean x = true;
			boolean y = false;
		
			System.out.println(x && y); // false
			System.out.println(x || y); //true
			System.out.println(!x); //false
			System.out.println(!y); //true
			
			boolean b1 = 10>20;
			boolean b2 = 20> 10;
			
			System.out.println(b1); //true
			System.out.println(b2); //false
			
			System.out.println(b1 && b2); //false both should be true then only true
			System.out.println(b1 || b2); // true at least one value is true in || true
			
			System.out.println((10<20) && (20>10)); // true
			
		
		
	}

}
