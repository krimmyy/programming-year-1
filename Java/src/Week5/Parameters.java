package Week5;


/**
 * Created by Eligijus Ciza on 14/03/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Parameters
{
   public static void main(String[] args)
   {
      int length, width;
      length = 20;
      width = 5;
      System.out.println("The area is " + multiply(length, width));

      int number = 0;
      char letter = 'a';
      boolean test = false;
      System.out.println("number = " + number + "; letter = " + letter + "; test = " + test);
      testPrimitives(number, letter, test);
      System.out.println("number = " + number + "; letter = " + letter + "; test = " + test);

      char[] letters = {'a', 'b', 'c'};
      System.out.println("letters[0] = " + letters[0]+ "; letters[1] = " + letters[1]+ "; letters[2] = " + letters[2]);
      testArray(letters);
      System.out.println("letters[0] = " + letters[0]+ "; letters[1] = " + letters[1]+ "; letters[2] = " + letters[2]);
   }//main

   public static int multiply(int num1, int num2)
   {
      return (num1 * num2);
   }//multiply

   public static void testPrimitives(int aNumber, char aLetter, boolean aTest)
   {
      aNumber = aNumber + 10;
      aLetter = 'R';
      aTest = !(aTest);
   }//testPrimitives

   public static void testArray(char [] someLetters)
   {
      someLetters = new char [3];
      someLetters [0] = 'X';
      someLetters [1] = 'Y';
      someLetters [2] = 'Z';
   }//testArray

}//class
