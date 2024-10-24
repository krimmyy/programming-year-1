package Week1;

/**
 * Created by Eligijus Ciza on 31/01/2023
 * My first Java program
 */

import java.util.Scanner; //read keyboard inputs
import java.text.*; //decimals

public class MyFirstProgram
{
   public static void main(String [] args)
   {
      Scanner keyboard = new Scanner(System.in);

   /*  String name = "Rachel";
   ~int age = 21;
   ~System.out.println("My name is " + name + " and I am " + age + " years old");

   int number1 = 14;
   double number2 = 3;
   double result1, result2, result4;
   int number3 = 14;
   int number4 = 3;
   int result3;
   result1 = number1 / number2;
   System.out.println("Result1 is: " + result1);
   result2 = number1 % number2;
   System.out.println("Result2 is :" + result2);
   result3 = number3 / number4;
   System.out.println("Result3 is :" + result3);
   result4 = number3 % number4;
   System.out.println("Result4 is :" + result4);

      double cost;
      System.out.print("What is the cost? ");
      cost = keyboard.nextDouble();
      System.out.print("The cost is £ " + cost);

      System.out.println("What is the cost? ");
      cost = keyboard.nextDouble();
      System.out.println("The cost is £ " + cost);

    */

      DecimalFormat df = new DecimalFormat("00.00");
      double radius = 5;
      System.out.println("Circle radius = " + df.format(radius) + " to 2 d.p.");

   }
}//class
