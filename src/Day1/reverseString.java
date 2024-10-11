package Day1;

public class reverseString {

	public static void main(String[] args) {
		
		//Approch 1 - length() , charAT()
		
		String s = "Sunder";
		String rev = "";
		for(int i=s.length()-1 ; i >= 0 ; i --)
		{
			rev=rev + s.charAt(i);
		}
		System.out.println("Reverse string is:" + rev);
		
		//Approch2 by converting string to char array type
		String R = "Boompagu";
		String reverse ="";
		
		char a[] = R.toCharArray();
		for(int i = R.length()-1; i >= 0 ; i--)
		{
			reverse= reverse + a[i]; 
		}
		System.out.println(reverse);
		
		//Apprch3
		StringBuffer N = new StringBuffer("Chanti");
		System.out.println(N.reverse());
		
	}

}
