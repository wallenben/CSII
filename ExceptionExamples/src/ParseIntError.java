//**********************************************************
// This program demonstrates how the Integer.parseInt      *
// can be retrieved from an exception object.              *
//**********************************************************

public class ParseIntError
{
     public static void main(String[] args)
     {
         String str = "abcde";
         int number;

         try
         {
              number = Integer.parseInt(str);
         }
         catch (NumberFormatException e)
         { 
              System.out.println("Error: Cannot convert "
                                 + e.getMessage()
                                 + " to an integer.");
         }
     }
}

