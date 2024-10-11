package Day4;

public class Account {

	private int accno;//if we use private we can access this varible directly.
	private String name;
	private double amount;

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) { // int accno is local variable.
		this.accno = accno;// this.accno is always class variable.
		// when ever we use class & method variable same we use this keyword.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
