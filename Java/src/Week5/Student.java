package Week5;

import java.text.DecimalFormat;

/**
 * Created by Eligijus Ciza on 14/03/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Student
{
   DecimalFormat df = new DecimalFormat("00.00");

      //Define class variables
      private static int nextUniqueID = 1;

      //Define instance variables
      private int studentID;
      private String name;
      private int mark1, mark2, mark3;

   public Student()
   {
      studentID = nextUniqueID;
      nextUniqueID = nextUniqueID + 1;
   }//Default Constructor

   public Student(String studentName)
   {
      studentID = nextUniqueID;
      name = studentName;
      mark1 = 0;
      mark2 = 0;
      mark3 = 0;
      nextUniqueID = nextUniqueID + 1;
   }//Alternative Constructor

   public Student(String studentName, int firstMark, int secondMark, int thirdMark)
   {
      studentID = nextUniqueID;
      name = studentName;
      mark1 = firstMark;
      mark2 = secondMark;
      mark3 = thirdMark;
      nextUniqueID = nextUniqueID + 1;
   }//Alternative Constructor

   protected void setName(String studentName)
   {
      name = studentName;
   }//setName

   protected void setMark1(int firstMark)
   {
      mark1 = firstMark;
   }//setMark1

   protected void setMark2(int secondMark)
   {
      mark2 = secondMark;
   }//setMark2

   protected void setMark3(int thirdMark)
   {
      mark3 = thirdMark;
   }//setMark3

   protected int getStudentID()
   {
      return studentID;
   }//getStudentID
   protected String getName()
   {
      return name;
   }//getName

   protected int getMark1()
   {
      return mark1;
   }//getMark1

   protected int getMark2()
   {
      return mark2;
   }//getMark2

   protected int getMark3()
   {
      return mark3;
   }//getMark3

   protected void setMarks(int firstMark, int secondMark, int thirdMark)
   {
      mark1 = firstMark;
      mark2 = secondMark;
      mark3 = thirdMark;
   }//setMarks

   private double getAverage()
   {
      return (double) (mark1 + mark2 + mark3) / 3;
   }//getAverage

   protected static void printNextUniqueID()
   {
      System.out.println("The next available unique ID is " + nextUniqueID + "\n");
   }//printNextUniqueID

   protected void printAllDetails()
   {
      double result;

      System.out.println("\nThe Student ID is " + studentID);
      System.out.println("The name of the student is " + name);
      System.out.println("The student's three marks are:");
      System.out.println("\t\t" + mark1 + "%");
      System.out.println("\t\t" + mark2 + "%");
      System.out.println("\t\t" + mark3 + "%");
      result = getAverage();
       if (result == 0)
       {
         System.out.println("Average not computable - marks have not been entered\n");
       }//if
       else
       {
         System.out.println("The average mark of the student is " + df.format(result) + "%\n");
       }//else
   }//printAllDetails

}//class
