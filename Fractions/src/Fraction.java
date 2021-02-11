
class Fraction {
private int numerator;
private int denominator;


/**
 * @param numerator
 * @param denominator
 */
public Fraction(int numerator, int denominator) {
	super();
	this.numerator = numerator;
	this.denominator = denominator;
	reduce();
}
/**
 * @param numerator
 */
public Fraction(int numerator) {
	super();
	this.numerator = numerator;
	denominator = 1;
	reduce();
}
public Fraction() {
	numerator = 0;
	denominator = 1;
}

public Fraction (Fraction other) {
	this.numerator = other.numerator;
	this.denominator = other.denominator;
	
}

public int getNumerator() {
	return numerator;
}
public void setNumerator(int numerator) {
	this.numerator = numerator;
	reduce();
}
public int getDenominator() {
	return denominator;
}
public void setDenominator(int denominator) {
	this.denominator = denominator;
	reduce();
}

@Override
public String toString() {
	return (numerator + "/" + denominator);
}
/**
 * Gives the decimal value of a fraction
 * @return the value (num/denom)
 */
public double valueOf() {
	return (double) numerator / denominator;
}
/**
 * Compares fractions.
 * @param other is the fraction being compared
 * @return true if they are equal, false if not.
 */
public boolean equals(Fraction other) {
	if (other.valueOf() == this.valueOf())
	{
		return true;
	}else {
		return false;
	}
}
public void reduce() {
	int dividend;
	int divisor;
	int remainder;
	if (numerator == 0)
		denominator = 1;
	else {
		if (numerator > denominator)
		{
			dividend = numerator;
			divisor = denominator;
		}
		else {
			dividend = denominator;
			divisor = numerator;
		}
		
		remainder =  dividend % divisor;
	while (remainder !=0) {
		dividend = divisor;
		divisor = remainder;
		remainder = dividend % divisor;
	}
	numerator = numerator / divisor;
	denominator = denominator / divisor;
		}
	}
/**
 * Multiplies to fractions and simplifies to the lowest form.
 * @param other fraction to multiply the calling fraction by
 * @return the product of the calling fraction and the parameter
 */
public Fraction multiply(Fraction other) {
	Fraction product = new Fraction();
	
	product.numerator = other.numerator * product.numerator;
	product.denominator = other.denominator * product.denominator;
	product.reduce();
	return product;
}
}
/**

public Fraction add(Fraction)
public Fraction subtract
public Fraction divide

*/


