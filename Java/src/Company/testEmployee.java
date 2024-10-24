package Company;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Eligijus Ciza on 25/04/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
public class testEmployee
{
   static Scanner keyboard = new Scanner(System.in);

   public static String getText(String message)
   {
      System.out.print(message);
      return keyboard.nextLine();
   }//getText

   public static void main(String[] args)
   {
      DecimalFormat df = new DecimalFormat("0,000.00");

      String number, name;
      double annualSalary, pay;
      int hours;

      System.out.println("Test EMPLOYEE");
      System.out.println("=============");
      number = getText("Employee Number : ");
      name = getText("Employee Name : ");
      Employee employee1 = new FullTimeEmployee(number, name);

      employee1.welcome();

      System.out.println("Test full-time EMPLOYEE");
      System.out.println("=======================");
      number = getText("Employee Number : ");
      name = getText("Employee Name : ");
      FullTimeEmployee employee2 = new FullTimeEmployee(name, number);
      employee2.welcome();

      System.out.println("What is " + employee2.getName() + "'s annual salary? £");
      annualSalary = keyboard.nextDouble();
      employee2.setAnnualSalary(annualSalary);
      keyboard.nextLine();
      System.out.println("Employee: " + employee2.getNumber());
      System.out.println("Monthly Pay: £" + df.format(employee2.calculateMonthlyPay()) + "\n");

      System.out.println(employee2);

      System.out.println(employee2.getStatus() + " Employee\n");

   }

}//class
