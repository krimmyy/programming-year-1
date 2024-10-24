package Company;

import java.text.DecimalFormat;

/**
 * Created by Eligijus Ciza on 25/04/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
public class CasualEmployee extends Employee
{
   private double hourlyPay;

   public CasualEmployee()
   {
      super();
   }//default constructor

   public CasualEmployee(String empNumber, String empName)
   {
      super(empNumber, empName);
   }

   protected double getHourlyPay()
   {
      return hourlyPay;
   }//getHourlyPay

   protected void setHourlyPay(double empHourlyPay)
   {
      hourlyPay = empHourlyPay;
   }//setHourlyPay

   protected double calculateWeeklyPay(int empHours)
   {
      return empHours * hourlyPay;
   }//calculateWeeklyPay

   protected String getStatus()
   {
      return("Casual");
   }//getStatus

}//class
