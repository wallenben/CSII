import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
   This program counts the number of words in a file.
*/
public class WordCounter
{  
   public static void main(String[] args) throws IOException
   {  
      Scanner in = new Scanner(new File ("ConstitutionPreamble.txt"));

      String input; 
      int count = 0;
      
      while (in.hasNext())
      {
    	  input = in.next();
    	  count++;
      } 
      
      System.out.println("Wordcount = " + count);
      
      in.close();
   }
}
