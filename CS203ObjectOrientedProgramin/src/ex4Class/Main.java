package ex4Class;

public class Main {

	public static void main(String[] args) {
		Account asgetsAccount = new Account(12345, 0.00, "Asgedom Hailemariam", "asget@gmil.com", "555-555-555");
		System.out.println(asgetsAccount.getBalance());
		System.out.println(asgetsAccount.getAccountNumber());
		asgetsAccount.withdrawal(100.0);

		asgetsAccount.deposit(50.0);
		asgetsAccount.withdrawal(100.0);

		asgetsAccount.deposit(51.0);
		asgetsAccount.withdrawal(100.0);

	}

}
