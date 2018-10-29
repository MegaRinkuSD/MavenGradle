package org.iut.nantes;

/**
 * Hello world!
 *
 */
public class Calculator {
	
	private int firstValue;
	private int secondValue;

	/**
	 * Default constructor
	 * @param firstValue to add
	 * @param secondValue to add
	 */
	public Calculator(int firstValue, int secondValue) {
		super();
		this.firstValue = firstValue;
		this.secondValue = secondValue;
	}

	/**
	 * Addition method
	 * @return the sum result
	 */
	public int addition() {
		return firstValue + secondValue;
	}

	@Override
	public String toString() {
		return "Calculator [firstValue=" + firstValue + ", secondValue=" + secondValue + "]";
	}
}
