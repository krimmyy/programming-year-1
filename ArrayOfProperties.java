package CW1;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by Eligijus Ciza on 23/03/2023
 * a program used to manage a list of properties like storing properties in an array,
 * adding properties to the array, removing them from the array, getting information for
 * a certain property and displaying all the information which is stored in the list.
 */
public class ArrayOfProperties
{
    //initializing the list
   private List<Property>properties;

    /** Default constructor which is used for
     * creating a new array list called properties.
     */
   public ArrayOfProperties()
   {
      properties = new ArrayList<Property>();
   }//ArrayOfProperties

    /** getCurrent method is used for getting the property
     * at the current position in the array list.
     */
   protected Property getCurrent(int position)
   {
      return properties.get(position);
   }//getCurrent

    /** getNoOfProperties method is used for getting the amount
     * of properties that are currently stored in the array list.
     */
   protected int getNoOfProperties()
   {
      return properties.size();
   }//getNoOfProperties

   /** getStreet method is used for getting the street
    * of a property at a specific position.
    */
   protected String getStreet(int position)
   {
      return properties.get(position).getStreet();
   }//getStreet

   /** insert method is used for adding a new
    * property to the list and outputting the
    * address to confirm it was added.
    */
   protected void insert(Property newProperty)
   {
      properties.add(newProperty);
      System.out.println(newProperty.getFullAddress() + " Added");
   }//insert

   /** removeProperty method is used for removing the information
    * of a property at a specified position in the list and outputting
    * the street to confirm it was removed.
    */
   protected void removeProperty(int position)
   {
      properties.remove(position);
      System.out.println(properties.get(position).getStreet() + " Removed");
   }//removeProperty

   /** findPropertyByStreet method is used for finding a property by inputting
    * a specific street name. This method will loop until the property is found
    * within the list.
    */
   private int findPropertyByStreet(String pStreet)
   {
      int index = 0;
      boolean found = false;
      int position = -1;
      while (!found && index < properties.size()) //loops while property is not found and whilst index is smaller than the list of properties
      {
         for(index = 0; index < properties.size(); index++) //loops whilst the index is smaller than the list of properties
         {
            if(properties.get(index).getStreet().equals(pStreet)) //if the property is found the position is stored and returned
            {
               found = true;
               position = index;
            }
         }//for
      }//while
      return position;
   }//findPropertyByStreet

   /** findPropertyByTown method is used for finding all the properties for a specified
    * town. This method will store all the properties which are found in a new list.
    */
   ArrayList<Integer> findPropertyByTown(String pTown)
   {
      int index = 0;
      ArrayList<Integer> result = new ArrayList<Integer>(); //creating a new array list called result
      if(properties.get(index).getTown().equals(pTown)) //if the property matches the town name it will add it to the result list
      {
         result.add(index);
      }
      return result;
   }//findPropertyByTown

   /** displayAProperty method is used for displaying the details of a specific property at
    * a given position in the list.
    */
   protected void displayAProperty(int position)
   {
      properties.get(position).displayProperty();
   }//displayAProperty

   /** displayAllProperties method is used for displaying the details for every property
    * that is currently stored in the list.
    */
   protected void displayAllProperties()
   {
      for (Property aProperty : properties) //loops until all the properties have been displayed
      {
         aProperty.displayProperty();
      }//for
   }//displayAllProperties
}//class
