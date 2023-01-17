package Practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTestCase {

	@Test
	public void testCalculate() {
//		fail("Not yet implemented");
		
		Calculate obj = new Calculate();
		float expected = obj.calculateInterest(2000, 10, 10);
		float actual = 2000;
		assertEquals(expected, actual,0.0);
	}

}
