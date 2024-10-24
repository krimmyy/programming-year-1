package Week5;

import java.util.Scanner;

/**
 * Created by Eligijus Ciza on 14/03/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
public class StudentArray
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      // Declare an array capable of holding 6 student objects
      final int SIZE = 6;
      Student[] myStudents = new Student[SIZE];

      String name;
      int firstMark, secondMark, thirdMark;

      // Create 6 new Student objects
      for (int index = 0; index < SIZE; index++)
      {
         // Prompt for and read in the student name
         System.out.print("Enter student name: ");
         name = keyboard.nextLine();

         // Create a new instance of a Student object
         myStudents[index] = new Student(name);
      }//for

      // Prompt for and read in marks for student at index 2
      System.out.print("Enter first mark for " + myStudents[2].getName() + ": ");
      firstMark = keyboard.nextInt();
      System.out.print("Enter second mark for " + myStudents[2].getName() + ": ");
      secondMark = keyboard.nextInt();
      System.out.print("Enter third mark for " + myStudents[2].getName() + ": ");
      thirdMark = keyboard.nextInt();

      // Assign marks to student at index 2
      myStudents[2].setMarks(firstMark, secondMark, thirdMark);

      // Output details of all students
      for (int index = 0; index < SIZE; index++)
      {
         myStudents[index].printAllDetails();
      }//for
   }//main

}//class
