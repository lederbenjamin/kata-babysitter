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
	
	@Test
	public void shouldBePaidAt15AnHourForFamilyA() {
		calculator.calculatePayForFamilyA(17, 23);
		
		assertEquals(90, calculator.getTotalPay(), 0);
	}
	
	@Test
	public void shouldBePaidAt15AnHourAnd20AnHourForFamilyA() {
		calculator.calculatePayForFamilyA(17, 28);
		
		assertEquals(190, calculator.getTotalPay(), 0);
	}
	
	@Test
	public void shouldBePaidAt20AnHourForFamilyA() {
		calculator.calculatePayForFamilyA(23, 28);
		
		assertEquals(100, calculator.getTotalPay(), 0);
	}
	
	@Test
	public void shouldBePaidAt12AnHourForFamilyB() {
		calculator.calculatePayForFamilyB(17, 22);
		
		assertEquals(60, calculator.getTotalPay(), 0);
	}
	
	

}
