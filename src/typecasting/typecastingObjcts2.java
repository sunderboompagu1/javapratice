package typecasting;

//cat ct = (cat)a; //cat =a , ct =b , (cat)=c , a=d , 


class animal{}

class dog extends animal{}
class cat extends animal{}



public class typecastingObjcts2 {

	public static void main(String[] args) {
			
		//Rule 1 conversion  is valid or not
		//the type of d , c must have  some relationship (eaither parent to child or child to parent)
		
////		animal a = new dog(); 
////		cat ct = (cat)a; // vaild as per rule 1 extedns
////		
//		dog dg = new dog();
//		cat ct =(cat) dg; //invalid as per rule 1
		
		// rule 2: assingement is valid or not
		// c must be eaither same r child of 'A'
	}

}
