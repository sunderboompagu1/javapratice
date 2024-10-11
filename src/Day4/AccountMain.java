package Day4;

public class AccountMain {

	public static void main(String[] args) {

		Account ac = new Account();

		ac.setAccno(1);
		ac.setAmount(31000);
		ac.setName("sunder");

		System.out.println(ac.getAccno());
		System.out.println(ac.getAmount());
		System.out.println(ac.getName());
	}

}
