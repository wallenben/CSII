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
Written by Ben Wallen
2/8/2021
*/
public class Precipitation 
{
	private final static int MONTHS = 12;
	private final static int YEARS = 5;
	private final static int STARTYEAR = 2015;
	private final String[] monthLabel = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
		"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	double[][]precipitationAmount;
	double[]yearTotal;
	double[]monthlyAverage;

	public Precipitation()
	{
		precipitationAmount = new double[YEARS][MONTHS];
		yearTotal = new double[YEARS];
		monthlyAverage = new double[MONTHS];
	}

	public void readFile(Scanner infile) throws IOException
	{
		for (int i = 0; i < YEARS; i++) {
			for (int x = 0; x < MONTHS; x++) {
				precipitationAmount[i][x] = infile.nextDouble();
				//System.out.println(precipitationAmount[i][x]);
				//this ran properly
			}
		}
		infile.close();
		calculateMonthlyAverage();
		calculateYearTotal();
	}
	private void calculateMonthlyAverage()
	{
		double calc = 0;
		for (int i = 0; i < MONTHS; i++) {
			
			for (int x = 0; x < YEARS; x++) {
				calc += precipitationAmount[x][i];
			}
			calc = calc / YEARS;
			monthlyAverage[i] = calc;
			//System.out.println(monthlyAverage[i]);
			//works, super long decimals though
		}
	}

	private void calculateYearTotal()
	{
		double calc2 = 0;
		for (int i = 0; i < YEARS; i++) {
			for (int x = 0; x < MONTHS; x++) {
			calc2 += precipitationAmount[i][x];
			}
			yearTotal[i] = calc2;
			calc2 = 0;
			//System.out.println(yearTotal[i]);
			//also needs formatting.
		}
	}
	
	public String findMax()
	{
		int years = 0;
		double max = 0;
		int months = 0;
		for (int i = 0; i < YEARS; i++) {
			for (int x = 0; x < MONTHS; x++) {
				if (precipitationAmount[i][x] > max) {
					max = precipitationAmount[i][x];
					years = i;
					months = x;
				}
			}
			//System.out.println(max);
			
		}
		System.out.println("The maximum precipitation of " + max + " occured in " + monthLabel[months] + 
				" of" + (STARTYEAR + years));
		return ("The maximum precipitation of " + max + " occured in " + monthLabel[months] + 
				" of" + (STARTYEAR + years));
		//tested, works
	}	

	public String findMin()
	{
		int years = 0;
		double min = 100;
		int months = 0;
		for (int i = 0; i < YEARS; i++) {
			for (int x = 0; x < MONTHS; x++) {
				if (precipitationAmount[i][x] < min) {
					min = precipitationAmount[i][x];
					years = i;
					months = x;
				}
			}
			
		}
		System.out.println("The minimum precipitation of " + min + " occured in " + monthLabel[months] + 
				" of " + (STARTYEAR + years));
		return ("The minimum precipitation of " + min + " occured in " + monthLabel[months] + 
				" of " + (STARTYEAR + years));
	}	
	public void printTable(PrintWriter outfile)
	{
		String pattern = "0.00";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		outfile.print("Year  ");
		for (int i = 0; i < MONTHS; i++) {
			outfile.print(monthLabel[i] + "   ");
		}
		outfile.print("Total");
		for (int i = 0; i < YEARS; i++) {
			outfile.println();
			outfile.print((STARTYEAR + i) + "  ");
			for (int x = 0; x < MONTHS; x++) {
				outfile.print(decimalFormat.format(precipitationAmount[i][x]) + "  ");
			}
			outfile.print(decimalFormat.format(yearTotal[i]));
		}
		outfile.println();
		outfile.print("Ave   ");
		for (int i = 0; i < MONTHS; i++) {
			outfile.print(decimalFormat.format(monthlyAverage[i]) + "  ");
		}
		outfile.close();
	}

	public static void main(String[] args) throws IOException
	{
		Scanner infile = new Scanner(new File ("Lab02/PRECIP.dat"));
		Precipitation wetStuff = new Precipitation();
		PrintWriter outfile = new PrintWriter("Lab02/precip.out");
		wetStuff.readFile(infile);
		wetStuff.printTable(outfile);
		wetStuff.findMax();
		wetStuff.findMin();
	}
}