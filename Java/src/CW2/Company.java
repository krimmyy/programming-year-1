package CW2;

import CW1Part3.Property;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Eligijus Ciza on 09/05/2023
 * COMMENTS ABOUT PROGRAM HERE
 *
 *
 */
public class Company
{
static Scanner scan = new Scanner(System.in);
public static String getText (String message)
      {
         System.out.println(message);
         return scan.next();
      }//getText

   public static void main(String[] args)
   {
      // Initializing scanner, variables and array list.
      Scanner keyboard = new Scanner(System.in);
      char choice = '1';
      boolean validInput = false;
      int accChoice = 10;
      int choice2 = 10;
      double balance = 00.00, discount = 0.1;
      int newAccRefNo = 0;
      ArrayOfAccounts myArray = new ArrayOfAccounts();

      do
      {
         //Displaying the menu which the user will be using
         System.out.println("*** ABC BUILDING COMPANY ***");
         System.out.println("1. Create a New Customer Account");
         System.out.println("2. Existing Customer");
         System.out.println("0. Exit");
         System.out.println("Please enter your choice: ");
         choice = keyboard.next().charAt(0);

         switch (choice)
         {
            case '1':
               System.out.println("Name: ");
               String newName = keyboard.nextLine();
               System.out.println("Address: ");
               String newAddress = keyboard.nextLine();
               System.out.println("Are you:"); // displays the two different account types
               System.out.println("1. Personal Customer");
               System.out.println("2. Business Customer");
               accChoice = Integer.parseInt(getText("Please enter your choice: "));
               switch (accChoice) // menu for the 4 different property types
               {
                  case 1:
                     while (!validInput)
                     {
                        newAccRefNo = PersonalAccount.setPerAccNumber();
                        PersonalAccount pAccount = new PersonalAccount(newAccRefNo, newName, newAddress); // creates new account object
                        myArray.insert(pAccount); // inserts account object into array
                        validInput = true; //if the user picks 1 the variable is updated and it exits out of the menu
                     }
                     break;
                  case 2:
                     while (!validInput)
                     {
                        newAccRefNo = BusinessAccount.setBusAccNumber();
                        BusinessAccount bAccount = new BusinessAccount(newAccRefNo, newName, newAddress); // creates new account object
                        myArray.insert(bAccount); // inserts account object into array
                        validInput = true; //if the user picks 2 the variable is updated and it exits out of the menu
                     }
                     break;
                  default:
                     System.out.println("Please pick a valid choice!"); // if it is an invalid choice they are asked to pick again
                     break;
               }
               System.out.println("Account Details");
               System.out.println("***************");
               System.out.println("Account Number: " + newAccRefNo);
               System.out.println("Name: " + newName);
               System.out.println("Address: " + newAddress);
               System.out.println("Balance: " + balance);
               break;
            case '2':
               System.out.println("Enter the Customer Number: ");
               int perOrBusNo = keyboard.nextInt();
               for (int count = 0; count < myArray.getNoOfAccounts(); count++)
               {
                  if(myArray.getCurrent(count).getAcc() == perOrBusNo)
                  {
                     System.out.println(myArray.getCurrent(count).toString());
                  }

                  String pObNoString = Integer.toString(perOrBusNo);
                  if(pObNoString.startsWith("1"))
                  {
                     System.out.println("Personal Customer - Account Reference No: " + pObNoString);
                  } else if (pObNoString.startsWith("2"))
                  {
                     System.out.println("Business Customer - Account Reference No: " + pObNoString);
                  }
                  System.out.println("1. Record a new sale");
                  System.out.println("2. Make a payment");
                  System.out.println("3. Display current balance");
                  System.out.println("4. Display all account details");
                  System.out.println("5. Change the discount (Business Account Only)");
                  System.out.println("0. Return to Main Menu");
                  choice2 = Integer.parseInt(getText("Please enter your choice: "));
                  switch (choice2)
                  {
                     case 1:
                        System.out.println(myArray.getCurrent(count).displayBalance());
                        double saleAmount = Double.parseDouble(getText("What is the amount of your order? £"));

                        if(pObNoString.startsWith("1"))
                        {
                           myArray.getCurrent(count).recordSale(saleAmount);
                           break;
                        } else if (pObNoString.startsWith("2"))
                        {
                           myArray.getCurrent(count).getDiscount(saleAmount);
                           myArray.getCurrent(count).recordSale(saleAmount-myArray.getCurrent(count).getDiscount(saleAmount));
                        }
                        System.out.println(myArray.getCurrent(count).displayBalance());
                        break;
                     case 2:
                        System.out.println(myArray.getCurrent(count).displayBalance());
                        double paymentAmount = Double.parseDouble(getText("How much are you depositing? £"));
                        myArray.getCurrent(count).payment(paymentAmount);
                        System.out.println(myArray.getCurrent(count).displayBalance());
                        break;
                     case 3:
                        System.out.println(myArray.getCurrent(count).displayBalance());
                        break;
                     case 4:
                        System.out.println(myArray.getCurrent(count).toString());
                        break;
                     case 5:
                        if(pObNoString.startsWith("1"))
                        {
                           System.out.println("Cannot change discount for Personal Accounts.");
                        } else if (pObNoString.startsWith("2"))
                        {
                           System.out.println("The current discount is " + discount);
                           double discountChange = Double.parseDouble(getText("What do you want to change the discount to? "));
                           myArray.getCurrent(count).setDiscount(discountChange);
                           System.out.println("The new current discount is " + discount);
                        }
                        break;
                     case 0:
                        System.out.println("You have chosen to return to main menu.");
                        return;
                     default:
                        System.out.println("Please pick a valid choice!"); // if it is an invalid choice they are asked to pick again
                        break;
                  }
               }
               break;
            case '0':
               System.out.println("You have chosen to exit the program.");
               return;
            default:
               System.out.println("Please enter a valid choice!");
               break;
         }
      }while(choice != '0' || choice != '1' || choice != '2');

   }//main
}//class
