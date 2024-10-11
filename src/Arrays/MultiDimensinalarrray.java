package Arrays;

//1. declare an array
//2. add value into array.
//3. find size of an array
//4. read single value from an array.
//5. read multiple values from an array

public class MultiDimensinalarrray {

	public static void main(String[] args) {
		
		//Declaring array
		
		//Approach 1
//		int a[][] = new int[3][2];
//
//		a[0][0] = 100;
//		a[0][1] = 200;
//		
//		a[1][0] = 300;
//		a[1][1] = 400;
//		
//		a[2][0] = 500;
//		a[2][1] = 600;
		
		//Approach2
		
		int a[][] = {{100,200},{300,400},{500,600}};
		
		//find size of an array.
		System.out.println("length of a length: "+ a.length);
		System.out.println("length of a row: "+ a[0].length);
		//System.out.println(a[2][1]);
		
		//normal for
//		for(int r=0;r<=a.length-1 ;r++) 
//		{
//			for(int c=0;c<=a[r].length-1;c++) {
//				
//				System.out.print(a[r][c]+"  ");
//			}
//		}System.out.println();
		
		
		for(int arr[] :a) {// holding multiple values into single variable it should sing dimensional array. arr[] is a varabble
			for(int x: arr) {
				System.out.print(x+"  ");
			}
			System.out.println();
		}
		
	}

}
