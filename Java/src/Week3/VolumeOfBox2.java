package Week3;

import java.util.Scanner;

/**
 * Created by Eligijus Ciza on 21/02/23
 * A program to read in the colour, length, width and height of a box
 * and calculate and output the volume
 */

public class VolumeOfBox2
{
   public static void main (String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      String colour;
      int length, width, height, volume;

      //Read in the colour of the box
      System.out.print("What is the colour of the box? ");
      colour = keyboard.nextLine();

      // Read in the length, width and height of the box and
      // check each is in the range 1-10

      System.out.print("Enter the length of the box ");
      length = getNumber();
      System.out.println();

      System.out.print("Enter the width of the box ");
      width = getNumber();
      System.out.println();


      System.out.print("Enter the height of the box ");
      height = getNumber();
      System.out.println();

      // Calculate the volume
      volume = length * width * height;

      // Output the dimensions and volume
      System.out.print("\nA " + colour + " box measuring (in cms) " +
            length + " x " + width + " x " + height);
      System.out.println(" has a volume of " + volume + " cm cubed");
   }//main

   public static int getNumber() //method
   {
      Scanner keyboard = new Scanner(System.in);
      int answer;
      do
      {
         System.out.print("(in the range 1 - 10cms): ");
         answer = keyboard.nextInt();
      } while ((answer < 1) || (answer > 10));
      return answer;
   }//getNumber

}//class
