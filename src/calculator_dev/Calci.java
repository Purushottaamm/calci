package calculator_dev;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class Calci {

	@Test
	public void calTest1() {
		assertEquals(31, calculator_dev.add(11,20));
	}
	
	@Test
	public void calTest2() {
		assertEquals(10, calculator_dev.sub(30,20));
	}
	
	@Test
	public void calTest3() {
		assertEquals(30, calculator_dev.mul(6,5));
	}
	
	@Test
	public void calTest4() {
		assertEquals(6, calculator_dev.div(30,5));
	}

}
