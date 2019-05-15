import ou.*;
/**
 * The class Engine defines the type and power of the engine for class Car.
 *
 * @author Michael Sjoeberg
 * @version 1.0
 */

public class Engine
{
   /* Instance variables */
   private String type;           // sport, regular, drag, etc.
   private int power;           // 100, 400, 800, etc.

   /**
    * Constructor for objects of class Engine.
    */
   public Engine(String aType, int aPower)
   {
      this.type = aType;
      this.power = aPower;
   }
   
   /* Instance methods */    
   /**
    * Sets the type of the engine to the value of the argument aType.
    */
   public void setType(String aType)
   {
      this.type = aType;
   }

   /**
    * Returns the type of the engine.
    */
   public String getType()
   {
      return this.type;
   }

   /**
    * Sets the power of the engine to the value of the argument aPower.
    */
   public void setPower(int aPower)
   {
      this.power = aPower;
   }

   /**
    * Returns the power of the engine.
    */
   public int getPower()
   {
      return this.power;
   }

   /**
    * Returns a string representation of the engine.
    */
   public String toString()
   {
      return this.getClass().getName() 
      + ": type " + this.getType() + ", power " + this.getPower();
   }

}
