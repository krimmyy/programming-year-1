package Week3;

import java.util.Scanner;

/**
 * Created by Eligijus Ciza on 21/02/23
 * A program to read in the colour, length, width and height of a box
 * and calculate and output the volume
 */

public class VolumeOfBox1
{

   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      String colour;
      int length, width, height, volume;

      //Read in the colour of the box
      System.out.print("What is the colour of the box? ");
      colour = keyboard.nextLine();

      // Read in the length, width and height of the box and
      // check each is in the range 1-10
      do {
         System.out.print("Enter the length of the box " +
               "(in the range 1 - 10cms): ");
         length = keyboard.nextInt();
      } while ((length < 1) || (length > 10));
      System.out.println();

      do {
         System.out.print("Enter the width of the box " +
               "(in the range 1 - 10cms): ");
         width = keyboard.nextInt();
      } while ((width < 1) || (width > 10));
      System.out.println();

      do {
         System.out.print("Enter the height of the box " +
               "(in the range 1 - 10cms): ");
         height = keyboard.nextInt();
      } while ((height < 1) || (height > 10));
      System.out.println();

      // Calculate the volume
      volume = length * width * height;

      // Output the dimensions and volume
      System.out.print("\nA " + colour + " box measuring (in cms) " +
            length + " x " + width + " x " + height);
      System.out.println(" has a volume of " + volume + " cm cubed");

   }//main
}//class
