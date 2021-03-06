package babysitter;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
	
	private Calculator calculator;
	private OutputStream os;
	private PrintStream ps;

	@Before
	public void setup() {
		calculator = new Calculator();
		os = new ByteArrayOutputStream();
		ps = new PrintStream(os);
		System.setOut(ps);
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
	
	@Test
	public void shouldBeAbleToSetStartTime() {
		calculator.setStartTime(17);
		
		assertEquals(17, calculator.getStartTime());
	}
	
	@Test
	public void shouldNotBeAbleToSetStartTimePriorTo17() {
		calculator.setStartTime(16);

		assertEquals("You cannot start before 17:00", os.toString());
		}
	
	@Test
	public void shouldNotBeAbleToSetStartTimeAfter27() {
		calculator.setStartTime(28);

		assertEquals("You must work at least 1 hour", os.toString());
		}
	
	@Test
	public void shouldBeAbleToSetEndTime() {
		calculator.setEndTime(18);
		
		assertEquals(18, calculator.getEndTime());
	}
	
	@Test
	public void shouldNotBeAbleToEndWorkBeforeStart() {
		calculator.setStartTime(18);
		calculator.setEndTime(17);

		assertEquals("You cannot end working before you start", os.toString());
	}
	
	@Test
	public void shouldNotBeAbleToEndWorkAfter28() {
		calculator.setStartTime(18);
		calculator.setEndTime(29);

		assertEquals("You cannot work past 28:00", os.toString());
	}
	
	@Test
	public void shouldBeAbleToSetFamily() {
		calculator.setFamily("A");
		
		assertEquals("A", calculator.getFamily());
	}
	
	@Test
	public void shouldOnlyBeAbleToSetFamilyToABC() {
		calculator.setFamily("D");
		
		assertEquals("That is not a valid family", os.toString());
	}
	
	
	
	
}
