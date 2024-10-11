package Day4;

public class AddweMain {

	public static void main(String[] args) {

		Adder add = new Adder();
		add.sum(); // 1

		add.sum(100, 200); // 2

		add.sum(10.5, 10); // 4
		
		add.sum(10, 30.5);// 3
	}

}
