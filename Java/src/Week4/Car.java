package Week4;

import java.util.Calendar;

/**
 * Created by Eligijus Ciza on 28/02/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Car
{
   private String reg;
   private String make;
   private String colour;
   private int manYear;
   private static int noOfCars = 0;

   public Car ()// the default constructor method
   {
      noOfCars++;
   }//Default Constructor

   public Car(String pReg, String pMake, String pColour, int pManYear)
   {
      //ALL attributes passed in
      //Very common to pass in all attributes
      reg = pReg;
      make = pMake;
      colour = pColour;
      manYear = pManYear;
   }//Alternative Constructor

   public Car(String pColour)
   {
      //A user defined constructor method
      //Note the non-empty signature!
      //This  method only sets the colour attribute
      colour = pColour;
   }//Alternative Constructor

   public Car(String pReg, String pColour, String pManYear)
   {
      //Assign the attributes that are passed in
      reg = pReg;
      colour = pColour;
      //Rather than leave the manYear attribute with
      // no value it is better to give this attribute
      // a default/neutral value
      manYear = 0;
   }//Alternative Constructor

   public Car(String pReg, String pMake)
   {
      //Set the attributes to values passed in
      reg = pReg;
      make = pMake;
   }//Alternative Constructor

   //Getters

   protected String getReg() {
      return reg;
   }//getReg

   protected String getMake() {
      return make;
   }//getMake

   protected String getColour() {
      return colour;
   }//getColour

   protected int getManYear() {
      return manYear;
   }//getManYear

   //Setters

   protected void setReg(String pReg) {
      reg = pReg;
   }//setReg

   protected void setMake(String pMake) {
      make = pMake;
   }//setMake

   protected void setColour (String pColour) {
      colour = pColour;
   }//setColour

   protected void setManYear (int pManYear) {
      manYear = pManYear;
   }//setManYear

   protected void printCarInfo()
   {
      System.out.println("CAR DETAILS");
      System.out.println("The registration number is " + reg);
      System.out.println("The make of the car is " + make);
      System.out.println("The car is " + colour + " and was manufactured in " + manYear);
      System.out.println("===========================================");
   }//printCarInfo

   protected int ageOfCar(int pManYear)
   {
      int year = Calendar.getInstance().get(Calendar.YEAR);
      int age;
      if (pManYear == 0)
      {
         age = -1;
      }
      else
      {
         age = year - pManYear;
      }
      return age;
   }//ageOfCar

   protected static int numberOfCars()
   {
      return noOfCars;
   }//numberOfCars
}//car

