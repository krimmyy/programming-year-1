package Week2;

import java.util.Scanner;

/**
 * Created by Eligijus Ciza on 07/02/2023
 * program to demonstrate switch statement
 */
public class NumberList
{
   public static void main(String [] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int choice=0;
      System.out.print("Please enter a choice (1-4) > ");
      choice = keyboard.nextInt();
      switch (choice)
      {
         case 1:
            System.out.println("World Cup Hockey 2023");
            break;
         case 2:
            System.out.println("World Cup Football 2022");
            break;
         case 3:
            System.out.println("World Cup Rugby 2023");
            break;
         case 4:
            System.out.println("You have chosen to EXIT the system");
         default:
            System.out.println("You have not entered 1, 2, 3 or 4");
      }//switch
   }//main
}//class
