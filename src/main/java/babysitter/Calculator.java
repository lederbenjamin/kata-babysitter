package babysitter;


public class Calculator {

	private double totalPay;
	private int startTime;
	private int endTime;
	private String family;
	
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
        else if (startTime >= 24 && endTime > 24) {
        	totalPay = ((endTime - startTime) * 16);
        } 
	}
	
	public void calculatePayForFamilyC(int startTime, int endTime) {
		if (endTime <= 21) {
			totalPay = (endTime - startTime) * 21;
		}
		else if (startTime < 21 && endTime > 21) {
			totalPay = ((21 - startTime) * 21) + ((endTime - 21) * 15);
        }
    	else if (startTime >= 21 && endTime > 21) {
    		totalPay = (endTime - startTime) * 15;
    	}
	}

	public double getTotalPay() {
		return totalPay;
	}
	
	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		if(startTime < 17) {
			System.out.print("You cannot start before 17:00");
		}
		else if(startTime > 27) {
			System.out.print("You must work at least 1 hour");
		}
		else {
			this.startTime = startTime;
		}
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		if(endTime < startTime) {
			System.out.print("You cannot end working before you start");
		}
		else if(endTime > 28) {
			System.out.print("You cannot work past 28:00");
		}
		this.endTime = endTime;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		if(family.equalsIgnoreCase("A")) {
			this.family = family;
		}
		else if(family.equalsIgnoreCase("B")) {
			this.family = family;
		}
		else if(family.equalsIgnoreCase("C")) {
			this.family = family;
		}
		else {
			System.out.print("That is not a valid family");
		}
	}

}
