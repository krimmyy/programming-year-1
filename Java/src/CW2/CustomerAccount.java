package CW2;

/**
 * Created by Eligijus Ciza on 02/05/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
abstract public class CustomerAccount
{
   private int accRefNo;
   private String name;
   private String address;
   private double balance = 00.00;
   private double discount = 0.1;

   public CustomerAccount()
   {

   }//default constructor

   public CustomerAccount(int newAccRefNo, String newName, String newAddress)
   {
      accRefNo = newAccRefNo;
      name = newName;
      address = newAddress;
   }

   protected int getAccRefNo()
   {
      return accRefNo;
   }//getAccRefNo

   protected String getName()
   {
      return name;
   }//getName

   protected String getAddress()
   {
      return address;
   }//getAddress

   protected int getAcc()
   {
      return accRefNo;
   }//getAddress

   protected void setName(String newName)
   {
      name = newName;
   }//setName

   protected void setAddress(String newAddress)
   {
      address = newAddress;
   }//setAddress

   protected double setBalance(double newBalance)
   {
      balance = newBalance;
      return newBalance;
   }//setAddress

   public double payment(double paymentAmount)
   {
      return setBalance(balance - paymentAmount);
   }//payment

   public double recordSale(double saleAmount)
   {
      return setBalance(balance + saleAmount);
   }//recordSale

   public String toString()
   {
      return "Account Number: " + accRefNo + "\n" +
             "Name: " + name + "\n" +
             "Address: " + address + "\n" +
             "Balance: £" + balance;
   }//toString

   public String displayBalance()
   {
      return "The current balance of the account is : £" + balance;
   }
   public double setDiscount(double discountChange)
   {
      return discount;
   }//setDiscount

   protected double getDiscount(double paymentAmount)
   {
      return paymentAmount * discount;
   }//getDiscount


}//class
