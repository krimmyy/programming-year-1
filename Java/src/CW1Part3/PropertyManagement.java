package CW1Part3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Eligijus Ciza on 18/04/2023
 * A program which allows the user to use a menu to see a list of properties and the information about them.
 * Allows the user to search for properties in a particular town.
 * Allows the user to register a new property to the list.
 * Allows the user to edit details of properties within the list.
 * ALlows the user to delete properties from the list.
 */
public class PropertyManagement
{
   public static void main(String[] args)
   {
      // Initializing scanner, variables and creating an array list.
      Scanner keyboard = new Scanner(System.in);
      char choice = '1';
      int typechoice = 10;
      int changechoice = 10;
      boolean validInput = false;
      String myType = "";
      String myNumber = "";
      ArrayOfProperties myArray = new ArrayOfProperties();

      // Adding 5 properties to the array list.
      Property prop1 = new Property("14 Tilley Road", "Lisburn", "BT13 4BH", "Semi-detached", "Stacey", "0208831 2400", 165000);
      myArray.insert(prop1);
      Property prop2 = new Property("44 Dumbarton Street", "Magherafelt", "BT18 6HD", "Detached", "Clyde", "01389 380080", 180000);
      myArray.insert(prop2);
      Property prop3 = new Property("2 Epsom Road", "Belfast", "BT3 7AA", "Bungalow", "Michael", "0843 170 1029", 105000);
      myArray.insert(prop3);
      Property prop4 = new Property("69 Warwick Road", "Newtownards", "BT9 3DA", "Bungalow", "Julie", "0121 711 7699", 85000);
      myArray.insert(prop4);
      Property prop5 = new Property("27 Smithfield Avenue", "Larne", "BT28 1TH", "Detached", "Christian", "028 9266 3901", 120000);
      myArray.insert(prop5);

      do
      {
         //Displaying the menu which the user will be using
         System.out.println("*** ABC ESTATE AGENT ***");
         System.out.println("1. List All Properties");
         System.out.println("2. Search for a Property in a Particular Town");
         System.out.println("3. Register a New Property");
         System.out.println("4. Edit Details of a Property");
         System.out.println("5. Delete a Property");
         System.out.println("0. Exit");
         System.out.print("Please enter your choice: ");

         choice = keyboard.next().charAt(0);

         switch (choice)
         {
            case '1':
               myArray.displayAllProperties(); //Displays all properties if the user picks option 1
               break;
            case '2':
               System.out.println("Please enter which town you wish to search for: "); //Allows user to search for properties within a town
               String town = keyboard.next();
               ArrayList<Integer> reply = myArray.findPropertyByTown(town);
               if (reply.size() > 0) // keeps looping if reply size is bigger than 0
               {
                  for (int i = 0; i < reply.size(); i++)
                  {
                     myArray.displayAProperty(reply.get(i)); // searches for the specific property
                  }
               } else System.out.println("No properties are available for " + town); // displays if there are no properties within that specific town
               break;
            case '3':
               passwordCheck();
               keyboard.nextLine();
               System.out.print("First line of address: ");
               String myStreet = keyboard.nextLine(); // asks the user to enter the street name and stores it to the variable

               for (int count = 0; count < myArray.getNoOfProperties(); count++) // keeps looping whilst the count is smaller than number of properties
               {
                  if (myArray.getCurrent(count).getStreet().equals(myStreet)) // if the street matches a property in a list this statement is activated
                  {
                     do
                     {
                        System.out.print("This property already exists."); // if that property is already on the list the user is asked to enter a different one
                        System.out.print("New Street: ");
                        myStreet = keyboard.nextLine();
                     } while (myStreet.equals(myArray.getCurrent(count).getStreet()));
                  }
               }

               System.out.print("Town: ");
               String myTown = keyboard.nextLine(); // asks the user to enter a town and stores it in a variable
               System.out.print("Postcode: ");
               String myPostcode = keyboard.nextLine(); // asks the user to enter a postcode and stores it in a variable
               System.out.println("Type:"); // displays all the different possible house types
               System.out.println("1. Detached");
               System.out.println("2. Semi-detached");
               System.out.println("3. Apartment");
               System.out.println("4. Terrace");
               typechoice = keyboard.next().charAt(0); // asks the user to pick a type and stores it in a variable

               switch (typechoice) // menu for the 4 different property types
               {
                  case '1':
                     while (!validInput)
                     {
                        myType = "Detached";
                        validInput = true; //if the user picks 1 the type variable is updated and it exits out of the menu
                     }
                     break;
                  case '2':
                     while (!validInput)
                     {
                        myType = "Semi-detached";
                        validInput = true; //if the user picks 2 the type variable is updated and it exits out of the menu
                     }
                     break;
                  case '3':
                     while (!validInput)
                     {
                        myType = "Apartment";
                        validInput = true; //if the user picks 3 the type variable is updated and it exits out of the menu
                     }
                     break;
                  case '4':
                     while (!validInput)
                     {
                        myType = "Terrace";
                        validInput = true; //if the user picks 4 the type variable is updated and it exits out of the menu
                     }
                     break;
                  default:
                     System.out.println("Please pick a valid choice!"); // if the user enters anything other than a valid choice they are asked to pick again
                     break;
               }
               keyboard.nextLine();
               System.out.print("Vendor Name: ");
               String myName = keyboard.nextLine(); // asks the user to enter the vendor name and stores it to the variable
               myNumber = validateNumber();
               System.out.print("Property Price: £");
               String propPrice = "";
               boolean not = false;
               while (!not) // loops whilst true
               {
                  try
                  {
                     propPrice = keyboard.next(); // asks the user to input property price
                     Integer myPrice = Integer.parseInt(propPrice);
                     Property newProperty = new Property(myStreet, myTown, myPostcode, myType, myName, myNumber, myPrice); // creates new property object
                     myArray.insert(newProperty); // adds the new property to the array list
                     not = true; // updates not variable to true
                  } catch (NumberFormatException e) // cathes NumberFormatException error incase the user inputs anything other than digits
                  {
                     System.out.println("Please enter numbers only!"); // error message if the user does not enter digits
                     not = false; // updates not to false
                  }
               }
               break;
            case '4':
               passwordCheck();
               String streetPicked; // initializing variable
               boolean match = false; // initializing variable
               do
               {
                  keyboard.nextLine();
                  System.out.println("What is the first line of the address you would like to change?");
                  streetPicked = keyboard.nextLine(); // asks the user to enter the street of the address they would like to change and stores it to the variable
                  for (int count = 0; count < myArray.getNoOfProperties(); count++) // loops whilst number of properties is smaller than count
                  {
                     myArray.getStreet(count); // gets the street name for the current property
                     if (streetPicked.equals(myArray.getStreet(count))) // if street matches the street in the array it gets the count
                     {
                        System.out.println("The current information for this property is:");
                        myArray.displayAProperty(count); // displays the current information for the property to the user
                        match = true; // updates match variable to true
                     }
                  }
               } while (!match);

               System.out.println("What do you want to change?"); // displays the menu for the options of what they user can change
               System.out.println("1. Vendor Phone Number");
               System.out.println("2. Price");
               System.out.println("0. Return to Main Menu");
               changechoice = keyboard.next().charAt(0); // stores the users choice to the variable

               switch (changechoice) // menu for the 3 different options
               {
                  case '1':
                     System.out.println("Current Vendor Number is: " + myNumber); // displays the current vendor number to the user
                     myNumber = validateNumber();
                     break;
                  case '2':
                     System.out.println("Current Price is: £"); // displays the current price to the user
                     System.out.print("New Price: £"); // asks the user to enter the new value
                     String propPrice2 = "";
                     boolean not2 = false;
                     while (!not2) // loops whilst not 2 is true
                     {
                        try
                        {
                           propPrice2 = keyboard.next(); // asks the user to enter property price and stores it to a variable
                           Integer myPrice = Integer.parseInt(propPrice2);
                           not2 = true;
                        } catch (NumberFormatException e)
                        {
                           System.out.println("Please enter numbers only!"); // error message for when the user does not enter digits only
                           not2 = false;
                        }
                     }
                     break;
                  case '0':
                     break;
                  default:
                     System.out.println("Please pick a valid choice!"); // error message for when the user does not pick a valid choice
                     break;
               }
               break;
            case '5':
               passwordCheck();
               System.out.println("Enter the street of which you want to remove");
               String aStreet = keyboard.next(); // asks the user for which property they want to remove and stores their choice to a variable

               for (int count = 0; count < myArray.getNoOfProperties(); count++)
               {
                  System.out.println("Confirm if you wish to remove this property"); // confirmation message for if the user wants to remove the property
                  if (myArray.getCurrent(count).getStreet().equals(aStreet))
                  {
                     do
                     {
                        char delYes = keyboard.next().charAt(0);
                        if (delYes == ('y') || (delYes == 'Y')) // code is activated if the user input is Y or y
                        {
                           myArray.removeProperty(count);
                           break;
                        } else
                        {
                           break;
                        }
                     } while (aStreet.equals(myArray.getCurrent(count).getStreet()));
                  } else System.out.println("No properties at this address."); // message if there are no properties at the address
                  break;
               }

               break;
            case '0':
               return;
            default:
               System.out.println("Please enter a valid integer!"); // error message if the user does not input an integer
               break;
         }
      } while (choice != '0' || choice != '1' || choice != '2' || choice != '3' || choice != '4' || choice != '5');
   }//main
      public static void passwordCheck() // passwordCheck method
      {
         Scanner keyboard = new Scanner(System.in);
         String password = "ADMINISTRATOR"; // initializing the password to be ADMINISTRATOR
         System.out.print("Please enter the password: ");
         String pass = keyboard.nextLine(); // asks the user to enter the password and stores it to a variable
         if (!(pass.equals(password)))
         {
            do
            {
               System.out.print("Please enter the correct password: ");
               pass = keyboard.nextLine();
            } while (!(pass.equals(password)));
         }
      }//passwordCheck

   public static String validateNumber() // validateNumber method
   {
      Scanner keyboard = new Scanner(System.in);
      boolean validInput = false;
      String myNumber = "";
      while (!validInput) // loops whilst validInput is true
      {
         System.out.print("New Number: ");
         myNumber = keyboard.nextLine(); // asks the user to enter a new phone number
         if (myNumber.matches("\\d{11}")) // checks to validate that the myNumber entered is 11 digits
         {
            System.out.println("Added!");
            validInput = true; // updates validInput variable to true
         } else
         {
            System.out.println("Contact Number has to be 11 digits."); // error message for when the user does not enter 11 digits for the number
         }
      }
      return myNumber;
   }//validateNumber
}//class
