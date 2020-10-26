package ex4Class;

public class Account {
	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;

	public Account() {
		System.out.println("Empty constractor called");
	}

	public Account(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
		System.out.println("Account constractor with parameters called");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public void deposit(double depositAmount) {
		balance += depositAmount;
		System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
	}

	public void withdrawal(double withdrawalAmount) {
		if (this.balance - withdrawalAmount < 0) {
			System.out.println("Only " + this.balance + " available. withdrawal not processed");
		} else {
			this.balance -= withdrawalAmount;
			System.out
					.println("Withdrawal of " + withdrawalAmount + " processed.  Remaining balance = " + this.balance);
		}
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
