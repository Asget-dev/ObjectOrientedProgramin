package miu.edu.cafteria.mealcard;

public class MealCard {
	private int balance;
	private String student;

	public MealCard() {
		this.balance = 100;
	}

	public MealCard(int points) {
		this.balance = points;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public int getBalance() {
		return balance;
	}

	public String getStudent() {
		return student;
	}

	public void add(int addPoint) {
		this.balance += addPoint;
		System.out.println("Points of " + addPoint + " made. New meal card balance is " + this.balance + ".");
	}

	public void deduct(int deductPoint) {
		if (balance - deductPoint < 0) {
			System.out.println("Only " + balance + " available point. Meal purchased not processed");
		} else {
			this.balance -= deductPoint;
			System.out.println(student + " used of " + deductPoint + " point. Remaining balance point " + this.balance);
		}
	}

}