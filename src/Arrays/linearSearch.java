package Arrays;

public class linearSearch {

	public static void main(String[] args) {
		
		int a[] = {10, 20, 30, 40, 50};
		int search_val = 100;
		boolean status = false; // false means not found // true means found
		
		/*for(int i=0;i<=a.length-1;i++) {
			
			if(a[i]==search_val) {
				
				System.out.println("Value found");
				status = true;
				break;
			}
		}*/
		
			for(int x:a) {
			
			if(x==search_val) {
				
				System.out.println("Value found");
				status = true;
				break;
		
		}
			}
			if(status==false) {
				System.out.println("element not found");
			}
	}
}
