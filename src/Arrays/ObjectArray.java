package Arrays;

public class ObjectArray {

	public static void main(String[] args) {
		
		
		//Object a[]= {100, 10.5,'A',"welcome",true};
		
//		for(Object x : a) {
//			System.out.println(x);
//		}
		
//		for(int i =0; i<=a.length-1;i++) {
//			System.out.println(a[i]);
		//}

		        int a[] = {1, 2, 3, 4, 5, 6, 7, 10};
		        
		        // Loop through each element in the array
		        for (int i = 0; i <= a.length - 1; i++) {
		            // Check if the current element is even
		            if (a[i] % 2 == 0) {
		                // If it's even, print the even number
		                System.out.println("Even number: " + a[i]);
		            } else {
		                // If it's not even (i.e., odd), print the odd number
		                System.out.println("Odd number: " + a[i]);
		            }
		        }

	}
	

}
