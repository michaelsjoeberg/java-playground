/* import statement */

// To be added by students in Question 4, part (iv)

/**
 * Class Entrant - Simulates an entrant in Walton Classic Car Race.
 * 
 * @author M250 Course Team 
 * @version Version 1.0
 */
public class Entrant implements Comparable<Entrant>
{
/* static variables */
private static int nextNumber = 1;

/* instance variables */
     
   private int number;       // entrant's number
   private String name;      // entrant's name
   private String category;  // "E1", "E2" or "E3"
   private double time;         // entrant's marathon time in seconds
 
   /**
    * Constructor for objects of class Entrant.
    */
   public Entrant()
   {
      super();
      this.name = "";
      this.category = "";
      this.time = 0.0;
      
      // set number and increment
      this.number = this.nextNumber;
      this.nextNumber = this.nextNumber + 1;
    }

/* instance methods */

    //Only those accessor methods that you will need have been included
        
   /**
    * Returns the receiver's number.
    */
   public int getNumber()
   {
      return this.number;
   }
      
   /**
    * Sets the receiver's name.
    */
   public void setName(String aName)
   {
      this.name = aName;
   }
      
   /**
    * Returns the receiver's name.
    */
   public String getName()
   {
      return this.name;
   }
      
   /**
    * Sets the receiver's category.
    */
   public void setCategory(String carType)
   {
      this.category = carType;
   }

   /**
    * Returns the receiver's category.
    */
   public String getCategory()
   {
      return this.category;
   }
       
   /**
    * Sets the receiver's time.
    */
   public void setTime(double aTime)
   {
      this.time = aTime;
   }
      
   /**
    * Returns the receiver's time.
    */
   public double getTime()
   {
      return this.time;
   }
   
   /**
    * Method for comparing entrant times.
    * 
    * @return
    */
   public int compareTo(Entrant entrant)
   {
      // return int value, -1 if less, 1 if greater, 0 if equal
      return Double.compare(this.getTime(), entrant.getTime());
   }
}
