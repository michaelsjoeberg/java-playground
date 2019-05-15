import java.util.*;
import ou.*;
/**
 * Elements class for periodic table element details.
 * 
 * @author MICHAEL SJOEBERG 
 * @version 1.0
 */
public class Elements
{
   // instance variables
   private Map<String, List<String>> elementMap;
   
   /**
    * Constructor for objects of class Elements
    */
   public Elements()
   {
      // initialise instance variables
      this.elementMap = new HashMap<String, List<String>>();
   }
   
   /**
    * Method for populating map with test data
    */
   public void populateMap()
   {
      // create key and new list for "Beryllium"
      this.elementMap.put("Be", new ArrayList<String>());
      this.elementMap.get("Be").add("4");
      this.elementMap.get("Be").add("Beryllium");
      this.elementMap.get("Be").add("9.012");
      
      // create key and new list for "Magnesium"
      this.elementMap.put("Mg", new ArrayList<String>());
      this.elementMap.get("Mg").add("12");
      this.elementMap.get("Mg").add("Magnesium");
      this.elementMap.get("Mg").add("24.305");
      
      // create key and new list for "Sodium"
      this.elementMap.put("Na", new ArrayList<String>());
      this.elementMap.get("Na").add("11");
      this.elementMap.get("Na").add("Sodium");
      this.elementMap.get("Na").add("22.980");
      
      // create key and new list for "Indium"
      this.elementMap.put("In", new ArrayList<String>());
      this.elementMap.get("In").add("49");
      this.elementMap.get("In").add("Indium");
      this.elementMap.get("In").add("114.818");
   }
   
   /**
    * Method for printing contents of map. 
    * 
    * Using instance method 'paddedPrint' for better output of 
    * text (not included in the solutions document).
    */
   public void printMap()
   {
      // print the labels for element
      System.out.println("| " + paddedPrint("Symbol", 5) + " "
                              + paddedPrint("Name", 5) + " "
                              + paddedPrint("Number", 14) + " "
                              + paddedPrint("Weight", 7) + "  |");
      System.out.println("|--------------------------------------|");
      
      // loop for iterating the map
      for (String key : elementMap.keySet()) {
         // create temporary list for element values
         List<String> tempList = this.elementMap.get(key);
         
         // print textual representation of values of element
         System.out.println("  " + key 
                                 + paddedPrint(tempList.get(1), tempList.get(1).length() + 6)
                                 + paddedPrint(tempList.get(0), 15 - tempList.get(1).length())
                                 + paddedPrint(tempList.get(2), tempList.get(2).length() + 6) );
      }
   }
   
   /**
    * Method for printing a specific value of the map.
    * 
    * Using instance method 'paddedPrint' for better output of 
    * text (not included in the solutions document).
    * 
    * @param aKey - key as a String representation of Symbol for an element
    */
   public void printMapValue(String aKey)
   {
      // check if map has key
      if (this.elementMap.get(aKey) == null)
      {
         // print not found
         System.out.println("No element with Symbol '" + aKey + "' found.");
      }
      else
      {
         // create temporary list for element values
         List<String> tempList = this.elementMap.get(aKey);
         
         // print the labels for element
         System.out.println("| " + paddedPrint("Symbol", 5) + " "
                                 + paddedPrint("Name", 5) + " "
                                 + paddedPrint("Number", 14) + " "
                                 + paddedPrint("Weight", 7) + "  |");
         System.out.println("|--------------------------------------|");
         
         // print textual representation of values of element
         System.out.println("  " + aKey 
                                 + paddedPrint(tempList.get(1), tempList.get(1).length() + 6)
                                 + paddedPrint(tempList.get(0), 15 - tempList.get(1).length())
                                 + paddedPrint(tempList.get(2), tempList.get(2).length() + 6) );
      } 
   }
   
   /**
    * Method for adding a new entry to the map.
    * 
    * @param aKey - key as a String representation of Symbol for an element
    * @param aValue - value as a String representation of properties for the element
    */
   public void addMapEntry(String aKey, String aValue)
   {
      // split string into values for list
      String[] newValues;
      newValues = aValue.split(" ");
      
      // check if map has key
      if (this.elementMap.get(aKey) == null)
      {    
         // create key and new list for element
         this.elementMap.put(aKey, new ArrayList<String>());
         
         // add values to list
         this.elementMap.get(aKey).add(newValues[0]);
         this.elementMap.get(aKey).add(newValues[1]);
         this.elementMap.get(aKey).add(newValues[2]);
      }
      else
      {
         // get and overwrite an existing element
         this.elementMap.get(aKey).set(0, newValues[0]);
         this.elementMap.get(aKey).set(1, newValues[1]);
         this.elementMap.get(aKey).set(2, newValues[2]);
      }
   }
   
   /**
    * Method for deleting an entry in map.
    * 
    * @param aKey - key as a String representation of Symbol for an element
    */
   public boolean deleteEntry(String aKey)
   {
      // check if map has key
      if (this.elementMap.get(aKey) == null)
      {    
         // return false
         return false;
      }
      else
      {
         // remove entry from map and return true
         this.elementMap.remove(aKey);
         return true;
      }
   }
   
   /**
    * Method for creating a reduced map of values based on argument.
    * 
    * @param aNumber - minimum atomic number for elements as Integer
    * @return reducedMap - a new map with values that satisfy input argument
    */
   public Map<String, List<String>> createReducedMap(int minNum)
   {
      // create empty map for new values
      Map<String, List<String>> reducedMap;
      reducedMap = new HashMap<String, List<String>>();
      
      // loop for iterating the map
      for (String key : elementMap.keySet()) {
         // create temporary list for element values
         List<String> tempList = this.elementMap.get(key);
         
         // check if element atomic number is smaller than argument
         if (Integer.parseInt(tempList.get(0)) > minNum)
         {
            // create key and new list for element in reduced map
            reducedMap.put(key, new ArrayList<String>());
            
            // add values to list in reduced map
            reducedMap.get(key).add(tempList.get(0));
            reducedMap.get(key).add(tempList.get(1));
            reducedMap.get(key).add(tempList.get(2));
         }
         else
         {
            // continue if number is smaller than argument
            continue;
         }
      }
      
      // return reduced map
      return reducedMap;
   }
   
   /**
    * Method for adding a value to an already existing element.
    * 
    * @param aKey - key as a String representation of Symbol for an element
    * @param newValue - new value as a String representation of new property for the element 
    */
   public void addValue(String aKey, String newValue)
   {
      // add new value to element
      this.elementMap.get(aKey).add(newValue);
   }
   
   /**
    * Method for deleting a value from an already existing element.
    * 
    * @param aKey - key as a String representation of Symbol for an element
    * @param indexOfValue - index of value to delete as Integer
    */
   public void deleteValue(String aKey, int indexOfValue)
   {
      // delete a value from an element
      this.elementMap.get(aKey).remove(indexOfValue);
   }
   
   /**
    * Method for padding text for better output. (optional)
    * @param string - input text to format
    * @param len - number of spaces to add to string
    */
   public static String paddedPrint(String string, int len) {
      // returns a formatted string
      return String.format("%1$" + len + "s", string);
   }
}
