package Week2;

import java.util.Scanner;
import java.lang.Math;

/**
 * Created by Eligijus Ciza on 07/02/2023
 * program to display a menu depending on the number entered
 */
public class NumberMenu
{
   public static void main(String [] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int number, choice = 0;
      final int ZERO = 0;
      char response = 'n';

      do
      {

         System.out.print("Enter an integer value: ");
         number = keyboard.nextInt();
         do
         {
            System.out.println("");
            System.out.println("1. Test if Zero");
            System.out.println("2. Find Square Root");
            System.out.println("3. Test if Odd or Even");
            System.out.println("4. Enter Another Number or Exit");
            System.out.println("");
            System.out.print("Please enter your choice: ");
            choice = keyboard.nextInt();

            switch (choice)
            {
               case 1:
                  if (number > 0)
                  {
                     System.out.print("The number " + number + " is greater than " + ZERO);
                  } else
                  {
                     if (number == 0)
                     {
                        System.out.print("The number " + number + " is equal to " + ZERO);
                     } else
                     {
                        System.out.print("The number " + number + " is less than " + ZERO);
                     }
                  }
                  break;
               case 2:
                  if (number >= 0)
                  {
                     System.out.print("The square root of " + number + " = " + Math.sqrt(number));
                  } else
                  {
                     System.out.print("This number has no square root");
                  }
                  break;
               case 3:
                  if (number % 2 == 0)
                  {
                     System.out.print(number + " is an even number");
                  } else
                  {
                     System.out.print(number + " is an odd number");
                  }
                  break;
               case 4:
                  System.out.print("Do you want to enter another number (Y/N)? ");
                  response = keyboard.nextLine().charAt(0);
                  break;
               default:
                  System.out.println("Invalid choice");
                  break;
            }//switch
         } while (choice != 4);
      } while ((response == 'Y') || (response == 'y'));
   }//main
}//class
