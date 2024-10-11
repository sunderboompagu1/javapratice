package Day7;

class Bank {
	double rio() {
		return 0;
	}
}

class ICICI extends Bank {
	double rio() {
		return 10.5;
	}
} // method over riding method is same but implimention is different.

class SBI extends Bank {
	double rio() {
		return 20.5;
	}
}

public class OverRidingMethod {

	public static void main(String[] args) {

		ICICI ic = new ICICI();
		System.out.println(ic.rio());

		SBI sb = new SBI();
		System.out.println(sb.rio());

	}

}
