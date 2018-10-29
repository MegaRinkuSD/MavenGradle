package org.iut.nantes;

import static org.junit.Assert.*;

import org.iun.nantes.Calculator;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator calculator = new Calculator(5, 5);
		int result = calculator.addition();
		assertEquals(10, result);
	}
}
