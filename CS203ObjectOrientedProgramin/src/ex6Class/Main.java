package ex6Class;

public class Main {

	public static void main(String[] args) {
		Account myBankAccount = new Account(4141, 100);

		myBankAccount.deposit(-60);
		myBankAccount.withdraw(150);

		myBankAccount.deposit(100);
		myBankAccount.withdraw(200);
		System.out.println();

	}

}
