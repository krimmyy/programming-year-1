package Week1;

import java.util.Scanner;

/**
 * Created by Eligijus Ciza on 02/02/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
public class FizzBuzz1
{
   public static void main(String [] args)
   {
      Scanner keyboard = new Scanner(System.in);

      int number;

      System.out.print("Please enter a number > ");
      number = keyboard.nextInt();

      if (number % 3 == 0 || number % 7 == 0)
      {
         if (number % 3 == 0)
         {
            System.out.print("FIZZ");
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
   }

}//class
