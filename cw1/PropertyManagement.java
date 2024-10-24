package CW1Part3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Eligijus Ciza on 18/04/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
public class PropertyManagement
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int choice = 10;
      int typechoice = 10;
      int changechoice = 10;
      boolean validInput = false;
      ArrayOfProperties myArray = new ArrayOfProperties();

      Property prop1 = new Property("14 Tilley Rd", "Lisburn", "BT13 4BH", "Semi-detached", "Stacey", "0208831 2400", 165000);
      myArray.insert(prop1);
      Property prop2 = new Property("44 Dumbarton Street", "Magherafelt", "BT18 6HD", "Detached", "Clyde", "01389 380080", 180000);
      myArray.insert(prop2);
      Property prop3 = new Property(" 2 Epsom Road", "Belfast", "BT3 7AA", "Bungalow", "Michael", "0843 170 1029", 105000);
      myArray.insert(prop3);
      Property prop4 = new Property("69 Warwick Road", "Newtownards", "BT9 3DA", "Bungalow", "Julie", "0121 711 7699", 85000);
      myArray.insert(prop4);
      Property prop5 = new Property("27 Smithfield Avenue", "Larne", "BT28 1TH", "Detached", "Christian", "028 9266 3901", 120000);
      myArray.insert(prop5);

      do
      {
         System.out.println("*** ABC ESTATE AGENT ***");
         System.out.println("1. List All Properties");
         System.out.println("2. Search for a Property in a Particular Town");
         System.out.println("3. Register a New Property");
         System.out.println("4. Edit Details of a Property");
         System.out.println("5. Delete a Property");
         System.out.println("0. Exit");
         System.out.print("Please enter your choice: ");

         choice = keyboard.nextLine().charAt(0);

         switch (choice)
         {
            case '1':
               if (choice == 1) ;
               myArray.displayAllProperties();
               break;
            case '2':
               if (choice == 2) ;
               System.out.println("Please enter which town you wish to search for: ");
               String town = keyboard.next();
               ArrayList<Integer> reply = myArray.findPropertyByTown(town);
               if (reply.size() > 0)
               {
                  for (int i = 0; i < reply.size(); i++)
                  {
                     myArray.displayAProperty(reply.get(i));
                  }
               } else System.out.println("No properties are available for " + town);
               break;
            case '3':
               if (choice == 3);
               passwordCheck();
               System.out.println("First line of address: ");
               String myStreet = keyboard.nextLine();
               for (int count=0; count < myArray.getNoOfProperties(); count++)
               {
                  if (myArray.getCurrent(count).getStreet().equals(myStreet))
                  {
                     do
                     {
                        System.out.println("This property already exists.");
                        System.out.println("New Street: ");
                        myStreet = keyboard.nextLine();
                     } while (myStreet.equals(myArray.getCurrent(count).getStreet()));
                  }
               }

               System.out.println("Town: ");
               String myTown = keyboard.nextLine();
               System.out.println("Postcode: ");
               String myPostcode = keyboard.nextLine();
               System.out.println("Type:");
               System.out.println("1. Detached");
               System.out.println("2. Semi-detached");
               System.out.println("3. Apartment");
               System.out.println("4. Terrace");
               typechoice = keyboard.nextLine().charAt(0);

               switch (typechoice)
               {
                  case '1':
                     if (typechoice == 1)
                     {
                        String myType = "Detached";
                     }
                     break;
                  case '2':
                     if (typechoice == 2)
                     {
                        String myType = "Semi-detached";
                     }
                     break;
                  case '3':
                     if (typechoice == 3)
                     {
                        String myType = "Apartment";
                     }
                     break;
                  case '4':
                     if (typechoice == 4)
                     {
                        String myType = "Terrace";
                     }
                     break;
                  default:
                     System.out.println("Please pick a valid choice!");
                     break;
               }

               System.out.println("Vendor Name: ");
               String myName = keyboard.nextLine();
               validateNumber();
               while (!validInput)
               {
                  System.out.print("Property Price: £");
                  if (keyboard.hasNextInt())
                  {
                     int myPrice = keyboard.nextInt();
                     validInput = true;
                  } else{
                     System.out.println("Please enter a number!");
                     break;
                  }
               }
               break;
            case '4':
               if (choice == 4);
               passwordCheck();
               System.out.println("What is the first line of the address you would like to change?");
               String streetPicked = keyboard.nextLine();
               for (int count=0; count < myArray.getNoOfProperties(); count++)
               {
                  if (myArray.getCurrent(count).getStreet().equals(streetPicked))
                  {
                     do
                     {
                        System.out.println("The current information for this property is:");
                        myArray.displayAProperty();
                     } while (streetPicked.equals(myArray.getCurrent(count).getStreet()));
                  }
               }

               System.out.println("What do you want to change?");
               System.out.println("1. Vendor Phone Number");
               System.out.println("2. Price");
               System.out.println("0. Return to Main Menu");
               changechoice = keyboard.nextLine().charAt(0);

               switch (changechoice)
               {
                  case '1':
                     if (changechoice == 1) ;
                     System.out.println("Current Vendor Number is: " + myArray.getCurrent(myNumber));
                     validateNumber();
                     break;
                  case '2':
                     if (changechoice == 2) ;
                     while (!validInput)
                     {
                        System.out.println("Current Price is: £" + myArray.getCurrent(myPrice));
                        System.out.print("New Price: £");
                        if (keyboard.hasNextInt())
                        {
                           int myPrice = keyboard.nextInt();
                           validInput = true;
                        } else {
                           System.out.println("Please enter a number!");
                           break;
                        }
                     }
                     break;
                  case '0':
                     if (changechoice == 0) ;
                     return;
                  default:
                     System.out.println("Please pick a valid choice!");
                     break;
               }
               break;
            case '5':
               if (choice == 5);
               passwordCheck();
               break;
            case '0':
               if (choice == 0);
               return;
            default:
               System.out.println("Please enter a valid integer!");
               break;
         }
      } while (choice != '0' || choice != '1' || choice != '2' || choice != '3' || choice != '4' || choice != '5');
   }//main
      public static void passwordCheck()
      {
         Scanner keyboard = new Scanner(System.in);
         String password = "ADMINISTRATOR";
         System.out.print("Please enter the password: ");
         String pass = keyboard.nextLine();
         if (!(pass.equals(password)))
         {
            do
            {
               System.out.print("Please enter the correct password: ");
               pass = keyboard.nextLine();
            } while (!(pass.equals(password)));
         }
      }//passwordCheck

   public static void validateNumber()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("New Number: ");
      String myNumber = keyboard.nextLine();
      if(myNumber.matches("\\d{11}"))
      {
         System.out.print("Added!");
      }
      else
      {
         System.out.println("Contact Number has to be 11 digits.");
      }
   }
}//class
