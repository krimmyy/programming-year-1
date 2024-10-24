package Week2;

import java.util.Scanner;

/**
 * Created by Eligijus Ciza on 07/02/2023
 * program to demonstrate different operators
 */
public class Operators
{
   public static void main(String [] args)
   {
      Scanner keyboard = new Scanner(System.in);

      int mark;
      System.out.print("Enter your mark: ");
      mark = keyboard.nextInt();

      if (mark >= 0 && mark <= 100)
      {
         System.out.println("Mark entered is valid");
      }
      else
      {
         System.out.println("Not a valid mark");
      }//else

      char letter;

      System.out.print("Enter a character: ");
      letter = keyboard.nextLine().charAt(0);

      if ( (letter == 'x') || (letter == 'y'))
      {
         System.out.println("The character is x or y");
      }//if
      else
      {
         System.out.println("The character is NOT x or y");
      }//else

      boolean found = false;
      int number = 5;
      int searchValue = 12;

      //assume number and searchValue have been assigned values
      if (number == searchValue)
      {
         found = true;
      }//if

      if (!(found))
      {
         System.out.println("You have no found the number");
      }//if
   }//main
}//class
