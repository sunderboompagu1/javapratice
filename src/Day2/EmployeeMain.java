package Day2;

public class EmployeeMain {

	public static void main(String[] args) {
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
	}

}
