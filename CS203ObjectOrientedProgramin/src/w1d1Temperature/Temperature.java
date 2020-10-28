package w1d1Temperature;

public class Temperature {
	private double fNumber;
	private double cNumber;

	public void SetFahrenheit(double f) {
		this.fNumber = f;
	}

	public double getFahrenheitr() {
		return this.fNumber * 9.0 / 5.0 + 32;
	}

	public void setCelsius(double c) {
		this.cNumber = c;
	}

	public double getCelsius() {
		return (this.cNumber - 32) * (5.0 / 9.0);
	}
}
