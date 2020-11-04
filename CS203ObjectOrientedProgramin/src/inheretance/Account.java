package inheretance;

public class Account {
	private String number;
	private double balance;

///constractor
	public Account(String number, double balance) {
		super();
		this.number = number;
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public boolean withdraw(double amount) {
		boolean result = true;
		if (amount < balance) {
			balance -= amount;
		} else {
			result = false;
		}
		return result;
	}

//geter and setter
	public String getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

}
