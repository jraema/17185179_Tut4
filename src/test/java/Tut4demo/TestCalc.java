package Tut4demo;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class TestCalc {

	@Test
	public void testCalc1() {
		assertEquals(3, new Calc().add());
}
	public void testCalc2() {
		assertEquals(1, new Calc().subtract());
}

}
