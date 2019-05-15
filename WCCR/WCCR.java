import java.util.*;
import java.io.*;
import ou.*;

/**
 * Class WCCR - Simulates a rally.
 * 
 * @author MICHAEL SJOEBERG
 * @version 1.0
 */
public class WCCR
{
   // instance variables
   private List<Entrant> entrants;
   
   // result maps
   private Map<String, Double> e1results;
   private Map<String, Double> e2results;
   private Map<String, Double> e3results;

   /**
    * Constructor for objects of class WCCR
    */
   public WCCR()
   {
      // initialise instance variables
      this.entrants = new ArrayList<Entrant>();
      
      // initialise result maps
      this.e1results = new HashMap<String, Double>();
      this.e2results = new HashMap<String, Double>();
      this.e3results = new HashMap<String, Double>();
   }
   
   /**
    * Method for reading text file with entrant details, then create
    * new entrant and adding it to the list of entrants.
    */
   public void readInEntrants() throws Exception
   {
      // select file and assign path to variable
      String pathname = OUFileChooser.getFilename();
      File aFile = new File(pathname);
      
      // initialise scanner
      Scanner aScanner = null;
      
      // try and catch for reading the file
      try 
      {
         // reading file with newline as delimiter
         aScanner = new Scanner(new BufferedReader(new FileReader(aFile))).useDelimiter("\\n");
         
         // read next line while there are more lines to read
         while (aScanner.hasNext())
         {
            // crate temporary string with line
            String tempString = aScanner.next();
            
            // split line into list of name and category
            String[] tempList;
            tempList = tempString.split(",");
            
            // crate new entrant, then set entrant name and category
            Entrant entrant = new Entrant();
            entrant.setName(tempList[0]);
            entrant.setCategory(tempList[1].replaceAll("\\s",""));
            
            // add entrant to list of entrants
            this.entrants.add(entrant);
         }
      }
      catch (Exception e) 
      {
         // print exception message
         System.out.println("Exception: " + e);
      }
      finally
      {
         // close scanner
         aScanner.close();
      }
   }
   
   /**
    * Method for generating a random double for rally simulation.
    * 
    * @return 
    */
   public double generateTime()
   {
      // create new instance of random and assign random double to double variable
      Random randomNumber = new Random();
      double num = randomNumber.nextDouble();
      
      // return double for race
      return 30.00 + (60.00 - 30.00) * num;
   }
   
   /**
    * Method for iterating entrants in list and set time
    * in minutes for each using generateTime method.
    */
   public void runRally()
   {
      // iterate list of entrants
      for (Entrant entrant : entrants)
      {
         // set entrant time for each entrant in list
         entrant.setTime(generateTime());
      }
   }
   
   /**
    * Method for sorting entrants in list based on time.
    */
   public void sortEntrantList()
   {
      // sort list
      Collections.sort(entrants);
   }
   
   /**
    * Method for categorising entrants and their times by engine type.
    */
   public void categorise()
   {
      // iterate entrants in list
      for (Entrant entrant : entrants)
      {
         // check if entrant is in E1 category
         if (entrant.getCategory().equals("E1"))
         {
            // put entrant in map
            this.e1results.put(entrant.getName(), entrant.getTime());
         }
         else
         {
            // check if entrant is in E2 category
            if (entrant.getCategory().equals("E2"))
            {
               // put entrant in map
               this.e2results.put(entrant.getName(), entrant.getTime());
            }
            else
            {
               // put entrant in map
               this.e3results.put(entrant.getName(), entrant.getTime());
            }
         }
      }
   }
}
