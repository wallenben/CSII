package cs145.lab02;

import java.util.Scanner;		// to read from a file
import java.io.File;	    	// to create a file
import java.io.PrintWriter; 	// to write to a file
import java.io.IOException;	// to use files
import java.text.DecimalFormat;	// to format numbers for printing
/**
This class can be used to process precipitation data for 5 years. 
It will read 5 years of monthly data from a data file called precip.dat containing 1 data point per line. 
It will create a report containing a table of the data as well as monthly averages and yearly totals.
It will also find the maximum and minimum precipitation and display it with the table in the report.
Written by YOUR NAME HERE
TODAY'S DATE HERE
*/
public class Precipitation 
{
	private final static int MONTHS = 12;
	private final static int YEARS = 5;
	private final static int STARTYEAR = 2015;
	private final String[] monthLabel = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
		"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

	//DECLARE ARRAYS HERE FOR TASK #2
	double[] yearTotal, monthlyAverage;
	double[][] precipitationAmount;
	
	public Precipitation()
	{
		double precipitationAmount[][]= new double[MONTHS][YEARS];
		double yearTotal[] = new double[YEARS];
		double monthlyAverage[] = new double[MONTHS];
		//CREATE THE ARRAYS OF THE CORRECT SIZE HERE FOR TASK #2
		//(USE THE CLASS CONSTANTS)

	}

	public void readFile(Scanner infile) throws IOException
	{
		//test this
		for (int i = 0; i < YEARS; i++) {
			for (int x = 0; x < MONTHS; x++) {
				precipitationAmount[x][i] = infile.nextInt();
			}
		}
		infile.close();
		calculateMonthlyAverage();
		calculateYearTotal();
	}

	private void calculateMonthlyAverage()
	{
		int calc = 0;
		for (int i = 0; i < MONTHS; i++) {
			for (int x = 0; x < YEARS; x++) {
				calc += precipitationAmount[x][i];
			}
			calc = calc / YEARS;
			monthlyAverage[i] = calc;
		}
		//CREATE A LOOPING STRUCTURE TO CALCULATE THE MONTHLY AVERAGE
		//FOR EACH COLUMN AND STORE IT INTO THE MONTHLY AVERAGE ARRAY
		//FOR TASK #3
	}

	private void calculateYearTotal()
	{
		int calcTwo = 0;
		for (int i = 0; i < YEARS; i++) {
			for (int x = 0; x < MONTHS; x++) {
				calcTwo += precipitationAmount[i][x];
			}
			calcTwo = calcTwo / MONTHS;
			yearTotal[i] = calcTwo;
		}
	}
	
	public String findMax()
	{
		double max = 0;
		int years = 0;
		int months = 0;
		for (int i = 0; i < YEARS; i++) {
			for (int x = 0; x < MONTHS; x++) {
				if (precipitationAmount[x][i] > max) {
					max = precipitationAmount[x][i];
					years = x;
					months = i;
				};
				}
			}
		//TASK #4
		//SEARCH THE ARRAY FOR THE LARGEST AMOUNT OF PRECIPITAION
		//SAVE THE AMOUNT, MONTH, AND YEAR.
		return "The maximum precipitation of " + max + "occured in " + monthLabel[months] + 
				"of" + (STARTYEAR + years);
		//RETURN A STRING CONTAINING INFORMATION ABOUT THE MAXIMUM PRECIPITATION
	}	

	public String findMin()
	{
		//TASK #4
		//SEARCH THE ARRAY FOR THE SMALLEST AMOUNT OF PRECIPITAION
		//SAVE THE AMOUNT, MONTH, AND YEAR.
		return "The minimum precipitation";
		//RETURN A STRING CONTAINING INFORMATION ABOUT THE MINIMUM PRECIPITATION
	}	
	public void printTable(PrintWriter outfile)
	{
		//OUTPUT THE TABLE USING NICELY FORMATTED NUMBERS #.##
		//AND NEAT COLUMNS FOR TASK #5
		outfile.close();
	}

	public static void main(String[] args) throws IOException
	{
		Precipitation wetStuff = new Precipitation();
		Scanner infile = new Scanner(new File ("PRECIP.dat"));
	    PrintWriter outfile = new PrintWriter("precip.out");
		//TASK #1	
		//CREATE A Scanner OBJECT CALLED infile TO CONNECT WITH THE INPUT FILE: precip.dat		
		//CREATE A PrintWriter OBJECT CALLED outfile TO CONNECT WITH THE OUTPUT FILE: precip.out

		//UNCOMMENT THE LINES BELOW ONCE YOU HAVE CREATED YOUR OBJECTS
		wetStuff.readFile(infile);
		//wetStuff.printTable(outfile);
	}
}