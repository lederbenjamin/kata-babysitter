package babysitter;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
	
	private Calculator calculator;

	@Before
	public void setup() {
		calculator = new Calculator();
	}

	
	@Test
	public void shouldInstansiateCalculatorObject() {
		assertNotNull(calculator);
	}
	
	@Test
	public void shouldReturnTotalPay() {
		BigDecimal fakePay = new BigDecimal(200);
		
		calculator.setTotalPay(fakePay);
		
		assertEquals(fakePay, calculator.getTotalPay());
	}
	
	@Test
	public void onlyFamilyAShouldBeTrue() {
		
		calculator.setFamilyA(true);
		calculator.setFamilyB(false);
		calculator.setFamilyC(false);
		
		assertEquals(true, calculator.isFamilyA());
		assertEquals(false, calculator.isFamilyB());
		assertEquals(false, calculator.isFamilyC());

	}
	
	

}
