import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
/**
   This program counts the number of words in a file.
*/
public class ClassExample
{  
   public static void main(String[] args) throws IOException
   {  
      Scanner in = new Scanner(new File ("ConstitutionPreamble.txt"));
      PrintWriter outfile = new PrintWriter("e.txt");

      String input = ""; 
      
      while (in.hasNextLine())
      {
    	  input += in.nextLine() + "\n";
    	  input.toUpperCase();
      } 
      
      outfile.println(input.toUpperCase());
      
      in.close();
   }
}
