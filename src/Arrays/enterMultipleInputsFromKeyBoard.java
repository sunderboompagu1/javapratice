package Arrays;

import java.util.Scanner;

public class enterMultipleInputsFromKeyBoard {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st number");
		int num1 = sc.nextInt();
		
		System.out.println("enter 2n number");
		int num2 = sc.nextInt();
		
		System.out.println("Addition of two numbers:"+ (num1 + num2) );
	}

}
