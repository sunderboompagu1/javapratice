package Day8;

public class c1 extends c2 implements I1, I2 {
	
	public void m1() {
		System.out.println(x);  //I1 I2 are both 2 parents but We can achieve, multiple inheritance
	}
	
	public void m2() {
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		c1 obj = new c1();
		obj.m1();
		obj.m2();
		
		obj.m3();
	}

}
