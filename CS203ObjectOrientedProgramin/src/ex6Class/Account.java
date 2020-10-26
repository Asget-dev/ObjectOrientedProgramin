package ex6Class;

public class Account {
	private int accountNumber;
	private int accountBalance;

	public Account(int accountNumber, int accountBalance) {
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
		System.out.println("You created account" + this.accountNumber);
	}

	public void deposit(int addMoney) {
		if (addMoney < 0) {
			System.out.println("You cannot deposit  a" + "negative amount. ");
		} else {
			this.accountBalance = this.accountBalance + addMoney;
			System.out.println("$" + addMoney + " " + "deposited into account " + this.accountNumber + ".");
		}
	}

	public void withdraw(int removeMoney) {
		if (removeMoney < this.accountBalance) {
			System.out.println("You cannot remove more " + "thanwhat is in your account");
		} else {
			this.accountBalance = (this.accountBalance - removeMoney);
			System.out.println("$" + removeMoney + "has been withdrawn from account " + this.accountNumber + ".");
		}
	}

}
