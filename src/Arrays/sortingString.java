package Arrays;

import java.util.Arrays;

public class sortingString {

	public static void main(String[] args) {
			
		char c[] = {'b', 'c', 'a', 'd'};
		
		System.out.println("before sorting..");
		System.out.println(Arrays.toString(c));
		
		Arrays.sort(c);
		
		System.out.println("after sorting..");
		System.out.println(Arrays.toString(c));
	}

}
