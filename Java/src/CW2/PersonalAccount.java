package CW2;

/**
 * Created by Eligijus Ciza on 02/05/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
public class PersonalAccount extends CustomerAccount
{
   private static int nPerAccNumber = 1001;
   public PersonalAccount()
   {
      super();
   }//default constructor

   public PersonalAccount(int newAccRefNo, String newName, String newAddress)
   {
      super(newAccRefNo, newName, newAddress);
   }

   public static int setPerAccNumber()
   {
      int pAccNumber = nPerAccNumber;
      nPerAccNumber++;
      return pAccNumber;
   }

   // use in test class to set new account number
   // int pAccNumber = PersonalAccount.setPerAccNumber();


}//class
