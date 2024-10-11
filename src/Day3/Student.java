package Day3;

public class Student {
	//class variables
		int sid;
		String name;
		char grade;
		
		//1.method only prints/
		// 1.1 methods may or will be return value.
		//1.2 we can loops, if's , any logic.
		void printStudentData() {
			System.out.println(sid+" "+name+" "+grade);
		}
		
		
		// local variables / method specific variables.
		//2. method which can only assign data to variables.
		void setStudentData(int id, String sname, char grad) {
			
			sid= id;
			name=sname;
			grade=grad;
		}
		
		//3. constructor
		// it will return nothing any value not even void.
		// only to enisalise  the data to variables
		//Constructor name should be same as class name.
		//it will not allow to write any logic to write.
		
		Student(int id, String sname, char grad){

			sid= id;
			name=sname;
			grade=grad;
		}
		
		
		
}
