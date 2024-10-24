package Week2;

import java.util.Scanner;

/**
 * Created by Eligijus Ciza on 07/02/2023
 * program that reads a list of numbers and displays the largest one
 */
public class LargestNumber
{
   public static void main(String [] args)
   {
      Scanner keyboard = new Scanner(System.in);

      final int TERMINATOR = -999;
      int number, largestNumber = 0;

      System.out.print("Enter a number: ");
      number = keyboard.nextInt();
      if (number > largestNumber)
      {
         largestNumber = number;
      }
      while (number != TERMINATOR)
      {
         System.out.print("Enter another number (or -999 to finish): ");
         number = keyboard.nextInt();
         if (number > largestNumber)
         {
            largestNumber = number;
         }
      }//while
      System.out.println("The largest number is " + largestNumber);

   }//main

}//class
