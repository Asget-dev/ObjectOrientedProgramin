package ex1Class;

public class SimpleCalculator {
	private double firstNumber;
	private double secondNumber;

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getFirstNumber() {
		return this.firstNumber;
	}

	public void setSecondNumber(int d) {
		this.secondNumber = d;
	}

	public double getSecondNumber() {
		return this.secondNumber;
	}

	public double getAdditionResult() {
		return getFirstNumber() + getSecondNumber();
	}

	public double getSubtractionResult() {
		return getFirstNumber() - getSecondNumber();
	}

	public double getMultiplicationResult() {
		return getFirstNumber() * getSecondNumber();
	}

//	public void setDivisionResult(double secondNumber) {
//		if (getFirstNumber() / 0){
//			return;
//		}else
//			this.secondNumber = getSecondNumber();
//			
//	}
	public double getDivisionResult() {
		return getFirstNumber() / getSecondNumber();
	}

}
