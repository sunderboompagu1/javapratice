package operators;

public class TernaryConditional {

	public static void main(String[] args) {
		//conditional/ternary operator= ?:
		//syntax :
		
		//variable =expression? result 1 : result 2;
		
		//ecample1
		
//		int a = 200, b = 100;
//		int res = a > b ? a:b;
//		System.out.println(res);
//		
		
		//example2
//		int x = (1==1)? 100:200;
//		System.out.println(x);
//		
		//int x = (1==2)?100:200;
		//System.out.println(x);
		
		int person_age = 15;
		String res = (person_age>18)?"eligible":"not eligible";
		System.out.println(res);
		
		
	}

}
