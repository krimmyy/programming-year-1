package CW1;

import java.util.Date;
import java.text.SimpleDateFormat;


/**
 * Created by Eligijus Ciza on 07/03/2023
 * a program to display the information about a property.
 * With the use of setters the different types of information can be changed when needed.
 * With the use of getters the bits of information can be retrieved and used when needed.
 * There are two methods in this program one is for getting and storing the full address of a property.
 * And the second method which is for displaying all the information about the property to the user.
 */
public class Property
{
   /** Defining all private variables which are
    *  available to be used throughout the program.
    */
   private String street;
   private String town;
   private String postcode;
   private String propertyType;
   private String nameOfVendor;
   private String vendorContactNumber;
   private int price;
   private Date dateRegistered;

   /** The default constructor is what lets the software see what parameters
    * are needed to be passed when creating new Property objects
    */
   public Property(String pStreet, String pTown, String pPostcode, String pPropertyType, String pNameOfVendor, String pVendorContactNumber, int pPrice) //passing in variables
   {
      // setting all variables to be used for the setters and getters
      street = pStreet;
      town = pTown;
      postcode = pPostcode;
      propertyType = pPropertyType;
      nameOfVendor = pNameOfVendor;
      vendorContactNumber = pVendorContactNumber;
      price = pPrice;
      dateRegistered = new Date();
      // dateRegistered is automatically set to today's date as requested.
      // this will be used later for displaying information about the property.
   }//Default Constructor

   //Setters

   /** The setters are used to set each specific piece of information to whatever
    * you need it to be. As you can see each parameter has its own setter to
    * have more control when information changes are required.
    */
   protected void setStreet(String pStreet)
   {
      street = pStreet;
   }//setStreet

   protected void setTown(String pTown)
   {
      town = pTown;
   }//setTown

   protected void setPostcode(String pPostcode)
   {
      postcode = pPostcode;
   }//setPostcode

   protected void setPropertyType(String pPropertyType)
   {
      propertyType = pPropertyType;
   }//setPropertyType

   protected void setNameOfVendor(String pNameOfVendor)
   {
      nameOfVendor = pNameOfVendor;
   }//setNameOfVendor

   protected void setVendorContactNumber(String pVendorContactNumber)
   {
      vendorContactNumber = pVendorContactNumber;
   }//setVendorContactNumber

   protected void setPrice(int pPrice)
   {
      price = pPrice;
   }//setPrice

   //Getters

   /** The getters are used for retrieving specific information when needed.
    * They can be called when required to use the information.
    */

   protected String getStreet()
   {
      return street;
   }//getStreet

   protected String getTown()
   {
      return town;
   }//getTown

   protected String getPostcode()
   {
      return postcode;
   }//getPostcode

   protected String getPropertyType()
   {
      return propertyType;
   }//getPropertyType

   protected String getNameOfVendor()
   {
      return nameOfVendor;
   }//getNameOfVendor

   protected String getVendorContactNumber()
   {
      return vendorContactNumber;
   }//getVendorContactNumber

   protected int getPrice()
   {
      return price;
   }//getPrice

   protected Date getDateRegistered()
   {
      return dateRegistered;
   }//getDateRegistered

   /** The getFullAddress method is used for retrieving the street, town and postcode for
    * a property. It will store it all in a variable
    * so that it can be used later on for displaying the information.
    */
   protected String getFullAddress()
   {
      String fullAddress = getStreet() + "," + getTown() + "," + getPostcode();
      return fullAddress;
   }//getFullAddress

   /** The displayProperty method is used for displaying all the information
    * about a specific property to the user. It uses the getters for retrieving
    * each piece of information about the property and displays it accordingly.
    */
   protected void displayProperty()
   {
      // formats the dateRegistered variable to a proper date format so that it is easier to read.
      String dateRegistered = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

      // below is all the information which will actually be printed on screen for the user to see
      System.out.println("Details of Property");
      System.out.println("========================");
      System.out.println("Address of Property: " + getFullAddress());
      System.out.println("Property Type: " + getPropertyType());
      System.out.println("Price of Property: £" + getPrice());
      System.out.println("Date Registered: " + dateRegistered);
      System.out.println("Vendor Name " + getNameOfVendor() + " and Contact Number: " + getVendorContactNumber());
   }//displayProperty
}//class
