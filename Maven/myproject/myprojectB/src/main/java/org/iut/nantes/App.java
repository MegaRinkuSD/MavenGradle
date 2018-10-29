package org.iut.nantes;

import org.iut.nantes.Calculator;

public class App {
	public static void main(String[] args) {
		Calculator calculator = new Calculator(5, 5);
		int result = calculator.addition();
		System.out.println(result);
	}
}
