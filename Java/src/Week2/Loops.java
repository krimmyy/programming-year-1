package Week2;

import java.util.Scanner;

/**
 * Created by Eligijus Ciza on 07/02/2023
 * program to demonstrate different loops
 */
public class Loops
{
   public static void main(String [] args)
   {
      Scanner keyboard = new Scanner(System.in);

      //for loop (repeats for a set number of times)
      for (int count =1; count <= 10; count++)
      {
         System.out.println("Number " + count);
      }//for

      //do...while loop (post-test loop, repeats at least once)
      int month;
      do
      {
         System.out.print("\nEnter a Month (1-12): ");
         month = keyboard.nextInt();
      } while (month < 1 || month > 12);

      //while loop (pre-test loop, may never repeat or execute)
      final int TERMINATOR = -999;
      int number, total = 0;

      System.out.print("Enter the first number: ");
      number = keyboard.nextInt();
      while (number != TERMINATOR)
      {
         total = total + number;
         System.out.print("Enter a number (or -999 to finish): ");
         number = keyboard.nextInt();
      }//while
      System.out.println("\nThe total of the numbers is " + total);
   }//main
}//class
