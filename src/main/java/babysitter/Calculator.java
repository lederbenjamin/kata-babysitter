package babysitter;

public class Calculator {

	double totalPay;

	public Calculator() {
	}

	public void calculatePayForFamilyA(int startTime, int endTime) {
		if (endTime <= 23) {
			totalPay = (endTime - startTime) * 15;
		}
		else if (startTime < 23 && endTime > 23) {
			totalPay = ((23 - startTime) * 15) + ((endTime - 23) * 20);
        }
	}

	public double getTotalPay() {
		return totalPay;
	}

}
