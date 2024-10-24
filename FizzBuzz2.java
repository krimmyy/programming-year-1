package Week2;

import java.util.Scanner;

/**
 * Created by Eligijus Ciza on 07/02/2023
 * program to read integers and displays outputs depending on numbers
 */
public class FizzBuzz2
{
   public static void main(String [] args)
   {
      Scanner keyboard = new Scanner(System.in);

      int start, finish;
      System.out.print("Enter the start number: ");
      start = keyboard.nextInt();
      System.out.print("Enter the finish number: ");
      finish = keyboard.nextInt();

      for (int number=start; number <= finish; number++)
      {
         if (number % 3 == 0 || number % 7 == 0)
         {
            if (number % 3 == 0)
            {
               System.out.print("FIZZ ");
            }
            if (number % 7 == 0)
            {
               System.out.print("BUZZ");
            }
         }
         else
         {
            System.out.print(number);
         }
         System.out.println("");
      }//for
   }//main
}//class
