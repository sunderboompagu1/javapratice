package Day1;

import java.util.Arrays;

public class mutableVSimmutable {

	public static void main(String[] args) {
		
		//Mutable can change
		int a[] = {20,10,40,30,50};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a); //mutable 
		System.out.println(Arrays.toString(a));
		
		//Immutable
		String s = new String("welome");
		s.concat("to java");
		System.out.println(s);
		
		//string buffer - mutable
		StringBuffer b = new StringBuffer("Jesus");
		b.append("is saviour");
		System.out.println(b); //mutable, we can change  original of b value.
		
		//string builder- mutable
		StringBuilder J = new StringBuilder("Jesus");
		J.append("I love you");
		System.out.println(J);
	}

}
