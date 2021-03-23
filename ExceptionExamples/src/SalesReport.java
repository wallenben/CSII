//*********************************************************
// This program demonstrates how multiple exceptions can  *
// be caught with one try statement.                      *
//*********************************************************

import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;

public class SalesReport
{
     public static void main(String[] args)
     {
          DecimalFormat dollar = new DecimalFormat("#,##0.00");
          String filename = "SalesData.txt";
          Scanner inputFile;
          String input;               // To hold input from file
          int months = 0;             // Number of months
          double totalSales = 0.0,    // Total sales
                 averageSales;        // Average sales

          try
          {
               inputFile = new Scanner(new File(filename));
               
               // Read the contents of the file and 
               // accumulate the sales data.
               while (inputFile.hasNext())
               {
            	    input = inputFile.nextLine();
                    months++;
                    totalSales += Double.parseDouble(input);
               }

               // Close the file.
               inputFile.close();

               // Calculate the average.
               averageSales = totalSales / months;

               // Display the results.
               System.out.println("Number of months: " + months);
               System.out.println("Total Sales: $" 
                                  + dollar.format(totalSales));
               System.out.println("Average Sales: $" 
                                  + dollar.format(averageSales));
               
          }
          catch(FileNotFoundException e)
          {
               System.out.println("The file " + filename 
                                  + " does not exist.");
          }
          catch(IOException e)
          {
               System.out.println("I/O Error: " + e.getMessage());
          }
          catch(NumberFormatException e)
          {
               System.out.println("Non-numeric data encountered "
                                  + "in the file:" + e.getMessage());
          }
          finally
          {
        	  System.out.println("Gracefully exiting");
          }
          
        
     }
}
