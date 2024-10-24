package Week5;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by Eligijus Ciza on 14/03/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
public class ArrayOfStudents
{
   private List<Student> members;

      public ArrayOfStudents()
      {
         members = new ArrayList<Student>();
      }//ArrayOfStudents

      protected int getStudentID(int position)
      {
         return members.get(position).getStudentID();
      }//getStudentID

      protected String getName(int position)
      {
         return members.get(position).getName();
      }//getName

      protected int getMark1(int position)
      {
         return members.get(position).getMark1();
      }//getMark1

      protected int getMark2(int position)
      {
         return members.get(position).getMark2();
      }//getMark2

      protected int getMark3(int position)
      {
         return members.get(position).getMark3();
      }//getMark3

      // Return a reference to the current student
      protected Student getCurrent(int position)
      {
         return members.get(position);
      }//getCurrent

      protected int getNoOfStudents()
      {
         return members.size();
      }//getNoOfStudents

      // Add Person object to the array
      protected void insert(Student newStudent)
      {
         members.add(newStudent);
         System.out.println(newStudent.getName() + " Added");
      }//insert

      protected void removeStudent(int position)
      {
         members.remove(position);
      }//removeStudent

      protected void displayEveryone()
      {
         for (Student aStudent : members)
         {
            aStudent.printAllDetails();
         }//for
      }//displayEveryone

}//class
