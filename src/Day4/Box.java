package Day4;

public class Box {

	double widthe, hight, depth;

	Box() {//1

		/*
		 * widthe = 0; hight = 0; depth = 0;
		 */

		widthe = hight = depth = 0;
	}

	Box(double w, double h, double d) { //2

		widthe = w;
		hight = h;
		depth = d;
	}
	
	Box(double len){ //3
		
		widthe = hight = depth = len;
	}
	
	double volume() {
		
	 return	(widthe * hight * depth);
	}
	

}
