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

}
