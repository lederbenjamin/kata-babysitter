package babysitter;

public class Calculator {

	double totalPay;

	public Calculator() {
	}

	public void calculatePayForFamilyA(int startTime, int endTime) {
		if (endTime <= 23) {
			totalPay = (endTime - startTime) * 15;
		}
	}

	public double getTotalPay() {
		return totalPay;
	}

}
