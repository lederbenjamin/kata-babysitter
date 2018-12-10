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
	
	@Test
	public void shouldBePaidAt12AnHourAnd8AnHourForFamilyB() {
		calculator.calculatePayForFamilyB(17, 24);
		
		assertEquals(76, calculator.getTotalPay(), 0);
	}
	
	@Test
	public void shouldBePaidAt12AnHourAnd8AnHourAnd16AnHourForFamilyB() {
		calculator.calculatePayForFamilyB(17, 28);
		
		assertEquals(140, calculator.getTotalPay(), 0);
	}
	
	@Test
	public void shouldBePaidAt8AnHourForFamilyB() {
		calculator.calculatePayForFamilyB(22, 24);
		
		assertEquals(16, calculator.getTotalPay(), 0);
	}
	
	@Test
	public void shouldBePaidAt8AnHourAnd16AnHourForFamilyB() {
		calculator.calculatePayForFamilyB(22, 28);
		
		assertEquals(80, calculator.getTotalPay(), 0);
	}
	
	@Test
	public void shouldBePaidAt16AnHourForFamilyB() {
		calculator.calculatePayForFamilyB(24, 28);
		
		assertEquals(64, calculator.getTotalPay(), 0);
	}
	
	@Test
	public void shouldBePaidAt21AnHourForFamilyC() {
		calculator.calculatePayForFamilyC(17, 21);
		
		assertEquals(84, calculator.getTotalPay(), 0);
	}
	
	@Test
	public void shouldBePaidAt21AnHourAnd15AnHourForFamilyC() {
		calculator.calculatePayForFamilyC(17, 28);
		
		assertEquals(189, calculator.getTotalPay(), 0);
	}
	
	@Test
	public void shouldBePaidAt15AnHourForFamilyC() {
		calculator.calculatePayForFamilyC(21, 28);
		
		assertEquals(105, calculator.getTotalPay(), 0);
	}
	
	

}
