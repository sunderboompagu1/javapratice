package typecasting;

class parent{
	
		String name = "john";
	void ma() {
		System.out.println("this is m1 parent");
	}
}

class child extends parent{
	
	int id = 101;
	void m2() {
		System.out.println("this is m2 from child");
	}
}

public class typecastingobjects {
	
	 	 public static void main(String[] args) {
			
//	 		 child c = new child();
//	 		 System.out.println(c.name);//parent
//	 		 c.ma();
//	 		 System.out.println(c.id);//child
//	 		 c.m2();
	 		 
//	 		 parent p = new parent();//upcasting
//	 		 System.out.println(p.name); //parent
//	 		 
//	 		 System.out.println(p.id); // we can not access
//	 		 p.m2(); // we can not access
//	 		
	 		 parent p = new parent();
	 		 child c =(child) p;
	 		 System.out.println(c.name);
	 		 System.out.println(c.id);
	 		 c.ma();
	 		 c.m2();
	 		 
	 		 
	 		 
		}
}
