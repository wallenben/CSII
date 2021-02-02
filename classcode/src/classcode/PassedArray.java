package classcode;
import java.text.DecimalFormat;
public class PassedArray {
	public static void main(String [] args) {
	double [] scores = {95, 88, 79};	
	//just use printf lol
	//two different utils, same solution
	DecimalFormat kz = new DecimalFormat("0.#");
	System.out.println("The avg = " + kz.format(average(scores)));	
	System.out.printf("The average is %.1f\n", average(scores));
	}
	
	public static double average(double [] array) {
		double total = 0;
		/*for (int i = 0; i < array.length; i++) {
		total += array[i];
		}*/
		
		//figure out what this means
		for (double value : array) {
			total += value;
		}
		return total / array.length;
	}
}
