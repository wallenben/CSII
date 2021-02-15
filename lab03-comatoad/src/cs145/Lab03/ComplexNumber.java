package cs145.Lab03;

public class ComplexNumber {
	double real;
	double imaginary;
	
public ComplexNumber(){
	real = 0;
	imaginary = 0;
}
public ComplexNumber(double real, double imaginary){
	this.real = real;
	this.imaginary = imaginary;
}
public ComplexNumber(double real){
	this.real = real;
	imaginary = 0;
}
public ComplexNumber(ComplexNumber number){
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


}
