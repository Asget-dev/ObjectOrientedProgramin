package weekOneReview.car.classPart2;

public class BankAccount {
	private String accountNumber;
	private double balance;
	private String CustomerName;
	private String email;
	private String phoneNumber;

	public BankAccount() {
		this("56789", 208, "defaultName", "default address", "default phone");
	}

	public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		CustomerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void depositFund(double depositAmount) {
		this.balance += depositAmount;
	}

	public void withdrawalFund(double withdrawal) {
		if (this.balance - withdrawal < 0) {
			System.out.println("Only " + this.balance + "available. withdrawal not processed");
		} else {
			this.balance -= withdrawal;
			System.out.println("withdrawal of " + withdrawal + "processed. Remaining balance is" + this.balance);
		}
	}

}
