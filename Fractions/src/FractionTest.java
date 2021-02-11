import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Ben
 *
 */
class FractionTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		Fraction reduced = new Fraction(2,3);
		Fraction nonreduced = new Fraction(4,9);
	}

	/**
	 * Test method for {@link Fraction#Fraction(int, int)}.
	 */
	@Test
	void testFractionIntInt() {
		Fraction e = new Fraction(2,3);
		assertEquals(2, e.getNumerator());
		assertEquals(3, e.getDenominator());
		Fraction z = new Fraction (5,0);
		assertEquals(5, z.getNumerator());
		assertEquals(1, z.getDenominator());
	}

	/**
	 * Test method for {@link Fraction#Fraction(int)}.
	 */
	@Test
	void testFractionInt() {
		Fraction whole = new Fraction(3);
		assertEquals(3, whole.getNumerator());
		assertEquals(1, whole.getDenominator());
	}

	/**
	 * Test method for {@link Fraction#Fraction()}.
	 */
	@Test
	void testFraction() {
		Fraction zero = new Fraction();
		assertEquals(0, zero.getNumerator());
		assertEquals(1, zero.getDenominator());
	}

	/**
	 * Test method for {@link Fraction#Fraction(Fraction)}.
	 */
	@Test
	void testFractionFraction() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Fraction#getNumerator()}.
	 */
	@Test
	void testGetNumerator() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Fraction#setNumerator(int)}.
	 */
	@Test
	void testSetNumerator() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Fraction#getDenominator()}.
	 */
	@Test
	void testGetDenominator() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Fraction#setDenominator(int)}.
	 */
	@Test
	void testSetDenominator() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Fraction#toString()}.
	 */
	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Fraction#valueOf()}.
	 */
	@Test
	void testValueOf() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Fraction#equals(Fraction)}.
	 */
	@Test
	void testEqualsFraction() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Fraction#multiply()}.
	 */
	@Test
	void testMultiply() {
		Fraction product = reduced.multiply(nonreduced);
	}

	/**
	 * Test method for {@link Fraction#add()}.
	 */
	@Test
	void testAdd() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Fraction#reduce()}.
	 */
	@Test
	void testReduce() {
		fail("Not yet implemented");
	}

}
