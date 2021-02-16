/**
 * 
 */
package cs145.Lab03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Ben
 *
 */
class ComplexNumberTest {
	ComplexNumber defaultNo;
	ComplexNumber twoParams;
	ComplexNumber oneParam;
	ComplexNumber copy;
	ComplexNumber mathOne;
	ComplexNumber mathTwo;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		defaultNo = new ComplexNumber();
		twoParams = new ComplexNumber(3.7, 2.03);
		oneParam = new ComplexNumber(4.0002);
		copy = new ComplexNumber(twoParams);
		mathOne = new ComplexNumber(1, 3);
		mathTwo = new ComplexNumber(2, 4);
	}

	/**
	 * Test method for {@link cs145.Lab03.ComplexNumber#ComplexNumber()}.
	 */
	@Test
	void testComplexNumber() {
		assertEquals(0, defaultNo.getReal(), 0.00001);
	}

	/**
	 * Test method for
	 * {@link cs145.Lab03.ComplexNumber#ComplexNumber(double, double)}.
	 */
	@Test
	void testComplexNumberDoubleDouble() {
		assertEquals(3.7, twoParams.getReal());
		assertEquals(2.03, twoParams.getImaginary());
	}

	/**
	 * Test method for {@link cs145.Lab03.ComplexNumber#ComplexNumber(double)}.
	 */
	@Test
	void testComplexNumberDouble() {
		assertEquals(4.0002, oneParam.getReal(), 0.00001);
	}

	/**
	 * Test method for
	 * {@link cs145.Lab03.ComplexNumber#ComplexNumber(cs145.Lab03.ComplexNumber)}.
	 */
	@Test
	void testComplexNumberComplexNumber() {
		assertEquals(3.7, copy.getReal());
		assertEquals(2.03, copy.getImaginary());
	}

	/**
	 * Test method for {@link cs145.Lab03.ComplexNumber#getReal()}.
	 */
	@Test
	void testGetReal() {
		assertEquals(4.0002, oneParam.getReal(), 0.00001);
	}

	/**
	 * Test method for {@link cs145.Lab03.ComplexNumber#setReal(double)}.
	 */
	@Test
	void testSetReal() {
		oneParam.setReal(7);
		assertEquals(7, oneParam.getReal());
	}

	/**
	 * Test method for {@link cs145.Lab03.ComplexNumber#getImaginary()}.
	 */
	@Test
	void testGetImaginary() {
		assertEquals(0, oneParam.getImaginary(), 0.00001);
	}

	/**
	 * Test method for {@link cs145.Lab03.ComplexNumber#setImaginary(double)}.
	 */
	@Test
	void testSetImaginary() {
		twoParams.setImaginary(3);
		assertEquals(3, twoParams.getImaginary(), 0.00001);
	}

	@Test
	void testConjugate() {
		assertEquals(-2.03, twoParams.conjugate().getImaginary(), 0.00001);
	}

	@Test
	void testToString() {
		String z = "0.000 + 0.000i";
		assertEquals(z, defaultNo.toString());
	}

	void testAdd() {
		assertEquals(3, mathOne.add(mathTwo).getReal());
		assertEquals(7, mathOne.add(mathTwo).getImaginary());
	}

	void testSubtract() {
		assertEquals(-1, mathOne.subtract(mathTwo).getReal());
		assertEquals(-1, mathOne.subtract(mathTwo).getImaginary());
	}

	/**
	 * mathOne = new ComplexNumber(1,3); mathTwo = new ComplexNumber(2,4);
	 */
	void testDivide() {
		assertEquals(0.7, mathOne.divide(mathTwo).getReal());
		assertEquals(0.1, mathOne.divide(mathTwo).getImaginary());
	}
}