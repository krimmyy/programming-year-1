package Week4;

/**
 * Created by Eligijus Ciza on 28/02/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
public class TimePiece
{
   private String type;
   private double costPrice;
   private String readout;
   private int hours;
   private int minutes;
   private boolean canTalk;
   private static int noOfTimePieces = 0;

   public TimePiece()
   {
      noOfTimePieces++;
      //default constructor
   }

   public TimePiece(String pType, double pCostPrice, String pReadout, boolean pCanTalk)
   {
      type = pType;
      costPrice = pCostPrice;
      readout = pReadout;
      canTalk = pCanTalk;
      noOfTimePieces++;
   }//Alternative Constructor

   public TimePiece(String pType, double pCostPrice, String pReadout, int pHours, int pMinutes, boolean pCanTalk)
   {
      type = pType;
      costPrice = pCostPrice;
      readout = pReadout;
      hours = pHours;
      minutes = pMinutes;
      canTalk = pCanTalk;
      noOfTimePieces++;
   }//Alternative Constructor

   //Setters

   protected void setType(String pType) {
      type = pType;
   }//setType

   protected void setPrice(double pCostPrice) {
      costPrice = pCostPrice;
   }//setPrice

   protected void setReadOut(String pReadout) {
      readout = pReadout;
   }//setReadout

   protected void setHours(int pHours) {
      hours = pHours;
   }//setHours

   protected void setMinutes(int pMinutes) {
      minutes = pMinutes;
   }//setMinutes

   protected void setCanTalk(boolean pCanTalk) {
      canTalk = pCanTalk;
   }//setCanTalk

   //Getters

   protected String getType() {
      return type;
   }//getType

   protected double getCostPrice() {
      return costPrice;
   }//getCostPrice

   protected String getReadout() {
      return readout;
   }//getReadout

   protected int getHours() {
      return hours;
   }//getHours

   protected int getMinutes() {
      return minutes;
   }//getMinutes

   protected boolean getCanTalk() {
      return canTalk;
   }//getCanTalk

   protected String showTime()
   {
      String HH = "";
      String MM = "";
      if (getHours() < 10)
      {
         HH = "0" + getHours();
      }
      else
      {
         HH = "" + getHours();
      }
      if (getMinutes() < 10)
      {
         MM = "0" + getMinutes();
      }
      else
      {
         MM = "" + getMinutes();
      }
      String time = HH + ":" + MM;
      return time;
   }

   protected void setTime(int pHours, int pMinutes)
   {
      setHours(pHours);
      setMinutes(pMinutes);
   }

   protected void updateTime(int pHours, int pMinutes)
   {
      int currentMinutes = getHours() * 60 + getMinutes();
      int addMinutes = pHours * 60 + pMinutes;
      int totalMinutes = currentMinutes + addMinutes;
      int newHours = totalMinutes / 60 - 24;
      int newMinutes = totalMinutes % 60;
      setHours(newHours);
      setMinutes(newMinutes);
   }

   protected void displayDetails()
   {
      System.out.println("Details of clock");
      System.out.println("========================");
      System.out.println("Cost Price: £" + costPrice);
      System.out.println("Type of read out: " + type);
      System.out.println("Current Time: " + showTime());
      if (canTalk)
      {
         System.out.println("This time piece can talk");
      }
      else
      {
         System.out.println("This time piece cannot talk");
      }
      System.out.println("========================");
   }

   protected static int numberOfTimePieces()
   {
      return noOfTimePieces;
   }//noOfTimePieces

}//class
