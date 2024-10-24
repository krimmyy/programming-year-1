package Week3;

import java.util.Scanner;

/**
 * Created by Eligijus Ciza on 21/02/23
 * A program to read in the colour, length, width and height of a box
 * and calculate and output the volume
 */

public class VolumeOfBox5
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      String colour;
      int length, width, height, volume;

      //Read in the colour of the box
      System.out.print("What is the colour of the box? ");
      colour = keyboard.nextLine();

      // Read in the length, width and height of the box and
      // check each is in the range 1-10

      length = getNumber("length");
      System.out.println();

      width = getNumber("width");
      System.out.println();

      height = getNumber("height");
      System.out.println();

      // Calculate the volume
      volume = length * width * height;

      // Output the dimensions and volume
      outputVolume(colour, length, width, height);
   }//main

   public static int getNumber(String side) //method
   {
      Scanner keyboard = new Scanner(System.in);
      int answer;
      do
      {
         System.out.print("Enter the " + side + "(in the range 1 - 10cms): ");
         answer = keyboard.nextInt();
      } while ((answer < 1) || (answer > 10));
      return answer;
   }//getNumber

   public static int calculateVolume(int boxLength, int boxWidth, int boxHeight)//method
   {
      return (boxLength * boxWidth * boxHeight);
   }//calculateVolume

   public static void outputVolume(String boxColour, int boxLength, int boxWidth, int boxHeight)//method
   {
      System.out.println("\nA " + boxColour + " box measuring (in cms) " + boxLength + " x " + boxWidth + " x " + boxHeight);
      System.out.println(" has a volume of " + calculateVolume(boxLength, boxWidth, boxHeight) + " cm cubed");

   }//outputVolume
}//main

