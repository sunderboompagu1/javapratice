package exceptions;

public class multipleExceptions {

	public static void main(String[] args) {
		
			System.out.println("program has started");
			
			String s = null;
			try {
			System.out.println(s.length());
			}
//			catch(ArithmeticException e) {
//				System.out.println(e.getMessage());
//				System.out.println("Handled1");
//			}
//			catch(NullPointerException e){
//				System.out.println("Handled2");
//				System.out.println(e.getMessage());
//			}
//			catch(NumberFormatException e) {
//				System.out.println("Handled3");
//				System.out.println(e.getMessage());
//			}
			
			catch(Exception e) {
				System.out.println("Handled4");
				System.out.println(e.getMessage());
			}
			
			
			System.out.println("program ended");

	}

}
