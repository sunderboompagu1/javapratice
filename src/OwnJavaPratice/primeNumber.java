package OwnJavaPratice;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {

//		boolean prime = true;
//		Scanner sc = new Scanner(System.in);
//		int ans =sc.nextInt();
//			
//			for(int i =2;i<ans;i++) {
//				
//				
//					if(ans % i == 0) {
//						prime = false;
//						break;
//						
//					}
//			}
//			System.out.println(ans + "is prime number");

		int num = 3;
		int count = 0;
		if (num > 1) {

			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++; // this code helps to divide the number with in the range if 3 = 1 , 2, 3
				}
			}
			if (count == 2) { // this code help if the count ha more than 2 factors it is not prime
				System.out.println("prime number"); // because prime is has only two factors 1 and it self
			} else {
				System.out.println("not prime");
			} // Example: 3 Apples
			// You have 3 apples.
			// The ways to divide them are:
			// 1 apple for 1 friend (and 2 apples for another friend).
			// 3 apples for 1 friend (the entire batch for one friend).
			// So, the factors of 3 apples are:
			//
			// 1 (1 friend)
			// 3 (3 apples for 1 friend)
			// Since you can only divide 3 apples into two equal groups (1 and 3), 3 is a
			// prime num

		}
		System.out.println("not prime");
	}
}
