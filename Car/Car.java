
/**
 * Class Car - 
 * This class creates a basic representation of a racing car,
 * with a specific model and color, the model will decide the engine type and power. 
 * 
 * Low and medium power engines, models 0 and 1, will have the biggest chance
 * of finishing the race, but high and super high power engines, model 2 and 3,
 * will finish in better positions.
 * 
 * Invoking the method 'fullThrottle()' starts the race, which will calculate the
 * probability of successful race vs. engine explosion.
 * 
 * Example, write the following in OUWorkspace (execute line by line):
 * 
 * Car regularCar = new Car(0,OUColour.BLUE);
 * Car sportCar = new Car(1,OUColour.BLUE);
 * Car dragCar = new Car(2,OUColour.BLUE);
 * Car superCar = new Car(3,OUColour.BLACK);
 * 
 * regularCar.fullThrottle();
 * sportCar.fullThrottle();
 * dragCar.fullThrottle();
 * superCar.fullThrottle();
 * 
 * @author Michael Sjoeberg
 * @version 1.0
 */

import ou.*;
public class Car
{
   private int model;          // the numerical value for model of the car
   private OUColour colour;    // the colour of the car, using OUColour
   private Engine engine;      // the engine of the car, which can be customised

   /**
    * Constructor for objects of class Car
    */
   public Car(int aModel, OUColour aColour)
   {
      this.model = aModel;
      this.colour = aColour;
      
      // set the type and power of engine depending on model of car
      if (aModel == 1){ 
         this.engine = newEngine("Sport", 400);
      }
      else if (aModel == 2){ 
         this.engine = newEngine("Drag", 800);
      }
      else if (aModel == 3){ 
         this.engine = newEngine("Ion Thruster", 95000);
      }
      else {
         this.engine = newEngine("Regular", 100);
      }
   }
   
   /**
    * Create new engine based on the model
    */
   private Engine newEngine(String type, int power)
   {
      Engine newEngine = new Engine(type, power);
      return this.engine = newEngine;
   }
   
   /**
    * Returns the engine of the car.
    */
   public Engine getEngine()
   {
      return this.engine;
   }
   
   /**
    * Sets the model of the car to the value of the argument aModel.
    */
   public void setModel(int aModel)
   {
      this.model = aModel;
   }
   
   /**
    * Returns the model of the car.
    */
   public int getModel()
   {
      return this.model;
   }
   
   /**
    * Sets the colour of the car to the value of the argument aColour.
    */
   public void setColour(OUColour aColour)
   {
      this.colour = aColour;
   }
   
   /**
    * Returns the colour of the car.
    */
   public OUColour getColour()
   {
      return this.colour;
   }
   
   /**
    * Start the race!
    */
   public String fullThrottle()
   {
      return this.riskOfExplosion();
   }
   
   /**
    * Calculate the risk of engine explosion by randomising
    * a number and use conditions to simulate chance, then return the outcome.
    */
   private String riskOfExplosion()
   {
      double d = Math.random();
      int e = this.getEngine().getPower();
      
      if (e <= 200 && e > 0) {
         // low power, low risk of explosion
         if (d < 0.9) {
            return "You finished the race, slower than most...";
         }
         else {
            return "Oops, your low power engine exploded (what?!?).";
         }
      }
      if (e > 200 && e <= 400) {
         // medium power, medium risk of explosion
         if (d < 0.7) {
            return "You finished the race!";
         }
         else {
            return "Oops, your engine exploded.";
         }
      }
      if (e > 400 && e <= 800) {
         // high power, high risk of explosion
         if (d < 0.5) {
            return "You finished the race in top positions!";
         }
         else {
            return "Oops, your engine exploded.";
         }
      }
      if (e > 800 ) {
         // super high power, very high risk of explosion
         if (d < 0.2) {
            return "You finished the race faster than all!";
         }
         else {
            return "BOOM! Well, that was expected.";
         }
      }
      // if power is equal or less than 0
      return "Your car didn't start.";
   }
   
   /**
    * Returns a string representation of the car.
    */
   public String toString()
   {
      return this.getClass().getName() 
      + ": model " + this.getModel() + ", colour " + this.getColour() + ".\n" + this.getEngine() + ".";
   }
}
