package Week2;

import java.util.Scanner;

/**
 * Created by Eligijus Ciza on 07/02/2023
 * program to accept donations from an unknown number of donors and finishes when the target reaches 500
 */
public class Donations
{
   public static void main(String [] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int donation = 0;
      int totalDonations = 0;
      int largestDonation = 0;
      int noOfDonations = 0;
      String donor = "";
      String largestDonor = "";

      do
      {
         System.out.print("Enter your name: ");
         donor = keyboard.next();
         System.out.print("Enter your donation: ");
         donation = keyboard.nextInt();


         if (donation > largestDonation)
         {
            largestDonation = donation;
            largestDonor = donor;
         }
         noOfDonations = noOfDonations + 1;
         totalDonations = totalDonations + donation;
      } while (totalDonations < 500);
      System.out.println("Total number of donations received: " + noOfDonations);
      System.out.println(largestDonor + " donated the largest amount");
      System.out.println("Value of the largest donation: " + largestDonation);
   }

}//class
