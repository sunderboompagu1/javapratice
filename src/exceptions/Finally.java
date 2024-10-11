package exceptions;

public class Finally {

	public static void main(String[] args) {
		
		System.out.println("program strated");
		String s = null;
		try {
		System.out.println(s.length());

		}
		catch(NullPointerException e) {
			System.out.println("Handled4"); 
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("you entered into finally");
		}
		
		System.out.println("program ended");

}
}
