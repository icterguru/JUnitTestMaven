import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {

	@Test
	public void testAddNumbers() {
		
		CalculatorApp ca = new CalculatorApp();
		Assert.assertEquals(8, ca.addNumbers(3, 5));
		// GRG Refactoring	
	}
	
	
	@Test
	public void testSubNumbers() {
		CalculatorApp ca = new CalculatorApp();
		Assert.assertEquals(-2, ca.subNumbers(3, 5));
		Assert.assertEquals(2, ca.subNumbers(5, 3));
		// GRG Refactoring		
	}
	
	
	@Test
	public void testModNumbers() {
		CalculatorApp ca = new CalculatorApp();
		Assert.assertEquals(3, ca.modNumbers(3, 5));
		Assert.assertEquals(2, ca.modNumbers(5, 3));
		// GRG Refactoring	
	}
	
	
}
