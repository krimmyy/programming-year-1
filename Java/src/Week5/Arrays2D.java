package Week5;

import java.util.Scanner;

/**
 * Created by Eligijus Ciza on 14/03/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Arrays2D
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);


      final int ROWS = 3;
      final int COLUMNS = 5;
      int[][] grid = new int[ROWS][COLUMNS];
      for (int row = 0; row < ROWS; row++)
      {
         for (int column = 0; column < COLUMNS; column++)
         {
            System.out.print("Enter a number (row" + row + ", column " + column + ") : ");
            grid[row][column] = keyboard.nextInt();
         }
      }//for

      grid [2][4] = 7;

      for (int row = 0; row < grid.length; row++)
      {
         for (int column = 0; column < grid[row].length; column++)
         {
            System.out.print("\t" + grid [row][column]);
         }//for
         System.out.println();
      }//for

      System.out.println("Length of row 1 = " + grid [1].length);

   }//main
}//class
