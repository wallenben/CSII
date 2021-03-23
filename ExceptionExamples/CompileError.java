// CompileError.java
// Program generates a compiler error.
import java.io.IOException;

public class CompileError 
{
   public static void main( String args[] )
   {
      try 
      {
         throw new IOException();
      } // end try
      catch ( Exception exception ) // superclass exception
      {
         exception.printStackTrace();
      } // end catch
 //     catch ( IOException ioException ) // subclass exception
      {
         System.err.println( "IOException" );
      } // end catch
   } // end main
} // end class CompileError

