//***************************************************
// This program demonstrates how the BankAccount    *
// class constructor throws custom exceptions.      *
//***************************************************

public class AccountTest
{
     public static void main(String [] args)
     {
          BankAccount account;

          // Force a NegativeStartingBalance exception.
          try
          {
               account = new BankAccount(-1, 0.04);
          }
          catch(NegativeStartingBalance e)
          {
               System.out.println(e.getMessage());
          }
          catch(NegativeInterestRate e)
          {
               System.out.println(e.getMessage());
          }


          // Force a NegativeInterestRate exception.
          try
          {
               account = new BankAccount(100, -0.04);
          }
          catch(NegativeStartingBalance e)
          {
               System.out.println(e.getMessage());
          }
          catch(NegativeInterestRate e)
          {
               System.out.println(e.getMessage());
          }
     }
}
