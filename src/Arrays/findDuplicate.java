package Arrays;

public class findDuplicate {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,10,40,50,10,60,10,70,80,90,10,100};
		int value = 10;
		int count = 0;
		
		
		for(int i =0;i<=a.length-1;i++) {
			
			if(a[i]==value) {
				count ++;
			}
			
		}
		System.out.println("Number of duplicates are:"+ count);

	}

}
