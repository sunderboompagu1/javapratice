package Day1;

public class stringComparession {

	public static void main(String[] args) {
		
		//CASE 1 
		String s = "Jesus";
		String Y = "Jesus";
		System.out.println(s==Y);
		System.out.println(s.equals(Y));
		
		
		//CASE 2
		String s1 = new String ("Jesus");
		String s2 = new String ("Jesus");
		System.out.println(s1==s2); // false = To compare the objects
		System.out.println(s1.equals(s2)); // True = To compare the value of the object.
		
		//CASE 3
		String s3 = "Jesus";
		String s4 = new String ("Jesus");
		String s5 = s4;
		
		System.out.println(s3==s4);  // false
		System.out.println(s3.equals(s5)); //true
		System.out.println(s4 == s5 ); // true because objects are same/equal
		
	}

}
