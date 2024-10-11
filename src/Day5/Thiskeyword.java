package Day5;

public class Thiskeyword {

	int x, y; // class variables / instance variables.

	/*
	 * Thiskeyword(int x, int y){
	 * 
	 * this.x = x; this.y = y; }
	 */
  
	void setData(int x, int y) {
		this.x = x;
		this.y = y;

	}

	void display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		// Thiskeyword t = new Thiskeyword(100, 200);

		Thiskeyword t = new Thiskeyword();
		t.setData(10, 20);
		t.display();

	}

}
