package Week3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Eligijus Ciza on 23/02/2023
 * a program to read the weight of containers and calculate the cost
 * of haulage depending on number of containers and total weight
 */
public class Transport
{
   static Scanner keyboard = new Scanner(System.in);
   static DecimalFormat df = new DecimalFormat("00.00");
   static int weight;
   static double cost;
   public static int getWeight(int number)
   {
      System.out.print("Please enter the weight of container " + number + "(in kg) or -1 to finish: ");
      weight = keyboard.nextInt();
      return weight;
   }//getWeight

   public static double calculateCost(int number, int weight)
   {
      final int HIGHWEIGHT = 1000, HIGHCOST = 1200, LOWWEIGHT = 500, MIDDLECOST = 750, LOWCOST = 400, DISCOUNTNUMBER = 5;
      final double DISCOUNTRATE = 0.25;

      if (weight > HIGHWEIGHT)
      {
         cost = HIGHCOST;
      }
      else
      {
         if (weight > LOWWEIGHT)
         {
            cost = MIDDLECOST;
         }
         else
         {
            cost = LOWCOST;
         }
      }//endif

      if (number <= DISCOUNTNUMBER)
      {
         cost = cost - (cost * DISCOUNTRATE);
      }
      return cost;
   }//calculateCost

   public static void main(String [] args)
   {
      int totalWeight = 0, numberOfContainers = 0;
      double cost;
      final int TERMINATOR = -1;

      weight = getWeight(1);

      do
      {
         totalWeight = totalWeight + weight;
         numberOfContainers = numberOfContainers + 1;
         weight = getWeight(numberOfContainers + 1);
      }while (weight != TERMINATOR);

         cost = calculateCost(numberOfContainers, totalWeight);

      System.out.println("The total number of containers is " + numberOfContainers);
      System.out.println("The total weight of the containers is " + totalWeight + " kg");
      System.out.println("The total cost of transport is £" + df.format(cost));
   }

}//class
