package CW2;

import CW1Part3.Property;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by Eligijus Ciza on 09/05/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
public class ArrayOfAccounts
{
   public List<CustomerAccount> accounts;

   public ArrayOfAccounts() {
      accounts = new ArrayList<CustomerAccount>();
   }//ArrayOfAccounts

   protected CustomerAccount getCurrent(int position) {
      return accounts.get(position);
   }//getCurrent

   protected int getNoOfAccounts() {
      return accounts.size();
   }//getNoOfAccounts

   protected int getAcc(int position) {
      return accounts.get(position).getAcc();
   }//getStreet

   protected void displayBalance(int index) {
      accounts.get(index).displayBalance();
   }//displayMember

   protected void insert(CustomerAccount newCustomerAccount) {
      accounts.add(newCustomerAccount);
      System.out.println(newCustomerAccount + " Added");
   }//insert account

   protected void removeAccount(int position) {
      System.out.println(getCurrent(position) + " Removed");
      accounts.remove(position);
   }//removeAccount

}//class
