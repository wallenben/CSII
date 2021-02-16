package cs145.Lab03;

import java.text.DecimalFormat;

public class ComplexNumber {
	double real;
	double imaginary;

	public ComplexNumber() {
		real = 0;
		imaginary = 0;
	}

	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public ComplexNumber(double real) {
		this.real = real;
		imaginary = 0;
	}

	public ComplexNumber(ComplexNumber number) {
		this.real = number.real;
		this.imaginary = number.imaginary;
	}

	/**
	 * @return the real
	 */
	public double getReal() {
		return real;
	}

	/**
	 * @param real the real to set
	 */
	public void setReal(double real) {
		this.real = real;
	}

	/**
	 * @return the imaginary
	 */
	public double getImaginary() {
		return imaginary;
	}

	/**
	 * @param sets the parameter as the imaginary number in the ComplexNumber object
	 */
	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}

	/**
	 * Returns the conjugate of the complex number by reversing the imaginary
	 * number's sign.
	 * 
	 * @return the conjugate
	 */
	public ComplexNumber conjugate() {
		return new ComplexNumber(real, -imaginary);
	}

	/**
	 * Converts the Complex Number to a string format
	 * 
	 * @return returns the converted string
	 */
	public String toString() {
		DecimalFormat z = new DecimalFormat();
		z.applyPattern("0.000");
		return new String(z.format(real) + " + " + z.format(imaginary) + "i");
	}

	/**
	 * Adds two complex numbers together.
	 * 
	 * @param original is the original complex number being added
	 * @return is the new number being returned
	 */
	public ComplexNumber add(ComplexNumber original) {
		this.real = this.real + original.real;
		this.imaginary = this.imaginary + original.imaginary;
		return new ComplexNumber(this.real, this.imaginary);
	}

	/**
	 * Subtracts two complex numbers.
	 * 
	 * @param original is the original complex number being subtraced
	 * @return is the new number being returned
	 */
	public ComplexNumber subtract(ComplexNumber original) {
		this.real = this.real - original.real;
		this.imaginary = this.imaginary - original.imaginary;
		return new ComplexNumber(this.real, this.imaginary);
	}

	/**
	 * Multiplies two complex numbers.
	 * 
	 * @param original is the original complex number being multiplied.
	 * @return is the new number being returned
	 */
	public ComplexNumber multiply(ComplexNumber original) {
		double zReal, zImag = 0;
		zReal = (this.real * original.real) - (this.imaginary * original.imaginary);
		zImag = (this.real * original.imaginary) + (original.real * this.imaginary);
		return new ComplexNumber(zReal, zImag);
	}

	/**
	 * Divides two complex numbers.
	 * 
	 * @param original is the original complex number being divided.
	 * @return is the new number being returned
	 */
	public ComplexNumber divide(ComplexNumber original) {
		double zReal, zImag = 0;
		zReal = ((this.real * original.real) + this.imaginary * original.imaginary)
				/ (Math.pow(original.real, 2) + Math.pow(original.imaginary, 2));
		zImag = (this.imaginary * original.real - this.real * original.imaginary)
				/ (Math.pow(original.real, 2) + Math.pow(original.imaginary, 2));
		return new ComplexNumber(zReal, zImag);
	}
}
