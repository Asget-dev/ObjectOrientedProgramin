package weekOneReview.car.classPart2;

public class Main {

	public static void main(String[] args) {
		BankAccount asgetAccount = new BankAccount();// ("12345", 0.00, "Asgedom Hailemariam", "asgedom@miu.edu",
		// "(555-555-5555)");
		System.out.println(asgetAccount.getAccountNumber());
		asgetAccount.withdrawalFund(100.0);
		asgetAccount.depositFund(50);
		asgetAccount.withdrawalFund(100);
		asgetAccount.depositFund(51);
		asgetAccount.withdrawalFund(100);
		System.out.println();
		VipCustomer person1 = new VipCustomer();
		System.out.println(person1.getEmailAddress());

		VipCustomer person2 = new VipCustomer();
		System.out.println(person2.getName());

		VipCustomer person3 = new VipCustomer("WintaNega", 100, "tim@gmail.com");
		System.out.println(person3.getName());
	}

}
