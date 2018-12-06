package babysitter;

import java.math.BigDecimal;

public class Calculator {

	BigDecimal totalPay;
	boolean familyA;
	boolean familyB;
	boolean familyC;

	
	public Calculator() {
	}
	
	public BigDecimal getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(BigDecimal totalPay) {
		this.totalPay = totalPay;
	}

	public boolean isFamilyA() {
		return familyA;
	}

	public void setFamilyA(boolean familyIsA) {
		this.familyA = familyIsA;
	}

	public boolean isFamilyB() {
		return familyB;
	}

	public void setFamilyB(boolean familyIsB) {
		this.familyB = familyIsB;
	}

	public boolean isFamilyC() {
		return familyC;
	}

	public void setFamilyC(boolean familyIsC) {
		this.familyC = familyIsC;
	}
	
	

}
