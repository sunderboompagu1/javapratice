package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class readingAndWritingDataIntoArray {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<a.length;i++) {
			System.out.println("Please enter value of " +i+ ":");
			
			a[i]=sc.nextInt();
		}
		System.out.println("values entered :" + Arrays.toString(a) );
	}

}
