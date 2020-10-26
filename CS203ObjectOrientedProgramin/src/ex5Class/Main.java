package ex5Class;

public class Main {

	public static void main(String[] args) {
		StudentProfile profileOne = new StudentProfile("Sally", "Salmon", "Film", 3.75, 2022);
		StudentProfile profileTwo = new StudentProfile("Belak", "Samson", "Accounting", 3.75, 2023);
		System.out.println(profileOne.declaredMajor);
		profileTwo.incrementExpectedGraduationYear();
		System.out.println(profileTwo.expectedYearToGraduate);
	}
}
