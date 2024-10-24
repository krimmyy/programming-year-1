package CW2;

/**
 * Created by Eligijus Ciza on 02/05/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
public class BusinessAccount extends CustomerAccount
{
   private static int nBusAccNumber = 1001;
   private double discount;
   private double balance = 00.00;
   public BusinessAccount()
   {
      super();
   }//default constructor

   public BusinessAccount(int newAccRefNo, String newName, String newAddress)
   {
      super(newAccRefNo, newName, newAddress);
   }

   public static int setBusAccNumber()
   {
      int bAccNumber = nBusAccNumber;
      nBusAccNumber++;
      return bAccNumber;
   }//setBusAccNumber

   public double setDiscount(double discountChange)
   {
      return discount = discountChange;

   }//setDiscount

   protected double getDiscount(double paymentAmount)
   {
      return paymentAmount * discount;
   }//getDiscount

   public String toString()
   {
      return (super.toString() + "\n" + "The current discount is " + discount);
   }//toString

}//class
