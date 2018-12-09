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
    	else if (startTime >= 23 && endTime > 23) {
    		totalPay = (endTime - startTime) * 20;
    	}
	}
	
	public void calculatePayForFamilyB(int startTime, int endTime) {
        if (endTime <= 22) {
        	totalPay = (endTime - startTime) * 12;
        }
        else if (startTime < 22 && endTime > 22 && endTime <= 24) {
        	totalPay = ((22 - startTime) * 12) + ((endTime - 22) * 8);
        }
        else if (startTime < 22 && endTime > 24) {
        	totalPay = ((22 - startTime) * 12) + ((endTime - 24) * 16) + 16;
        }
        else if (startTime >= 22 && endTime <= 24) {
        	totalPay = ((endTime - startTime) * 8);
        }
        else if (startTime >= 22 && startTime < 24 && endTime > 24) {
        	totalPay = (Math.abs((startTime - 24)) * 8) + ((endTime - 24) * 16);
        }
        else if (startTime >= 24) {
        	totalPay = ((endTime - startTime) * 16);
        } 
	}
	
	

	public double getTotalPay() {
		return totalPay;
	}

}
