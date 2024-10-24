package Week5;

import java.util.Scanner;

/**
 * Created by Eligijus Ciza on 14/03/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
public class TestArrayOfStudents
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      String name;
      int firstMark, secondMark, thirdMark;
      ArrayOfStudents myArray = new ArrayOfStudents();

      // Create a student object
      Student student1 = new Student("John", 34, 56, 67);

      // Add student to the array
      myArray.insert(student1);

      // Prompt for and read in the student name
      System.out.print("Enter student name: ");
      name = keyboard.nextLine();

      // Prompt for and read in marks for student
      System.out.print("Enter first mark for " + name + ": ");
      firstMark = keyboard.nextInt();
      System.out.print("Enter second mark for " + name + ": ");
      secondMark = keyboard.nextInt();
      System.out.print("Enter third mark for " + name + ": ");
      thirdMark = keyboard.nextInt();
      keyboard.nextLine();

      // Create a new student object
      Student student2 = new Student(name, firstMark, secondMark, thirdMark);
      myArray.insert(student2);

      // Output details of all students
      myArray.displayEveryone();

      //Return name of student at index position 1 (student2)
      // 2 ways of accessing this
      System.out.println("\nThe name of the student at index position 1 is: "+ myArray.getCurrent(1).getName());
      System.out.println("\nThe name of the student at index position 1 is: "+ myArray.getName(1));
      }//main
}//class
