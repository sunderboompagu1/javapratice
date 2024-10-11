package Day3;

public class Greetings_Main_class {

	public static void main(String[] args) {

		Greetings gr = new Greetings();
		gr.m1(); // 1.

		String s = gr.m2(); // 2.
		System.out.println(s);// if you return something we need to hold it in variable and print it.

		gr.m3("is the light");// 3.

		String j = gr.m4("is the way"); //4.
		System.out.println(j);
	}

}
