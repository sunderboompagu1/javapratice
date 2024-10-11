package Day3;

public class StudentMain {

	public static void main(String[] args) {
		
		//Student stu = new Student();
		
		//1. store data using object reference variable.
	/*	stu.sid = 1;
		stu.name= "sunder";
		stu.grade = 'A';
		
		stu.printStudentData();*/ 
		
		//2. Using method.
		
		/*stu.setStudentData(2, "Boompagu", 'A');
		stu.printStudentData();*/
		
		//3. using constructor
		
		// at the time of object creation automatically it will run. 
		// so create an object with params.
		Student stu = new Student(1,"sunder",'B');
		stu.printStudentData();
	}

}
   