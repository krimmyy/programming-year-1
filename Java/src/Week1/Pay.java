package Week1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Eligijus Ciza on 02/02/2023
 * Program that calculates the pay a person should get depending on the hours + overtime
 */
public class Pay
{
   public static void main(String [] args)
   {
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("0.00");

      String name;
      double noOfHours, totalPay, overtimeHours;

      System.out.print("What is your name?");
      name = keyboard.nextLine();

      System.out.print("How many hours have you worked this week?");
      noOfHours = keyboard.nextDouble();
      if (noOfHours <=40)
      {
         totalPay = noOfHours * 10.95;
      }
      else
      {
         overtimeHours = noOfHours - 40;
         totalPay = (40 * 10.95) + (overtimeHours * 14.50);
      }
      System.out.println(name + ", your total pay for this week is £" + df.format(totalPay));
   }

}//class
