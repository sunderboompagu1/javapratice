package Day2;

public class Employee {

	// class contains variables here it is
	int eid;
	String name;
	String job;
	int sal;

	// Method
	void display() {
		System.out.println(eid);
		System.out.println(name);
		System.out.println(job);
		System.out.println(sal);
	}

	// this is Main method below always treat it special because execution will
	// start always start with main method.
	// objects are created only in the main method not any where else.

	/*public static void main(String[] args) {

		// emp1 contains variables and methods which we have created.

		Employee emp1 = new Employee(); // object
		emp1.eid = 1191;
		emp1.name = "Sunder";
		emp1.job = "QA engnieer";
		emp1.sal = 31000;
		emp1.display();

		Employee emp2 = new Employee();
		emp2.eid = 1191;
		emp2.name = "Boompagu";
		emp2.job = "SDET";
		emp2.sal = 10000;
		emp2.display();
	}*/

}
