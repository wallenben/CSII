//*********************************************************
// This program demonstrates how a FileNotFoundException  *
// exception can be handled.                              *
//*********************************************************

import java.io.*;
import java.util.Scanner;

public class OpenFile
{
     public static void main(String[] args) throws IOException
     {
          String fileName;
		  Scanner keyboard = new Scanner (System.in);
		  Scanner inputFile = null; 

          // Get a file name from the user.
          System.out.print("Enter the name of a file: ");
          fileName = keyboard.nextLine();

          // Attempt to open the file.
        // try
          {
               inputFile = new Scanner(new File(fileName));
               System.out.println("The file was found.");
          }
		/*
		 * catch (FileNotFoundException e) { System.out.println("File not found."); }
		 */

          System.out.println("Done.");
          keyboard.close();
          if(inputFile != null)
        	  inputFile.close();
     }
}

