package Company;

import java.text.DecimalFormat;

/**
 * Created by Eligijus Ciza on 25/04/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
public class FullTimeEmployee extends Employee
{
   DecimalFormat df = new DecimalFormat("0,000.00");

   private double annualSalary;

   public FullTimeEmployee()
   {
      super();
   }//default constructor

   public FullTimeEmployee(String empNumber, String empName)
   {
      super(empNumber, empName);
   }

   protected double getAnnualSalary()
   {
      return annualSalary;
   }//getAnnualSalary

   protected void setAnnualSalary(double empSalary)
   {
      annualSalary = empSalary;
   }//setAnnualSalary

   protected double calculateMonthlyPay()
   {
      return annualSalary / 12;
   }//calculateMonthlyPay

   protected void welcome()
   {
      System.out.println("Welcome to Full Time Employee Class");
   }//welcome

   //public String toString()
   //{
   //   return ("Employee : " + getNumber() + "\nMonthly Pay: £" + df.format(calculateMonthlyPay()) + "\n");
   //}//toString

   public String toString()
   {
      return (super.toString() + "Monthly Pay: £" + df.format(calculateMonthlyPay() + "\n"));
   }//toString

   protected String getStatus()
   {
      return("Full-Time");
   }//getStatus

}//class
