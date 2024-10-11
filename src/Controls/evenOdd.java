package Controls;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number: ");
		int a = scan.nextInt();

		if(a%2==0) {
			
			System.out.println("it is even: "+ a);
		}else {
			System.out.println("it is odd number: "+ a);
		}
		scan.close();
	}

}
