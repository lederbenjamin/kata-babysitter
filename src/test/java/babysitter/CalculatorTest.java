package babysitter;

import static org.junit.Assert.*;
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
	
	@SuppressWarnings("deprecation")
	@Test
	public void shouldBePaidAt15anHourForFamilyA() {
		calculator.calculatePayForFamilyA(17, 23);
		
		assertEquals(90, calculator.getTotalPay(), 0);
	}
	
	

}
