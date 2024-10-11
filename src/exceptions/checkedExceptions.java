package exceptions;

public class checkedExceptions {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("started");
		System.out.println("in prograss");
		
		Thread.sleep(5000);
//		try {
//		Thread.sleep(5000);
//		}
//		catch( InterruptedException e)
//		{
//			System.out.println(e.getMessage());
//		}
		System.out.println("program finished");
		System.out.println("program exited");

	}

}
