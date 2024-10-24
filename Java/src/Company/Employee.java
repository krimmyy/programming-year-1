package Company;

/**
 * Created by Eligijus Ciza on 25/04/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
abstract public class Employee
{
   //define variables
   private String number;
   private String name;

   public Employee()
   {

   }//default constructor

   public Employee(String empNumber, String empName)
   {
      number = empNumber;
      name = empName;
   }

   protected String getNumber()
   {
      return number;
   }//getNumber

   protected String getName()
   {
      return name;
   }//getName

   protected void setName(String empName)
   {
      name = empName;
   }//setName

   protected void welcome()
   {
      System.out.println("Welcome to the Employee Class");
   }//welcome

   public String toString()
   {
      return "Employee " + number + " is called " + name + "\n";
   }//toString

   abstract protected String getStatus();

}//class
