package CW1Part3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Eligijus Ciza on 18/04/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Property
{
   private String street;
   private String town;
   private String postcode;
   private String propertyType;
   private String nameOfVendor;
   private String vendorContactNumber;
   private int price;
   private Date dateRegistered;

   // Constructor to create a Property object
   public Property(String myStreet, String myTown, String myPostcode, String myType,
                   String myName, String myNumber, int myPrice) {
      street = myStreet;
      town = myTown;
      postcode = myPostcode;
      propertyType = myType;
      nameOfVendor = myName;
      vendorContactNumber = myNumber;
      price = myPrice;
      dateRegistered = Calendar.getInstance().getTime();
   }//Property

   protected String getStreet() {
      return street;
   }//getStreet

   protected void setStreet(String newStreet) {
      street = newStreet;
   }//setStreet

   protected String getTown() {
      return town;
   }//getTown

   protected void setTown(String newTown) {
      town = newTown;
   }//setTown

   protected String getPostcode() {
      return postcode;
   }//getPostcode

   protected void setPostcode(String newPostcode) {
      postcode = newPostcode;
   }//setPostcode

   protected String getPropertyType() {
      return propertyType;
   }//getPropertyType

   protected void setPropertyType(String newPropertyType) {
      propertyType = newPropertyType;
   }//setPropertyType

   protected String getVendorName() {
      return nameOfVendor;
   }//getVendorName

   protected void setVendorName(String newVendorName) {
      nameOfVendor = newVendorName;
   }//setVendorName

   protected String getVendorPhoneNumber() {
      return vendorContactNumber;
   }//getVendorPhoneNumber

   protected void setVendorPhoneNumber(String newVendorPhoneNumber) {
      vendorContactNumber = newVendorPhoneNumber;
   }//setVendorPhoneNumber

   protected int getPrice() {
      return price;
   }//getPrice

   protected void setPrice(int newPrice) {
      price = newPrice;
   }//setPrice

   protected Date getDateRegistered() {
      return dateRegistered;
   }//getDateRegistered

   // Return the street, town and postcode
   protected String getFullAddress() {
      return street + ", " + town + " " + postcode;
   }//getFullName

   // Method to display all details of a property
   protected void displayProperty() {
      System.out.println("\nAddress:               " + getFullAddress());
      System.out.println("Property Type:         " + propertyType);
      System.out.println("Vendor's Name:         " + nameOfVendor);
      System.out.println("Vendor's Phone Number: " + vendorContactNumber);
      System.out.print("Price:                 £");
      System.out.format("%,10d%n", price);
      System.out.println("Date Registered:       " + new SimpleDateFormat("dd-MM-yyyy").format(dateRegistered));
   }//displayPerson
}//class
