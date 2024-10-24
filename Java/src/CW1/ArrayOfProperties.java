package CW1;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by Eligijus Ciza on 30/03/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
public class ArrayOfProperties
{
   private List<Property>properties;

   public ArrayOfProperties()
   {
      properties = new ArrayList<Property>();
   }//ArrayOfProperties

   protected Property getCurrent(int position)
   {
      return properties.get(position);
   }//getCurrent

   protected int getNoOfProperties()
   {
      return properties.size();
   }//getNoOfProperties

   protected String getStreet(int position)
   {
      return properties.get(position).getStreet();
   }//getStreet

   protected void insert(Property newProperty)
   {
      properties.add(newProperty);
      System.out.println(newProperty.getFullAddress() + " Added");
   }//insert

   protected void removeProperty(int position)
   {
      properties.remove(position);
      System.out.println(properties.get(position).getStreet() + " Removed");
   }//removeProperty

   private int findPropertyByStreet(String street)
   {
      int index = 0;
      boolean found = false;
      int position = -1;
      while (!found && index < properties.size())
      {
         for(index = 0; index < properties.size(); index++)
         {
            if(properties.get(index).getStreet().equals(street))
            {
               found = true;
               position = index;
            }
         }//for
      }//while
      return position;
   }//findPropertyByStreet

   ArrayList<Integer> findPropertyByTown(String town)
   {
      int index = 0;
      ArrayList<Integer> result = new ArrayList<Integer>();
      if(properties.get(index).getTown().equals(town))
      {
         result.add(index);
      }
      return result;
   }//findPropertyByTown

   protected void displayAProperty(int position)
   {
      properties.get(position).displayProperty();
   }//displayAProperty

   protected void displayAllProperties()
   {
      for (Property aProperty : properties)
      {
         aProperty.displayProperty();
      }//for
   }//displayAllProperties
}//class
