package exceptions;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
//			System.out.println("Program Started");
//			
//			Scanner sc = new Scanner(System.in);
//			int a =sc.nextInt();
//			System.out.println(100/a); //ArithmeticException if you divide with zero.
//			
//			System.out.println("Program Ended");
		
			System.out.println("Program started");
			Scanner sc = new Scanner(System.in);
		
			int a[] = new int[5];
			System.out.println("Enter into postion(0-4)");
			int pos = sc.nextInt();
			
			System.out.println("enter value");
			int val = sc.nextInt();
			
			a[pos] =val;
			
			System.out.println("enterd valus is :"+ (a[pos])); //ArrayIndexOutOfBoundsException IF YOU give 5 position and value.
			
	}

}
