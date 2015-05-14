import static org.junit.Assert.*;

import org.gradle.Calc;
import org.junit.Before;
import org.junit.Test;


public class jTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test1() {
		Calc calc = new Calc();
		assertEquals(3, calc.add(1, 2));
	}
	@Test
	public void test2() {
		Calc calc = new Calc();
		assertEquals(200, calc.multiply(2, 100));
	}


}
