package Day9;

public class DataConversionMethod {

	public static void main(String[] args) {
		
		
		//String s = "welcome"; // can not convert into int
		
//		String s1 = "10";
//		String s2 = "20";
//		
//		System.out.println(Integer.parseInt(s1)+ Integer.parseInt(s2));
//		
		//String ---> double
		
//		String  s1 = "20.5";
//		String s2 = "10.5";
//		System.out.println(Double.parseDouble(s1)+ Double.parseDouble(s2));
		
		String s = "false";
		System.out.println(Boolean.parseBoolean(s));
		
		
		int a = 10;
		double b = 20.5;
		char c = 'a';
		boolean d = true;
		
		String v = String.valueOf(a);
		System.out.println(v);
		
		v= String.valueOf(b);
		System.out.println(v);
		
		
	}

}
