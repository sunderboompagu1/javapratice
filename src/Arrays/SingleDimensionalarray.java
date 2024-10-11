package Arrays;


//1. declare an array
//2. add value into array.
//3. find size of an array
//4. read single value from an array.
//5. read multiple values from an array.

public class SingleDimensionalarray {

	public static void main(String[] args) {
		
		// declare an array approach1.
		
//		int a[] = new int[5];
//		a[0] = 100;
//		a[1] = 200;
//		a[2] = 300;
//		a[3] = 400;
//		a[4] = 500;

		//approach2
		int a[] = {100, 200, 300, 400, 500};
		
		//find the length of an array.
		//System.out.println(a.length);
		//read data from array from specific location.
		//System.out.println(a[4]);
		
		//reading all the values from array:
		//normal for loop.
		
		for(int i=0;i<=a.length-1; i++) { //i<=4 i<5 i<=a.leanght i<a.lenght
			
			System.out.println(a[i]);
			
		}
		
		//enhanced forLoop / for each
		
//		for(int x : a) {
//			System.out.println(x);
		}
		
		
}
