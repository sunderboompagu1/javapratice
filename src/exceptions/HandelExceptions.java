package exceptions;

import java.util.Scanner;

public class HandelExceptions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt(); // chance of getting exception
		
		try {
		System.out.println(100/a); //ArithmeticException if you divide with zero.
		}
		catch(ArithmeticException e) {
			
			System.out.println("Invalid data");
		}
		
		System.out.println("program completed");
		System.out.println("program exited");
	}

}
